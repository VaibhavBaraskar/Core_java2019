//9.	Write a Java program to arrange the elements of an given array of integers where all positive integers appear before all the negative integers.
package com.hefshine.basic_array;

import java.util.Scanner;

public class PositiveNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int numbers[] = new int[size];
		System.out.println("Enter the elements of array: ");
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {

			for (int j = 0; j < size - 1; j++)
				if (numbers[j] < 0) {
					int temp = 0;
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
//			numbers[i]=numbers[i]+numbers[i+1];
//			numbers[i+1]=numbers[i]-numbers[i+1];
//			numbers[i]=numbers[i]-numbers[i+1];
				}
		}
		for (int i = 0; i < size; i++) {
			System.out.println(numbers[i]);
		}
	}

}
