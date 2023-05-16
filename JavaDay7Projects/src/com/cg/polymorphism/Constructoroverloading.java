package com.cg.polymorphism;

class Constructoroverloading {
	int value1;
	int value2;
	Constructoroverloading(){
		value1 =1;
		value2 = 2;
		System.out.println("inside parent 1 constructor");
	}
	
	Constructoroverloading(int a){
		value1 = a;
		System.out.println("inside parent 2 constructor");
	}
	public void display() {
		System.out.println("value1=="+ value1);
		System.out.println("value 2=="+ value2);
	}
	
	public static void main(String[] args) {
		Constructoroverloading c1 = new Constructoroverloading();
		c1.display();
		Constructoroverloading1 c2  = new Constructoroverloading1();
		c2.display();

	}

}
class Constructoroverloading1 extends Constructoroverloading{
	int value3;
	int value4;
	Constructoroverloading1(){
		value3 = 3;
		value4 = 4;
		System.out.println("inside the child constructor");
	}
	
	public void display() {
		System.out.println("value1=" +value1);
		System.out.println("value2=" +value2);
		System.out.println("value1=" +value3);
		System.out.println("value2=" +value4);
		
	}
}