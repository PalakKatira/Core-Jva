package com.palak.basicofjava_example;

public class Literals {
	public static void main(String[] args) {
		/**
		 * JVM gives answer in the decimal format.
		 * Literals(1.7)-Binary literal(literal value should be prefixed with 0b or 0B) and usage of underscore in literals
		 */

		int x=10;//data_type/keyword name_of_variable/identifier=constant value/literal
		
		//decimal literal-allowed digits are 0-9
		int x1=10;
		//int x2=0789;
		System.out.println(x1);
		
		//octal form for integer and char only-base 8-allowed digits are 0-7-should always start from 0
		int y=012;
		System.out.println(y);
		
		//hexadecimal form for integer and char only-allowed digits are 0-9 and a-f(both lower case and upper case)
		//should be prefixed with 0x or 0X
		int h=0x12;
		int h1=0X12334;
		System.out.println(h+" "+h1);
		
		long l=12l;//explicitly called as long by L
		long l1=13;
		//CE possible loss of precision
		//int l3=13l;
		double d=1234.454D;//explicitly called as double by D
		double d1=653.87;
		
		//Illegals
		/*boolean x7="true";
		boolean x8=True;*/
		
		//char c2="a";
		//char c3=a;
		char c3=0xFcac;
		char ch=02524;
		char ch4=97;//a will be printed converts into ASCII Value
		
		//Every escape literal is a char literal
		char ch5='\n';
		char ch6='\t';
		System.out.println(ch);
		char c1='a';
		System.out.println(c1);
		
		//Binary literal
		char cr=0B1111;
		System.out.println(cr);//prints 15
		
		double d9=1_66_7567_789;//usage of underscore..easy to read
		double d12=1__8967_78;//can use double underscore as well
		//double d13=_4526__2634_36..cannot use at first place
		//double d15=1_56._6546...not valid
		System.out.println(d9);
		
	}
}
