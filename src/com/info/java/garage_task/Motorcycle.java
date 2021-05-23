package com.info.java.garage_task;

public class Motorcycle extends Vehicle {

	// attributes
	private String helmet;
	private String twoWheels;
	public Motorcycle() {
		super();
		
	}
	public Motorcycle(String name, String color, String model, double price, boolean willItDrive,
			boolean doesTheCarWork,String helmet, String twoWheels, String vehicleType) {
		super(name, color, model, price, willItDrive, doesTheCarWork, vehicleType);
		this.helmet = helmet;
		this.twoWheels = twoWheels;
		
	}
	public String getHelmet() {
		return helmet;
	}
	public void setHelmet(String helmet) {
		this.helmet = helmet;
	}
	public String getTwoWheels() {
		return twoWheels;
	}
	public void setTwoWheels(String twoWheels) {
		this.twoWheels = twoWheels;
	}
	
		
	
	public double getPrice() {
		double tax = super.getPrice() / 210 * 50;
		return super.getPrice() + tax;
	}
	
	
	
	
	
	

	// constructors
	

	

}
