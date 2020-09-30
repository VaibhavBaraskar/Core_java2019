/*5.Take 10 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
*/
package com.hefshine.array;

import java.util.Scanner;

public class Integer {

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
			if(number[i]>0)
			{
				System.out.println(number[i]+": Number is positive");
			}
			else if(number[i]<0)
			{
				System.out.println(number[i]+": Number is negative");
			}
			else
			{
				System.out.println(number[i]+": Number is zero");
			}
		}
	
	}

}
