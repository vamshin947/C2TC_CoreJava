package com.cg.exceptionhandling;

public class Exceptionexample {

	public static void main(String[] args) throws Exception{
		
		try {
			System.out.println(1/0);
		}catch(ArithmeticException e){
			throw new ArithmeticException("dont divide with the number zero");
		}

	}

}
