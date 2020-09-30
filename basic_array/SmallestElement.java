//13.	WAP to find the second smallest element in an array.
package com.hefshine.array;

import java.util.Scanner;

public class SmallestElement {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int number[]=new int[size];
		System.out.println("Enter the element of array: ");
		for(int i=0;i<size;i++)
		{
			number[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{ 
				int temp=0;
				if(number[j]>number[j+1])
				{
					temp=number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
				}
			}
		}
		System.out.println("Second smallest element is: "+number[1]);
		
	}

}
