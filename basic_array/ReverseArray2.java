/*16.WAP to reverse the array itself. 
{Hint- arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78, 37, 29, 45, 90, 3]} without using temporary array.*/  
package com.hefshine.array;

import java.util.Scanner;

public class ReverseArray2 {

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
		System.out.println("Reverse Array: ");
		for(int i=size-1;i>=0;i--)
		{
			System.out.println(number[i]);
		}
		
	}

}
