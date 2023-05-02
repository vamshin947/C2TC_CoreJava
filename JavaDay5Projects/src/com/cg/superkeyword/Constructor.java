package com.cg.superkeyword;

class animalll{
	animalll(){
		System.out.println("in animal constructor");
	}
}

class doggg extends animalll{
	doggg(){
		super();
		System.out.println("in doggg constructor");
	}
}

public class Constructor {

	public static void main(String[] args) {
		doggg d = new doggg();

	} 

}
