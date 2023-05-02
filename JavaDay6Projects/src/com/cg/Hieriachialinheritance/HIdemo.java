package com.cg.Hieriachialinheritance;

class Animal{
	void eat() {
		System.out.println("Eating");
	}
}
class dog extends Animal{
	void bark() {
		System.out.println("Barking");
		
	}
}

class cat extends Animal{
	void meow() {
		System.out.println("meowing");
	}
}

public class HIdemo {

	public static void main(String[] args) {
		dog d = new dog();
		d.bark();
		d.eat();
	cat c = new cat();
	c.eat();
	c.meow();
	
	Animal a = new dog();
	a.eat();
	}

}
