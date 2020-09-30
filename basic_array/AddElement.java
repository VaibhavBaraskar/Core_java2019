//2.WAP to add elements to single dimensional array  and print elements from 1D array.
package com.hefshine.array;

import java.util.Scanner;

public class AddElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int sum=0;
		int array[]=new int[size];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
			sum=sum+array[i];
		}
		System.out.println("Entered elements are: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+array[i]);
		}
		
		
	}

}
