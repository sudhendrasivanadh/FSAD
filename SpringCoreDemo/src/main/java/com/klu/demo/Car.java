package com.klu.demo;

public class Car {
	
	private Engine engine;
	
	public Car() {
	}
	public Car(Engine eng) {
		this.engine=eng;
	}
	public void drive() {
		engine.start();
		System.out.println("car is moving ");
	}
}