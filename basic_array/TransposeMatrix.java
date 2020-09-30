//10.	WAP to create transpose of a matrix (transpose is converting rows to columns) and print it.
package com.hefshine.basic_array;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
		System.out.println("Enter the column");
		int col=sc.nextInt();
		int array[][]=new int [row][col];
		int array1[][]=new int [row][col];
		System.out.println("Enter the matrix value: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix is: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(" "+array[i][j]);
			}
			System.out.println();
		}
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				array1[i][j]=array[j][i];
			}
		}
		
		
		System.out.println("Transpose of matrix is: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(" "+array1[i][j]);
			}
			System.out.println();
		}
	
	}

}
