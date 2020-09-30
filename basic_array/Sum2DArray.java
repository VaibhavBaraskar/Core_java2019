//8.	WAP to sum two matrices.
package com.hefshine.basic_array;

import java.util.Scanner;

public class Sum2DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("First matrix: ");
		System.out.println("Enter the row");
		int row=sc.nextInt();
		System.out.println("Enter the column");
		int col=sc.nextInt();
		
		int array1[][]=new int [row][col];
		System.out.println("Second Matrix: ");
		System.out.println("Enter the row");
		 row=sc.nextInt();
		System.out.println("Enter the column");
		 col=sc.nextInt();
		int array2[][]=new int [row][col];
		int rows=row*row;
		int cols=col*col;
		int array3[][]=new int [rows][cols];
		System.out.println("Enter the first matrix value: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				array1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the second matrix value: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				array2[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Addition of two matrix is: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				array3[i][j]=array1[i][j]+array2[i][j];
			}
		}
		
		

		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(" "+array3[i][j]);
			}
			System.out.println();
		}
	}

}
