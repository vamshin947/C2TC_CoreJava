package com.cg.exceptionhandling;

public class SampleProgram {

	public static void main(String[] args) {
		System.out.println("start of program");
		int frstnumber = 5;
		int scndnumber = 0;
		int result;
		
		
		/* here complier throws an exception here in the execution part of the division since it 
		is the impossible task to complete.
		
		 Exception is an event that occurs during the execution of a program that disrupts the 
		flow of instruction
		
		
		Stack Race
		
		Exception Name -	java.lang.ArithmeticException
		Exception Message-	by zero
		line Number-		26
		*/
		
		result = frstnumber/scndnumber;
		System.out.println("the value is "+result);
		System.out.println("end of program");
	}

}
