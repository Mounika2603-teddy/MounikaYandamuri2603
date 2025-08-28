package com.codegnan.fundamentals;

import java.util.Scanner;

public class marks {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter marks:");
		
		int marks=scanner.nextInt();
		char Grade=(marks>=90)?'O':(marks>=80)?'S':(marks>=70)?'A' :(marks>=60)?'B':(marks>=50)?'C':(marks>=40)?'D':'F';
		System.out.println("studentmarks:"+marks+"grade is"+Grade);
	}

}
