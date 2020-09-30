/*18.	Write a Java program to get the difference between the largest and smallest values in an array of integers.
The length of the array must be 1 and above*/
package com.hefshine.array;
import java.util.Scanner;
public class LargestSmallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int min=0,max=0;
		int number[]=new int[size];
		System.out.println("Enter the elements of array: ");
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
		System.out.println("Difference between largest and smallest number is: "+(max-min));
	}
}
