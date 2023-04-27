package com.pg.accessmodifiers;


// public access modifier
public class Testone {
	public int rollno = 41;
	
	
	public Testone () {
		rollno = 101;
	}
	public void printrollnumber() {
		System.out.println(rollno);
	}
	
	
	public void abc() {
		printrollnumber();
		System.out.println(rollno); 
		
	}
	public static void main() {
		Testone to = new Testone();
		}
}
