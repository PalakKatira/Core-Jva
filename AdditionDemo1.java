package com.palak.basicofjava_example;

import java.util.Scanner;

public class AdditionDemo1 {
	public static void main(String[] args) {
		
		//Way 1
		int a=12;
		int b=32;
		int c=a+b;
		System.out.println(c);
		
		//Way 2
		System.out.println("Enter the value of a1");
		Scanner s=new Scanner(System.in);//compulsory import scanner class
		int a1=s.nextInt();
		
		System.out.println("Enter the value of b1");
		Scanner s1=new Scanner(System.in);//compulsory import scanner class
		int b1=s1.nextInt();
		
		int c1=a1+b1;
		System.out.println(c1);
		System.out.println(a1+b1);
		System.out.println(a1+" "+b1);
		
	}

}
