package day1;

public class Continuedemo {

	public static void main(String[] args) {
		for (int i = 0;i< 10;i++) {
			if (i==5) {
				continue;
			}
			System.out.println(i);
		}//Example2
for (int i =0;i<3;i++) {
	for (int j =0;j<4;j++) {
		if (i==1 && j == 2) {
			continue;
		}
		System.out.println(i +""+ j);
	}
}
	}
}


