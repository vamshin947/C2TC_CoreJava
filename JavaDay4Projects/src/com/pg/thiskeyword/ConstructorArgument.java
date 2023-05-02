package com.pg.thiskeyword;

class check{
	check() {
		System.out.println("in check constructor");
	}
	void display() {
		System.out.println("in display constructor");
	}
}

class practice{
	practice(){
		System.out.println("in practice constructor");
	}
	
}
class student{
	student(){
		check c = new check();
		System.out.println("in student constructor");
	}
}
public class ConstructorArgument {

	public static void main(String[] args) {
		practice p1 = new practice();
		student s1 = new student();

	}

}
