package com.palak.basicofjava_example;

import java.util.Scanner;

public class AdditionDemo2 {
	
	public static void addDemo3(int a,int b) {
		//a=3;
		//b=5;
		System.out.println(a+b);
	}

	public static void addDemo() {
		// Way 1
		int a = 12;
		int b = 32;
		int c = a + b;
		System.out.println(c);
	}

	public void AddDemo1() {
		System.out.println("Enter the value of a1");
		Scanner s = new Scanner(System.in);// compulsory import scanner class
		int a1 = s.nextInt();

		System.out.println("Enter the value of b1");
		Scanner s1 = new Scanner(System.in);// compulsory import scanner class
		int b1 = s1.nextInt();

		int c1 = a1 + b1;
		System.out.println(c1);
		System.out.println(a1 + b1);
		System.out.println(a1 + " " + b1);
	}

	public static void main(String[] args) {
		
		//AdditionDemo2.addDemo();// static methods are called via class_name.method_name

		//AdditionDemo2 add2 = new AdditionDemo2();// non static methods are called by creating the object of the class
		//add2.AddDemo1();//object_name.method_name
		
		AdditionDemo2.addDemo3(23,67);
	}

}
