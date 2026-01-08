package com.klu.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
	
	public static void main(String[] args) {
		ApplicationContext    context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Car c= (Car)context.getBean("car");
		c.drive();
		
		Bike b =(Bike)context.getBean("bike");
		b.ride();
		
		
	}
}