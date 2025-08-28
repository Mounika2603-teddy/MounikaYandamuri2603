package com.codegnan.fundamentals;

import java.util.Scanner;

public class billamount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter bill amount:");
		double amount=scanner.nextDouble();
		double finalamount=(amount>1000)?amount*0.8:amount;
		System.out.println("finalamounttopay:"+ finalamount);
	}

}
