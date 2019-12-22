package com.palak.basicofjava_example;

/**
 * Identifiers are names in java program which can be used for identification purposes.They are assigned to classes,methods,variables and labels
 * @author 
 *
 */

/**
 * Number of identifiers are 4.Find out!!
 * @author
 *
 */

//Rules for Identifiers-
// Allowed characters are (a to z) (A to Z) ($) and (0 to9) or else we will be getting compile time error
//Name should not start with numbers
//Cannot use Reserved keyword as identifiers in java

public class Identifiers {//Class name should always start with Capital letter followed by another capital letter of second word-Pascal casing

	public static void main(String[] args) {
		/**
		 * Java is a case sensitive language and so are identifiers
		 * no length constraint for java identifier but it is a worst programming practice
		 */
		int app=10;//According to coding convention, variable name should follow camel casing
		int App=11;
		int APP=12;
		int ca$h=90;
		String total123;
		//String 123total;
		//int if=19;
		
		/**
		 * All predefined class names and interfaces we can define as identifiers but not recommended
		 */
		int String=888;
		System.out.println(String);
		int Runnable=999;
		System.out.println(Runnable);
	}
}


