package com.info.java.garage_task;


public class GarageRunner {

	public static void main(String[] args) {
		Motorcycle a = new Motorcycle("Harley Davidson", "Red", "Cruiser", 6000.00, true, false, "Yellow Helmet", "2 Wheels", "Motorcycle");
		Truck b = new Truck("Suzuki", "Blue", "GSX-R", 10000.00, true, true, "Big", "Of Course", "Truck");
		Car c = new Car("Honda", "Black", "Accord", 45000.00, false, false, 4, "Sedan");
		
		Garage joeGarage = new Garage("Joe Garage");
		System.out.println("Welcome to: " + joeGarage.getMyGarage());
		System.out.println();
		
		joeGarage.addVehicle(a);
		joeGarage.addVehicle(b);
		joeGarage.addVehicle(c);
		
		System.out.println();
		joeGarage.getJoeGarage();
		System.out.println();
		
		joeGarage.removeJoeGarage(a);
		System.out.println();
		joeGarage.getJoeGarage();
		
		

	}

	
	  
	

}
