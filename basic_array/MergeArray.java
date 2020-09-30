//4.	WAP to merge 2 arrays to 3rd array.
package com.hefshine.basic_array;

import java.util.Scanner;

public class MergeArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array: ");
		int size1=sc.nextInt();
		int array1[]=new int [size1];
		System.out.println("Enter the element of first array: ");
		for(int i=0;i<size1;i++)
		{
			array1[i]=sc.nextInt();
		}
		
		
		
		System.out.println("Enter the size of second array: ");
		int size2=sc.nextInt();
		int array2[]=new int[size2];
		System.out.println("Enter the element of second array: ");
		for(int i=0;i<size2;i++)
		{
			array2[i]=sc.nextInt();
		}
		
		
		
		int count=0;
		int sizes=size1+size2;
		int array3[]=new int[sizes];
		for(int i=0;i<size1;i++)
		{
			array3[i]=array1[i];
			count++;
		}
		
		
		for(int i=0;i<size2;i++)
		{
			array3[count++]=array2[i];
		}
		
		System.out.println("The merged array is: ");
		for(int i=0;i<sizes;i++)
		{
			System.out.print(" "+array3[i]);
		}
	}

}

