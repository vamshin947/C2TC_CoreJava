import java.util.Scanner;
public class Scannerdemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the details:");
		
		String name = sc.nextLine();
		
		char gender = sc.next().charAt(0);
		
		int age = sc.nextInt();
		double mobileno = sc.nextDouble();
		float cgpa = sc.nextFloat();
		
		System.out.println("name:" +name);
		System.out.println("gender:" +gender);
		System.out.println("age:" +age);
		System.out.println("mobileno:" +mobileno);
		System.out.println("cgpa:" +cgpa);
	}
}