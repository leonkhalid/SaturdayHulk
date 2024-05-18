package com.upskill.java_4;

public class Encapsulation {
	
	
	// Encapsulation used to hide the data using setter and getter method 
	
	private String name = "upskill";
	private int ssn = 01712657075;
	private String username = "khalidhossain";
	
	// Setter Method - name
	public void setName(String value) {
		name = value;
	}
	
	//Getter Method - name
	public String getName() {
		return name;
	}
	
	//Setter Method - ssn
	public void setSSN(int value) {
		ssn = value;
	}
	
	//Getter Method - username
	public String getUserName() {
		return username;
	}
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		
		obj.setName("Muazzam601");
		
		System.out.println(obj.getName());
		
		obj.setSSN(999999);
		
		System.out.println(obj.getUserName());
		
	}

}
