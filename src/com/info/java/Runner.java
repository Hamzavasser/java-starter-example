package com.info.java;

import com.infosys.starterworld.Book;

public class Runner {
	public static void main(String[] args) { 
		
		Person x = new Person("Joseph", "Male", 32);
		Person y = new Person("Michael", "Male", 45);
		
		Book example = new Book("Think and Grow Rich", "First Edition", 250);
		
		//System.out.println("Hello Infosys");
		//System.out.println(x.name);
		
		y.speak("Hello Infosys.");
		x.speak("I am a fantastic Java Programmer and I love learning new codes.");
		
		y.read(example);
	}
	
	
	
}
