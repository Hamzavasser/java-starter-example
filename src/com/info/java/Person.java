package com.info.java;

import com.infosys.starterworld.Book;

public class Person { 
	//attributes//
	public String name;
	public String gender;
	public int age;
	
	public Person(String name, String gender, int age) {
		//constructors//
		this.name = name;
		this.gender = gender;
		this.age = age;
		//System.out.println(this.name);
	}
	//method//
	
	public void speak(String msg) {
	System.out.println(this.name + " say: " + msg);
		
	}
	
	public void read(Book item) {
		item.open();
		System.out.println(this.name + " reads the book titled: " + item.title);
	}


	
	
}
