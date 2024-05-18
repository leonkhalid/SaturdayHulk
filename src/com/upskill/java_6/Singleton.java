package com.upskill.java_6;

public class Singleton {
	
	private Singleton() {

}
	private static Singleton singletonObj = new Singleton();
	
	public static Singleton getInstance() {
		return singletonObj;
	}
	
	protected static void demo() {
		System.out.println("Demo method for singletone class");
	}
	
	protected static void demo2() {
		System.out.println("Demo 2 method for singletone class");
	}
	
	protected static void demo3() {
		System.out.println("Demo 3 method for singletone class");
	}
	
}
