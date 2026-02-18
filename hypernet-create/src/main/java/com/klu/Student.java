package com.klu;
import javax.persistence.*;
@Entity
@Table(name="student") // here existing name table will be created
public class Student {
  @Id //this is considered as a primary key
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int id;
  private String name;
  
  public Student()
  {
    System.out.print(name);
  }
  public Student(String name)
  {
    this.name=name;
  }
 

}