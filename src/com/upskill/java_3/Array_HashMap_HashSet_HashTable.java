package com.upskill.java_3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.HashSet;

public class Array_HashMap_HashSet_HashTable {
	
	public static void main(String[] args) {
		
		int age = 25;
		int[] ageHulk = new int [] {25, 30, 35, 38, 43, 28};
		System.out.println("Student Age : " + ageHulk[3]);
		System.out.println("Total Student : " + ageHulk.length);
		
		
		String[] nameHulk = new String []{"Bashar", "Khalid", "Sourov", "Moazzem", "Sana", "Saima"};
		System.out.println("Student Name : " + nameHulk[3]);
		System.out.println("Total Student : " + nameHulk.length);
		
		int[][] ageHulk2D = {{25, 30, 35, 38, 43, 28},
							 {23, 32, 38, 27}};
		System.out.println("Student Age 2D : " + ageHulk2D[1][3]);
		
		HashMap<String, Integer> Student = new HashMap<String, Integer>();
		
		Student.put("Redwan", 27);
		Student.put("Sana", 31);
		Student.put("Saima", 38);
		Student.put("Muazzem", 24);
		
		System.out.println("HashMap Student Age : " + Student.get("Sana"));
		
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("USA", "Washington DC");
		Capital.put("Bangladesh", "Dhaka");
		Capital.put("Pakisthan", "Islamabad");
		Capital.put("India", "Delhi");
		
		System.out.println("HashMap Capital city : " + Capital.get("Bangladesh"));
		
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
		
		Region.put("Bangladesh", "Asia");
		Region.put("USA", "America");
		
		System.out.println("Region : " + Region.get("Bangladesh"));
		
		HashSet<String>  Car = new HashSet<String>();
		
		Car.add("Audi");
		Car.add("BMW");
		Car.add("Tesla");
		
		System.out.println("Car : " + Car);
		
		
		}
	}


