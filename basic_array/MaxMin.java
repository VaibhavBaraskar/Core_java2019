//12.	WAP to find the maximum and minimum value in an array.
package com.hefshine.array;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int max=0,min=0;
		int number[]=new int[size];
		System.out.println("Enter the element of array: ");
		for(int i=0;i<size;i++)
		{
			number[i]=sc.nextInt();
			if(number[i]>max)
			{
				max=number[i];
				
			}
			else if(number[i]<max)
			{
				min=number[i];

			}
		}
		System.out.println("Maximum value in array: "+max);
		System.out.println("Minimum value in array: "+min);
	}

}
