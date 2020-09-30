//3.	WAP to count frequency of each element in an array.
package com.hefshine.basic_array;

import java.util.Scanner;

public class FrequencyArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int numbers[]=new int [size];
		System.out.println("Enter the element of array: ");
		for (int i = 0; i <size; i++)
		{
			numbers[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			int count=1;
			for(int j=i+1;j<size;j++)
			{
				if(numbers[i]==numbers[j])
				{
					count++;
					numbers[j]='*';
				}
			}
				if(numbers[i]!='*')
				{
					System.out.println(numbers[i]+" is repeated "+count+" times");
				}
		}
		
	}

}
