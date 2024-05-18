package com.upskill.java_1;

public class MethodTypes {
	
	/* Types of Methods
	 	
	 	1. Void Method
	 	2. Static Method
	 	3. Return Type Method
	 */
	
	public static int hourlyIncome = 65;

	public static void main(String[] args) {
		
		MethodTypes obj = new MethodTypes();
		obj.annualIncomeVoid();
		
		System.out.println(" My Monthly Income = " + obj.monthlyIncomeReturn());
		
		weeklyIncomeStatic();
		rain();
		
	}
	
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println(" My Annual Income = " + calculateAnnualIncome);
		
	}
	
	public int monthlyIncomeReturn() {
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
	
	public static void weeklyIncomeStatic() {
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println(" My Weekly Income = " + calculateWeeklyIncome);
	
	}
	
	public static boolean rain() {
		boolean isRain = false;
		System.out.println(" It will Rain : " + isRain);
		return isRain;
	}
	

}
