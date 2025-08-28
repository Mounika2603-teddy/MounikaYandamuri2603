package com.codegnan.fundamentals;

import java.util.Scanner;

public class positiveornegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number:");
		int number=scanner.nextInt();
		String result=(number>=0)?"positive":"negative";
		System.out.println(result);
	}

}
