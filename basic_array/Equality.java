//14.	Write a Java program to test the equality of two arrays.
package com.hefshine.array;

import java.util.Scanner;

public class Equality {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size1,size2;
		System.out.println("Enter the size of first array: ");
		size1=sc.nextInt();
		int array1[]=new int[size1];
		System.out.println("Enter the element: ");
		for(int i=0;i<size1;i++)
		{
			array1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of second array: ");
		size2=sc.nextInt();
		int array2[]=new int [size2];
		System.out.println("Enter the size of second array: ");
		for(int i=0;i<size2;i++)
		{
			array2[i]=sc.nextInt();
		}
		int count=0;
		if(size1==size2)
		{
		for(int i=0;i<size1;i++)
			{
			for(int j=0;j<size2;j++)
			{
				if(array1[i]==array2[j])
					count++;
			}
			}
			if(count==size1)
			{
				System.out.println("Array is equal: ");
			}
			else
			{
				System.out.println("Array is not equal: ");
			}
			
		}
		else
		{
			System.out.println("Array are not equal: ");
		}
	}
}
