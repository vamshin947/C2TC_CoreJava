package com.pg.accessone;
// protected access modifier
public class Testthree {
	protected int rollno = 1;
	
	
	protected Testthree() {
		rollno= 2;
	}
	protected void printnumber() {
		System.out.println(rollno);
	}

	public static void main(String[] args) {
		Testthree t = new Testthree();
	

	}
	public void vam() {
		printnumber();
	}
}
