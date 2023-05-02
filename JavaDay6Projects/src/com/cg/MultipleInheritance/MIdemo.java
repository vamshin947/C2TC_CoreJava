package com.cg.MultipleInheritance;

class father{
	void trekking() {
		System.out.println(" yes, i have gone for trekking");
	}
}
class mother{
	void trekking() {
		System.out.println("yes, i too gone for trekking");
	}
}
class son extends father{
	
	
}
public class MIdemo {

	public static void main(String[] args) {
		son s = new son();
		s.trekking();

	}

}
