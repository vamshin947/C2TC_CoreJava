package com.pg.accessone;
//private access modifier
public class Testfour {
	private int rollno = 25;
	
	private void student1() {
		rollno = 111;
	}
	
	private void printrollnumber1() {
		System.out.println(rollno);
	}
	public static void main(String args[]) {
		Testfour tf = new Testfour();
	}
	public void test() {
		printrollnumber1();
	}
}
