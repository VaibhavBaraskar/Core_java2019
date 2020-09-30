//11.	WAP to put even and odd elements of array in two separate arrays.
package com.hefshine.array;

import java.util.Scanner;

public class EvenOdd {

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
		
		int cnt=0,cnt1=0;
		
		for(int i=0;i<number.length;i++)
		{
			if(number[i]%2==0)
				cnt++;
			else
			cnt1++;
		}
		int odd[]=new int[cnt];
		int even[]=new int[cnt1];
		
		
		
		int count=0,count1=0;
		for(int i=0;i<number.length;i++)
		{
			if(number[i]%2==0)
				even[count++]=number[i];
			else
			odd[count1++]=number[i];
		}
		System.out.println("Entered numbers are: ");
		for(int i=0;i<size;i++)
		{
			System.out.println(number[i]);
		}
		
		System.out.println("Number of odd values is: "+count1);
		System.out.print("Odd numbers are: ");
		for(int i=0;i<odd.length;i++)
		{
			System.out.print(" "+odd[i]);
		}
		System.out.println();
		System.out.println("Number of even values is: "+count);
		System.out.print("Even numbers are: ");
		for(int i=0;i<even.length;i++)
		{
			System.out.print(" "+even[i]);
		}
	}

}
