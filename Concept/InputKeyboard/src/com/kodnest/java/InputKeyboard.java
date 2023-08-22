package com.kodnest.java;

import java.util.Scanner;

public class InputKeyboard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Character");
		char g=scan.next().charAt(0);
		System.out.println("Enter the Integer");
		int a = scan.nextInt();
		System.out.println(a);
		byte b=scan.nextByte();
		System.out.println(b);
		short c=scan.nextShort();
		System.out.println(c);
		long d=scan.nextLong();
		System.out.println(d);
		System.out.println("Enter the Real Number");
		float f=scan.nextFloat();
		System.out.println(f);
		double e=scan.nextDouble();
		System.out.println(e);
		System.out.println("Enter a String");
		String h=scan.next();
		System.out.println(h);
		System.out.println("Enter your Full Name");
		scan.nextLine();
		String i=scan.nextLine();
		System.out.println(i);
	}

}
