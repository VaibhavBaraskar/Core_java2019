//3.	WAP sort array elements in ascending order using selection sort.
package com.hefshine.basic_array;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();

		int number[] = new int[size];
		System.out.println("Enter the array element: ");

		for (int i = 0; i < size; i++) {
			number[i] = sc.nextInt();
		}

		System.out.println("After sorting: ");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + number[i]);
		}

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				int temp = 0;
				if (number[i] > number[j]) {
					temp = number[i];
					number[i] = number[j];
					number[j] = temp;
				}
			}
		}

		System.out.println("\nBefore Sorting: ");
		for (int i = 0; i < size; i++) {
			System.out.print(" " + number[i]);
		}
	}
}
