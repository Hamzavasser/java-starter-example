package com.info.java.garage_task;

public class Vehicle {
//attributes

	private String name;
	private String color;
	private String model;
	private double price;
	private boolean willItDrive;
	private boolean doesTheCarWork;
	protected String vehicleType;

	public Vehicle() {
		super();
		this.name = "generic";
		this.color = "Blue";
		this.model = "generic Vehicle";
		this.price = 3000.00;
		this.willItDrive = false;
		this.doesTheCarWork = false;
		this.vehicleType = "generic car";
				

	}

//constructors
	public Vehicle(String name, String color, String model, double price, boolean willItDrive, boolean doesTheCarWork, String vehicleType) {
		super();
		this.name = name;
		this.color = color;
		this.model = model;
		this.price = price;
		this.willItDrive = willItDrive;
		this.doesTheCarWork = doesTheCarWork;
		this.vehicleType = vehicleType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isWillItDrive() {
		return willItDrive;
	}

	public void setWillItDrive(boolean willItDrive) {
		this.willItDrive = willItDrive;
	}

	public boolean isDoesTheCarWork() {
		return doesTheCarWork;
	}

	public void setDoesTheCarWork(boolean doesTheCarWork) {
		this.doesTheCarWork = doesTheCarWork;
	}
	public String getvehicleType() {
		return vehicleType;
	}
	public void setvehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "Vehicle name=" + name + ", color=" + color + ", model=" + model + ", price=" + getPrice() + ", willItDrive="
				+ willItDrive + ", doesTheCarWork=" + doesTheCarWork;
	}

//methods 
	

}
