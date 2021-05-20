package com.info.java.garage_task;

public class Vehicle {
//attributes
	
	private String name;
	private String color;
	private String model;
	private boolean willItDrive;
	private boolean doesTheCarWork;
	
	
	public Vehicle() {
	
		
	}
//constructors
	public Vehicle(String name, String color, String model) {
		super();
		this.name = name;
		this.color = color;
		this.model = model;
		this.willItDrive = false;
		this.doesTheCarWork = true;
	}
	
//methods 
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
	
	public void drive() {
		this.willItDrive = true;
		
	}
	
	public void work( ) {
		this.doesTheCarWork = false;
		
	}
	
	public void horn(String bigTruckBed) {
		System.out.println("Can it drive?");
		
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
	
	
	

}
