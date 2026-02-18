package com.klu;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class Mainapp {
  public static void main(String[] args) {
    // Load configuration & crate sessionfactory
    //SessionFcatory is for auto recongination and pushing that into the table and remaing will check the database connections and required packages or their or not etc
    SessionFactory factory=new Configuration().configure().buildSessionFactory(); //for connecton,  and it automatically will check the connection
    //open session
    Session session=factory.openSession();
    //begin a transaction
    Transaction tx=session.beginTransaction();
    //create object
    Student s=new Student("Abhinai");
    //save object
    session.save(s);
    //commit
    tx.commit();
    //close the resources
    session.close();
    factory.close();
    System.out.println("Data have been inserted successfull");
    
  }

}