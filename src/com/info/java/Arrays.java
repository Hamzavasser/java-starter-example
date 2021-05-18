package com.info.java;

public class Arrays {
	
	//Create an array that will hold 10 integer values, populate the array with values, then call and output each element.
	
	//Create a for loop that populates an integer array with values, outputting them at each iteration.
	//Then create another loop that iterates through the array, 
	//changing the values at each point to equal itself times 10, outputting them at each iteration.
	public static void main(String[] args) {
		int[] myTen;
		myTen = new int[10];
		
		myTen[0] = 10;
		myTen[1] = 20;
		myTen[2] = 30;
		myTen[3] = 40;
		myTen[4] = 50;
		myTen[5] = 60;
		myTen[6] = 70;
		myTen[7] = 80;
		myTen[8] = 90;
		myTen[9] = 100;
		
		int total = myTen[0];
		
		System.out.println(myTen[0]);
		System.out.println(myTen[1]);
		System.out.println(myTen[2]);
		System.out.println(myTen[3]);
		System.out.println(myTen[4]);
		System.out.println(myTen[5]);
		System.out.println(myTen[6]);
		System.out.println(myTen[7]);
		System.out.println(myTen[8]);
		System.out.println(myTen[9]);
		
	} 


}
