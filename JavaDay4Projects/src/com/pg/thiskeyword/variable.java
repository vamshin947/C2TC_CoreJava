package com.pg.thiskeyword;

public class variable {
	
	int id;
	String name;
	float fee;
	
	public variable(int id, String name,float fee) {
		this.id = id;
		this.name = name;
		this.fee = fee;
		
	}
	
	void display() {
		System.out.println(id+ " "+name+" "+fee);
	}
	
	public static void main(String[] args) {
		variable v = new variable(1, "vishwak",50000.00f);
		v.display();

	}

}
