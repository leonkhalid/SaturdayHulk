package com.upskill.java_6;

public class MultiThreading {
	
	public static void main(String[] args) {
		
		int n = 10;
		
		
		for (int i = 0; i < n; i++) {
			MultithreadingThread obj = new MultithreadingThread();
			obj.start();
			
			Thread obj2 = new Thread(new MultithreadingRunable());
			obj2.start();
		}
		
	}

}
