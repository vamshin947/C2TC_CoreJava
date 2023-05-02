package com.pg.thiskeyword;

class test{
	void show (test b) {
		System.out.println("in show method");
	}
	void display(test a) {
		show(this);
		System.out.println("in display method");
	}

}


public class Methodargument {

	public static void main(String[] args) {
		test t1 = new test();
		test t2 = new test();
		t1.display(t2);

	}

}
