package com.codegnan.fundamentals;

import java.util.Scanner;

public class greatestof2number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first number:");
		int a=scanner.nextInt();
		System.out.println("enter second number:");
		int b=scanner.nextInt();
		int max = (a>b)?a:b;
		System.out.println("greatestnumber is:"+max);

	}

}
