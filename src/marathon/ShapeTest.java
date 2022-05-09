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
		System.out.println("Birinci kenar� giriniz: ");
		firstSide = scan.nextInt();
		if (firstSide == -1 || firstSide == 0) {
			System.out.println("��k�� yapt�n�z");
			break;
		 }
		else {
			System.out.println("�kinci kenar� giriniz: ");
			secondSide = scan.nextInt();
			 if(secondSide == -1 || secondSide == 0) {
			 System.out.println("��k�� yapt�n�z");
			 break;
			 }
			 else {
				 System.out.println("���nc� kenar� giriniz: ");
				 thirdSide = scan.nextInt();
				 if (thirdSide == -1) {
					System.out.println("��k�� yapt�n�z");
					break;
				 }
				 else if (thirdSide ==0) {
					 System.out.println("�ki Kenarl� �ekil olmaz ");
				 }
				 else {
					 System.out.println("D�rd�nc� kenar� giriniz: ");
					 fourthSide = scan.nextInt();
					 	if (fourthSide == -1) {
					 		System.out.println("��k�� yapt�n�z");
					 		break;
					 	}
					 	else if (fourthSide == 0) {
					 		perimeter = firstSide + secondSide + thirdSide;
					 		area = (double)(firstSide*secondSide)/2;   //Dik a��l� ��gen olarak kabul ettim.
					 		System.out.println(" Alan: " + area + " �evre: " + perimeter);
					 	}
					 	else {
					 		perimeter = firstSide + secondSide + thirdSide + fourthSide;
					 		area = firstSide * secondSide;
					 		System.out.println(" Alan: " + area + " �evre: " + perimeter);
					 		System.out.println();
					 	}
				 }
			 }
		}
		
	}
	}
}
