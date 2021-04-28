package javaLearning.arrays;

import java.util.Scanner;

public class SumOfGivenNumbers {
	
	static int add;
	
	public static int  sum (int[] a)
	{
		for (int i=0;i<a.length;i++)
		{
		 add= add+a[i];
		}
		
		return add;
		
	}
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("size of array:");
		int size=s.nextInt();
		System.out.println("size of array is:"+ size);
		int[] array= new int[size];
		System.out.println("enter numbers:");
		for (int i=0;i<array.length;i++)
		{
			 array[i]= s.nextInt();
		}
		
		System.out.println("Sum of numbers is:"+sum(array));		
		
	}
}
