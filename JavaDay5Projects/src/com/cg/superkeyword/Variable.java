package com.cg.superkeyword;

class animal{
	String color = "red";
}
class cat extends animal{
	String color = "white";
	void print() {
		System.out.println(color);
		System.out.println(super.color); 
		}
}
class kitty extends cat{
	String color = "brown";
	void print() {
		System.out.println(color);
	System.out.println(super.color);	
	}
}

public class Variable {

	public static void main(String[] args) {
		kitty k1 = new kitty();
		k1.print();
	}
}
