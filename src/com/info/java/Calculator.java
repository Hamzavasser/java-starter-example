package com.info.java;

public class Calculator {
	public static void main(String[] args) {
		int result;
		result = add(4, 8);
		System.out.println(result);
		
		int tract;
		tract = sub(4, 3);
		System.out.println(tract);
		
		int divs;
		divs = divi(24, 2);
		System.out.println(divs);
		
		int multipli;
		multipli = mult(2, 8);
		System.out.println(multipli);
		
	}
	
	public static int add(int math1, int math2) {
		return math1 + math2;
	}
	
	public static int sub(int take1, int take2) {
		return take1 - take2;
	}
	
	public static int divi(int div1, int div2) {
		return div1 / div2;
	}
	
	public static int mult(int mul1, int mul2) {
		return mul1 * mul2;
	}
	

	
}


