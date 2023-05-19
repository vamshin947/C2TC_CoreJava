package com.cg.exceptionhandling;

import java.util.Arrays;

public class TryandCatchblockk {

	public static void main(String[] args) {
		System.out.println("start of the program");
		
		int fnum = 9;
		int snum = 0;
		int result = 0;
		try {
		result = fnum/snum;
		}
		catch(ArithmeticException ae) {
			System.out.println(ae.toString());
			System.out.println(ae.getMessage());
			System.out.println(Arrays.toString(ae.getStackTrace()));
			
		}
		
		
		System.out.println("output is "+ result);
		System.out.println("end of execution");
	}

}
