package com.upskill.java_5;

public class InterfaceImplementation implements Interface {

	@Override
	public void iDoor() {
		System.out.println("My car has 4 door");
		
		
	}

	@Override
	public int iWheel() {
		
		System.out.println("My car has 4 wheels");
		return 4;
	}

	@Override
	public void iSeat() {
		
		System.out.println("My car has 4 seat");
		
		
	}

	@Override
	public String icolor() {
		
		System.out.println("My car is Red ");
		return "Red";
	}

	

}
