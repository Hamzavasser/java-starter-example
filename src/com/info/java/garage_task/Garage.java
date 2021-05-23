package com.info.java.garage_task;

import java.util.ArrayList;
import java.util.List;

public class Garage extends Vehicle {

	// Attributes
	private String myGarage;

	// constructor
	public Garage(String myGarage) {
		super();
		this.myGarage = myGarage;
	}

	// methods
	List<Vehicle> joeGarage = new ArrayList<>();

	public void addVehicle(Vehicle type) {
		if (joeGarage == null) {
			joeGarage = new ArrayList<>();

		}
		joeGarage.add(type);
		System.out.println(type.getName() + "\s" + type.getModel() + " Vehicle is in the garage.");

	}
	public void removeJoeGarage(Vehicle type) {
		joeGarage.remove(type);
		System.out.println(type.getName() + "\s" + type.getModel() + " Vehicle is out the garage");
	}
	
	public void getJoeGarage() {
		for(int i = 0; i <joeGarage.size(); i++) {
			System.out.println(joeGarage.get(i).toString());
		}
		
	}
	public String getMyGarage() {
		return myGarage;
	}


	

}
