//17.	WAP to replace all the 0’s with 1’s in your array. Your array is [26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34].
package com.hefshine.array;

import java.util.Scanner;

public class Replace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int number[]=new int[size];
		System.out.println("Enter the elements of array: ");*/
		int number[]={26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34};
		for(int i=0;i<number.length;i++)
		{
			//number[i]=sc.nextInt();
			if(number[i]==0)
			{
				number[i]=1;
			}
		}
		for(int i=0;i<number.length;i++)
		{
			System.out.println(number[i]);
		}
	}

}
