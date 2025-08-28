package com.codegnan.fundamentals;

import java.util.Scanner;

public class studentpassorfail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter student marks:");
		int studentmarks=scanner.nextInt();
		String result=(studentmarks>=35)?"pass":"fail";
		System.out.println( result);
	}

}
