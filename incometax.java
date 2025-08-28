package com.codegnan.fundamentals;

import java.util.Scanner;

public class incometax {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter incometax :");
		double income = scanner.nextDouble();
		double tax =(income<=300000)?income*0.05:(income<=1000000)?income*0.10:income*0.15;
		tax=(income>2000000)?tax*0.99:tax;
		System.out.println("total tax : "+tax);
		scanner.close();

	}

}
