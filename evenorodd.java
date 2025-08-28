package com.codegnan.fundamentals;

import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int num=scanner.nextInt();
		String result=num%2==0?"even":"odd";
		System.out.println(result);


	}

}
