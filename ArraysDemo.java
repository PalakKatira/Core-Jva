package com.palak.basicofjava_example;
/**
 * Array is container object that holds collection of related data of same type-Basic data structure
 * converts 10000 variables into a single array and 10000 values are differentiated by index value
 * The size of the array is fixed by the programmer and is not expandable-DisAdv
 * Arrays can hold only homogeneous data type-therefore go for next level concept of collection
 * 
 * @author
 *
 */

public class ArraysDemo {
	public static void main(String[] args) {
		
		
		/**
		 * Different ways of declaring arrays
		 */
		
		//int[10] x;...at the time of declaration you cannot specify the size
		int[] x;
		
		//way 1
		//int[] myArray=new int[20];//each element gets a default value as 0
		//System.out.println(myArray);
		
		//way 2
		//int myArray1[]=new int[40];
		//System.out.println(myArray);
		
		//way 3
		int myArray3[]=new int[] {1,2,3,4,5,6};//do not mention the array size in this case or else CE
		System.out.println(myArray3[4]);
		
		for(int i=0;i<myArray3.length;i++)
		{
			System.out.print(myArray3[i]+" ");
		}
		
		//way 4
		int myArray4[]= {8,9,10,11,12,13,14};
		System.out.println('\n');
		for(int i=0;i<=myArray3.length-1;i++)
		{
			System.out.print(myArray4[i]+" ");
		}
		
		
		
		
		
	}

}
