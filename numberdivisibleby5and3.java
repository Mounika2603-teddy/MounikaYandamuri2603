package com.codegnan.fundamentals;

import java.util.Scanner;

public class numberdivisibleby5and3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number:");
		int num=scanner.nextInt();
		String result=(num%5==0 && num%3==0)?"divisible by 5 and 3":"not divisible by 5 and 3";
		System.out.println( result);
	}

}
