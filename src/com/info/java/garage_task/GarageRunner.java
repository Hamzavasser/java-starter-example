package com.info.java.garage_task;
import java.util.ArrayList;

public class GarageRunner {

	public static void main(String[] args) {
		// Truck pickUp = new Truck("Ford", "Blue", "Taurus");
		Car car = new Car("Honda", "Blue", "Civic");
		Vehicle car2 = new Car();
		Truck four = new Truck("Yes", "Yeah it has a sunroof", "Lexus", "Red", "Acura");

		// pickUp.horn("What is your question");

		// System.out.println("Name: " + pickUp.getName());
		System.out.println("Name:" + car.isDoesTheCarWork());
		System.out.println("Name:" + four.isWillItDrive());

	}
	public String[] myCars = {"1", "2", "3", "4", "5"};
	
	  
	

}
