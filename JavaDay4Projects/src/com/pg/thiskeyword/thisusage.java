package com.pg.thiskeyword;

public class thisusage {

	void show() {
		System.out.println(this);
	}
	public static void main(String[] args) {
		thisusage t = new thisusage();
		thisusage t1 = new thisusage();
		System.out.println(t);
		System.out.println("thisusage "+ " "+ t1);
		t.show();
	}
}
