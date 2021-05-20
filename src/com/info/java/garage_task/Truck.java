package com.info.java.garage_task;

public class Truck extends Vehicle {
	//attributes
	private String truckBed;
	private String sunRoof;
	
	
	
	//constructors
	public Truck(String truckBed, String sunRoof, String name, String color, String model) {
		super(name, color, model);
		this.truckBed = truckBed;
		this.sunRoof = sunRoof;
	}

//methods

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
	

	
	
	

	
	
}
