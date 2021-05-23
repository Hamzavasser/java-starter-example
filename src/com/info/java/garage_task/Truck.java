package com.info.java.garage_task;

public class Truck extends Vehicle {
	// attributes
	private String truckBed;
	private String sunRoof;
	public Truck() {
		super();
		
	}
	public Truck(String name, String color, String model, double price, boolean willItDrive, boolean doesTheCarWork, String truckBed, String sunRoof, String vehicleType) {
		super(name, color, model, price, willItDrive, doesTheCarWork, vehicleType);
		this.truckBed = truckBed;
		this.sunRoof = sunRoof;
	
	}
	public String getTruckBed() {
		return truckBed;
	}
	public void setTruckBed(String truckBed) {
		this.truckBed = truckBed;
	}
	public String getSunRoof() {
		return sunRoof;
	}
	public void setSunRoof(String sunRoof) {
		this.sunRoof = sunRoof;
	}

	// constructors
	
	public double price() {
		double tax = super.getPrice() / 130 * 90;
		return super.getPrice() + tax;
	}

//methods

	

}
