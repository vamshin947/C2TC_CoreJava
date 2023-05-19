package com.cg.exceptionhandling;

public class FinalException {

	public static void main(String[] args) {
		try {
			int [] arr = {1,2};
			//System.out.println(arr[2]/0);
			
			System.out.println("program is running successfully");
			System.exit(0);
			//when ever we use System.exit that could be where ever in the program
			//from there the thread will be destroyed and from there the next lines will not be executed.
		}finally {
			System.out.println();
		}

	}

}
