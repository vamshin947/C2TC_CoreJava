package day1;

public class Nestedifelsedemo {

	public static void main(String[] args) {
		int a =10, b =20;
		if (a==10)
		{
			if (b!=20) {
				System.out.println("java language");
			}
			else {
				System.out.println("not java language");
			}
		}
		
		
		int    c=30, d=60, e=50;
		if(c<=30) {
			System.out.println(c);
			if (d!=40) {
				System.out.println("the entered value exceeding the range");
				if (e==50) {
					System.out.println("the value is " + e);
				}
			}
		}
		else 
		System.out.println(e);
		}
	}
