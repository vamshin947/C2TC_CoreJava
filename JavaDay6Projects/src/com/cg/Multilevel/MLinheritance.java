package com.cg.Multilevel;

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
class puppy extends dog{
	void play() {
		System.out.println("playing");
	}
}

public class MLinheritance {

	public static void main(String[] args) {
		puppy p = new puppy();
		p.bark();
		p.eat();
		p.play();
		 
		dog d = new puppy();
		d.bark();
		d.eat();
		
		dog d1 = new dog();
		d1.bark();
		d1.eat();
		
		Animal a = new Animal();
		a.eat();

	}

}
