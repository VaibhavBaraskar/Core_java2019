//6.	WAP to print maximum in row wise in 2D array. Means e.g. arr[][] = {{22, 31, 9}, {12, 25, 16}} output is: 31 and 25.
package com.hefshine.basic_array;

import java.util.Scanner;

public class MaxRow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of row: ");
		int row=sc.nextInt();
		System.out.println("Enter the size of column: ");
		int col=sc.nextInt();
		int numbers[][]=new int[row][col];
		System.out.println("Enter the element of array: ");
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<col;j++)
			{
				numbers[i][j]=sc.nextInt();
		}
		}
		System.out.println("Maximum in row is: ");
		System.out.print("{ ");
		for(int i=0;i<row;i++)
		{
			int max=numbers[i][0];
			for(int j=0;j<col;j++)
			{
				if(numbers[i][j]>max)
				{
					max=numbers[i][j];
				}
			}
			System.out.print(max+" ");	
		}
		System.out.print("}");
	
	
	
	
}
}
