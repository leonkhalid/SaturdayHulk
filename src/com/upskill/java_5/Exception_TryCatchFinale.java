package com.upskill.java_5;

import com.upskill.java_6.myException;

public class Exception_TryCatchFinale {
	
	public static void main(String[] args) {
		
	try {
		int[] ageHulk = new int[] {30, 28, 27, 26, 30};
		System.out.println("Student age = " + ageHulk[8]);
	}
	
	catch (Exception e) {
			e.printStackTrace();
			System.out.println("Array Method Comleted");
		}


	try {
		int num = Integer.parseInt("five");
		System.out.println("num");
	
	}
	catch (NumberFormatException e) {
		e.printStackTrace();
		System.out.println("Parsed Int from String complete");
	}
	
	try {
		
		throw new myException("Test");
	} 
		catch (myException e) {
			e.printStackTrace();
			System.out.println("This is User-Defind Exceptions Method !");
	}
	
	finally {
		System.out.println("Test Comleted");
	}
	
  }
}
