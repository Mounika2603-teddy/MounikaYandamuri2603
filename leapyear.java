package com.codegnan.fundamentals;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a year");
		int year=scanner.nextInt();
		boolean isleapyear=(year%4==0)&&(year%100!=0||year%400==0);
		String result=isleapyear?"leap year":"not a leap year";
		System.out.println(result);

	}

}
