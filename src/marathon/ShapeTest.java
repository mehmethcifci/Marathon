package marathon;

import java.util.Scanner;

public class ShapeTest {
	Scanner scan = new Scanner(System.in);
	int firstSide;
	int secondSide;
	int thirdSide;
	int fourthSide;
	int perimeter;
	double area;
	
	
	
	public void readInput() {
		while (true) {
		System.out.println("Birinci kenarý giriniz: ");
		firstSide = scan.nextInt();
		if (firstSide == -1 || firstSide == 0) {
			System.out.println("Çýkýþ yaptýnýz");
			break;
		 }
		else {
			System.out.println("Ýkinci kenarý giriniz: ");
			secondSide = scan.nextInt();
			 if(secondSide == -1 || secondSide == 0) {
			 System.out.println("Çýkýþ yaptýnýz");
			 break;
			 }
			 else {
				 System.out.println("Üçüncü kenarý giriniz: ");
				 thirdSide = scan.nextInt();
				 if (thirdSide == -1) {
					System.out.println("Çýkýþ yaptýnýz");
					break;
				 }
				 else if (thirdSide ==0) {
					 System.out.println("Ýki Kenarlý Þekil olmaz ");
				 }
				 else {
					 System.out.println("Dördüncü kenarý giriniz: ");
					 fourthSide = scan.nextInt();
					 	if (fourthSide == -1) {
					 		System.out.println("Çýkýþ yaptýnýz");
					 		break;
					 	}
					 	else if (fourthSide == 0) {
					 		perimeter = firstSide + secondSide + thirdSide;
					 		area = (double)(firstSide*secondSide)/2;   //Dik açýlý üçgen olarak kabul ettim.
					 		System.out.println(" Alan: " + area + " Çevre: " + perimeter);
					 	}
					 	else {
					 		perimeter = firstSide + secondSide + thirdSide + fourthSide;
					 		area = firstSide * secondSide;
					 		System.out.println(" Alan: " + area + " Çevre: " + perimeter);
					 		System.out.println();
					 	}
				 }
			 }
		}
		
	}
	}
}
