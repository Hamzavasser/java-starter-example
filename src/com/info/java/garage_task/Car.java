package com.info.java.garage_task;

public class Car extends Vehicle {

	// attributes
	private int doors;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String name, String color, String model, double price, boolean willItDrive, boolean doesTheCarWork, int doors, String vehicleType) {
		super(name, color, model, price, willItDrive, doesTheCarWork, vehicleType);
		this.doors = doors;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	// constructors
	
	
	public double getPrice() {
		double tax = super.getPrice() / 150 * 50;
		return super.getPrice() + tax;
	}
	

	

}
