package com.palak.basicofjava_example;

public class TypeCasting {
	/**
	 * Assigning variable or literal of one data type to variable or literal of another data type
	 * lower data type can be directly assigned to higher data byte-implicit type casting
	 * Higher data type cannot be directly assigned to lower data type-explicit type casting
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		//Implicit type casting
		float f=1.2f;
		double d=1.2f;
		double d1=f;
		
		System.out.println(d);
		System.out.println(d1);
		
		//Explicit type casting
		double d9=1.23d;
		//float f9=d9;
		float f10=(float)d9;
		float f11=(float)1.23d;
		
		System.out.println(f10);
		System.out.println(f11);
		
		
		//hard coded values
		 int a=34;
		 float f1=67.3f;
		 
		 System.out.println(a+f1);
		 
		 
		 int s=a+(int)f;
		 System.out.println(s);
	}

}


