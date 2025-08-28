package com.codegnan.fundamentals;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int radius=scanner.nextInt();
		double area=3.14*radius*radius;
		System.out.println("area of circle is:"+area);
		scanner.close();

	}

}
