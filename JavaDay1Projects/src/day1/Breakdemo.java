package day1;

public class Breakdemo {

	public static void main(String[] args) {
		int [] numbers = {10, 20, 30, 40, 50};
		for (int x : numbers) {
			if (x == 30) {
				break;
			}
			System.out.println(x);
		
		
		}//Example 2 
		for (int i =1;i<20;i++) {
			if (i==5)
			{
				break;
			}
			System.out.println(i);
		}
	}
}  