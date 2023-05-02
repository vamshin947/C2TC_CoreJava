package com.cg.superkeyword;

class animall{
	void eat() {
		System.out.println("drinking....");
	}
}
	class catt extends animal{
		void eat()
		{
			System.out.println("drinking milk......");
		}
	}


public class demo {
	
	public static void main(String args[]) {
		catt c = new catt();
		c.eat();
		
	}

}
