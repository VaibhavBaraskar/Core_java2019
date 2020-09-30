//5.WAP to print minimum in columns. Means e.g. arr[][]={{22, 31, 9}, {12, 5, 16}, {34, 42, 2}} output is: 12, 5, 2.
package com.hefshine.basic_array;

import java.util.Scanner;

public class MinimumColumn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of row: ");
		int row = sc.nextInt();
		System.out.println("Enter the size of column: ");
		int col = sc.nextInt();
		int numbers[][] = new int[row][col];
		System.out.println("Enter the element of array: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}

		System.out.println("Minimum in columns is: ");
		System.out.print("{ ");
		for (int j = 0; j < col; j++) {
			int min = numbers[0][j];
			for (int i = 0; i < row; i++) {
				if (numbers[i][j] < min) {
					min = numbers[i][j];
				}
			}
			System.out.print(min + " ");
		}
		System.out.print("}");
	}
}