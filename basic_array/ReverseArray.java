//6.	WAP to print reverse of an array.
package com.hefshine.array;

import java.util.Scanner;

public class ReverseArray {

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
		System.out.println("Traverse Array: ");
		for(int i=0;i<size;i++)
		{
			System.out.println(number[i]);
		}
		System.out.println("Reverse Array: ");
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(number[i]);
		}		
				
	}

}
