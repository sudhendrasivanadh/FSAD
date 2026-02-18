package com.klu.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.klu.demo.Model.CourseRegistration;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContex.xml");

        CourseRegistration cr =(CourseRegistration) context.getBean("CourseReg");

        cr.display();
    }
}