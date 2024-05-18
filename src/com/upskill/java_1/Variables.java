package com.upskill.java_1;

public class Variables {
	
	public String country = "USA";
	public static String region = "North America";
	
	// Variables in Java
	
	// Instance Or global variable - variable declared in class level outside method
	// Local variable - variable declared in methods 
	// Static variable - variables belong to class and don't required creating object
	// Method parameter - variables used as method parameter
	
	public static void main(String[] args){
		ny("Kings");
		nj("Essex");
		ct("Fairfield");
		
		Variables myObj = new Variables ();
		System.out.println(myObj.country);
		
		System.out.println(region);
	}
	
	public static void ny(String county){
		String city = "Queens";
		System.out.println(city);
		System.out.println(county); 
	}
	
	public static void nj(String county){
		String city = "Bloomfield";
		System.out.println(city);
		System.out.println(county);
	}
	
	public static void ct(String county){
		String city = "Hartford";
		System.out.println(city);
		System.out.println(county);
	}

}
