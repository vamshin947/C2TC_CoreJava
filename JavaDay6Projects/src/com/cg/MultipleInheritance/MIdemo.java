package com.cg.MultipleInheritance;

class a{
	public void execute() {
		System.out.println("hi.. Exceuting from class A");
	}
}
	class b {
		public void execute() {
			System.out.println("hi... Executing from class B");
		}
	}

class c extends a, b
{
	// here we get error because multiple inheritance is not supported in java and we can see
	// error in class c because it is confused to call the execute from class A or class B.
}
public class MIdemo
{
	public static void main(String args[]) {
		 c obj = new c();
		obj.execute();
	}
}