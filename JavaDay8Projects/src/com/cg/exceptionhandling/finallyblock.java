package com.cg.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class finallyblock {
	
	//throws keyword

	public static void main(String[] args) throws FileNotFoundException {
		int num =7;
		int num2 = 0;
		int result = 0;
		
		
		File file = new File("./sample.txt");
		FileInputStream fis = new FileInputStream(file);
		System.out.println(fis);
		try {
		result = num/num2;
		}
		catch(ArithmeticException a) {
			System.out.println(a.toString());
			
		//throw keyword
			throw a;
			
		}
		finally {
			System.out.println("block of expression");
		}
		System.out.println("output is "+result); 
		System.out.println("end of execution");
	}

}
