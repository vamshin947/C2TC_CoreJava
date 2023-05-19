package com.cg.MultipleInheritance;

interface v
{
	public abstract void execute1();
}
interface i
{
	public abstract void execute2();
}

class e implements v,i
{
	public void execute1() {
		System.out.println("hi... i am varun");
	}
	public void execute2() {
		System.out.println("hi... i am vinay");
	}
}
public class multiple {

	public static void main(String[] args) {
		e obj = new e();
		obj.execute1();
		obj.execute2();

	}

}
