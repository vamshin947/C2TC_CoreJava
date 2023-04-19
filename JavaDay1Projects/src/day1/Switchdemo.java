package day1;

public class Switchdemo {

	public static void main(String[] args) {
		int month = 3;
		String monthStr = "";
		switch(month) {
		case 1 : monthStr = "1-january";
		break;
		case 2 : monthStr = "2-February";
		break;
		case 3 : monthStr = "3-March";
		break;
		case 4 : monthStr = "4-April";
		break;
		case 5 : monthStr = "5-may";
		break;
		case 6 : monthStr = "6-june";
		break;
		case 7 : monthStr = "7-july";
		break;
		case 8 : monthStr = "8-August";
		break;
		case 9 : monthStr = "9-september";
		break;
		case 10 : monthStr = "10-October";
		break;
		
		}
		System.out.println(monthStr);
	}

}
