package com.palak.basicofjava_example;

/**
 * Every variable and expression in java has some type
 * @author 
 *
 */

public class DataType {

	public static void main(String[] args) {
		
		
		/**
		 * Java is a strongly typed programming language
		 * Every assignment is checked by java compiler for type compatibility
		 * Java is not pure object oriented programming language(OOP)-several oop features are not satisfied by java like operator overloading nad multiple inheritance 
		 *Moreover we are depending on primitive data types which are non objects
		 */
		
		/*boolean a=12;
		int x=12.4;*/
		
		/**
		 * DataTypes-8 types
		 * 1.Primitive Data Types:
		 * 1.1 Numeric Data types
		 * 		1.1.1 Integral data types-1.1.1.1 byte(1 byte=8bites):1st digit:0->positive and 1->negative,(-128 to 127),used to handle data in the form of Streams-file supported form
		 * 								  1.1.1.2 short-rarely used(16 bites) and(-32768 to 32767)
		 * 								  1.1.1.3 int-most commonly used(32 bits) and (-2^31 to 2^31-1)
		 * 								  1.1.1.4 long-suffix L/l is used(64 bits)
		 * 		1.1.2 Floating point data types-1.1.2.1 float(5 to 6 decimal accuracy-single precision-less precise) (32 bites)
		 * 										1.1.2.2 double(14 to 16 decimal accuracy-double precision-more precise) (64 bites)
		 * 1.2.Non-Numeric Data Types:
		 * 1.2.1 char (16 bites because java is uni code based-can use 256 ASCII characters in addition world wide any language symbols-can use telugu also
		 * 1.2.2 boolean (size and range not applicable,VM dependent)
		 * 		1.1.1.2.1 true and value
		 */
		
		//For numbers +,- are meaningful but not boolean and char
		//except boolean and char(default value is 0 which represents space,all data types are called signed data typed 
		int a=+10;
		int b=-12;
		double x=12.45;
		
		//boolean b=-false;...meaningless
		//char c=-'A';...meaningless
		//byte p1="Shubham";
		//byte p2=true;
		//byte p=128;
		//System.out.println(p);
		
		long l=12273673467267826L;
		System.out.println(l);
		
		float f=-3.4f;
		System.out.println(f);
		
		double d=+5.75474;
		System.out.println(d);
		
		boolean b1=true;
		System.out.println(b1);
		
		
		//not valid in java because if only takes boolean condition
		
		/*int q=0;
		if(0)
			System.out.println("Hello");//CE Error
		else
			System.out.println("Hi");*/
		
		//not valid because while accepts only boolean
		/*while(1) {
			System.out.println("Hello");//CE Error
		}*/
		
	}
}
