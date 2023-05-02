package com.pg.thiskeyword;


class demo{
	demo(){
		System.out.println("user defined no argument demo constructor");
	}
	demo(int x){
		this();
		System.out.println(x);
	}
	demo(int x, int y){
		this(3);
		System.out.println(x+" "+y);
	}
}

public class Constructor {

	public static void main(String[] args) {
		demo d = new demo(5,10);
		

	}

}
