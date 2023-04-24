import java.util.Scanner;

public class Taxcalculation {

	public static void main(String[] args) {
		double tax = 0,it;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount:");
		it= sc.nextDouble();
		if (it<=200000)
		{
			tax=0;
		}
		else if (it<=300000)
		{
			tax =0.1*(it-200000);
		}
		else if (it<=400000)
		{
			tax = (0.2*(it-300000)+(0.1*100000));
		}
		else
		{
			tax = (0.3*(it-400000)+(0.2*200000)+(0.1*100000));
		}
		System.out.println("income tax:"+tax);
	}

}
