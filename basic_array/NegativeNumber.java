//9.WAP to print all negative elements in an array and also count total number of negative elements in an array.
package com.hefshine.array;

import java.util.Scanner;

public class NegativeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int number[]=new int[size];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<size;i++)
		{
			number[i]=sc.nextInt();
		}
		int count=0;
		System.out.println("Negative numbers are: ");
		for(int i=0;i<size;i++)
		{
		if(number[i]<0)
		{
			System.out.print(" "+number[i]);
			count++;
		}
		}
		System.out.println("\nTotal negative number is: "+count);
		
	}

}
