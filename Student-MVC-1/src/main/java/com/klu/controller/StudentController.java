package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klu.model.Student;
import com.klu.service.StudenService;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudenService service;

    @GetMapping("/greet")
    public String getWelcomeMessage() {
        return service.getWelcomeMessage();
    }

    @PostMapping("/student/add")
    public Student createStudent(@RequestBody Student student) {
        System.out.println(student.getName());
        return service.createStudent(student);
    }


    @GetMapping("/student/getid/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        return service.getStudentById(id);
    }

    @GetMapping("/student/getall")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @PutMapping("/student/update/{id}")
    public Student updateStudent(@PathVariable("id") int id, @RequestBody Student student) {
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/student/delete/{id}")
    public String deleteStudent(@PathVariable("id") int id) {
        return service.deleteStudent(id);
    }

    @GetMapping("/student/search")
    public List<Student> searchStudent(@RequestParam("name") String name,
                                       @RequestParam("course") String course) {
        return service.searchStudent(name, course);
    }
}