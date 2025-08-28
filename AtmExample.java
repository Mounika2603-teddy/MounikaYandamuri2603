package com.codegnan.fundamentals;

import java.util.Scanner;

public class AtmExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double accountBalance = 50000.0;
		System.out.println("enter withdrawlAmount:");
		double withdrawAmount = scanner.nextDouble();
		if(withdrawAmount<=accountBalance) {
			accountBalance-=withdrawAmount;
			System.out.println("withdrawn successfully:"+withdrawAmount+"remaining account balance:"+accountBalance);
		}else {
			System.out.println("insufficientBalance");
		}
		scanner.close();	
		

	}

}
