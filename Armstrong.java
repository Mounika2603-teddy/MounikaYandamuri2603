package com.codegnan.controlststements;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number :");
		int num=scanner.nextInt();
		int temp=num,sum=0;
		while(num>0) {
			int digit = num%10;
			sum+=digit*digit*digit;
			num=num/10;
			
		}
		if(temp==sum) {
			System.out.println(temp+" is a Armstrong");
			
		}else {
			System.out.println(temp + " is not a Armstrong");
		}
	}

}
