package com.codegnan.fundamentals;

import java.util.Scanner;

public class TaxiFare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter distance travelled in km:");
		double distance = scanner.nextDouble();
		double fare = (distance<=2)?50:(distance<=10)?(50+(distance-2)*15):(50+(8*15)+(distance-10)*10);
		fare=(distance>20)?fare*0.95:fare;
		System.out.println("total fare = rupees"+fare);
		scanner.close();
	}

}
