package com.cg.statickeyword;

class Student{
	int rollno;
	String name;
	static String Collegename = "abc";
	
	
	static void change() {
		Collegename = "gitam";
	}
	
	Student (int r, String n){
		rollno= r;
		name = n;
	}
	void display() {
		System.out.println(rollno+ " "+ name+" "+Collegename);
	}
}

