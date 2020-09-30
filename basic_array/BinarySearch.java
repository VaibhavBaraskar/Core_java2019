//1.	Write a program to enter elements and perform binary search.
package com.hefshine.basic_array;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first, last, mid, search, array[];
		System.out.println("Enter the how many number you want: ");
		int size = sc.nextInt();
		array = new int[size];
		System.out.println("Enter the element");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the value to find: ");
		search = sc.nextInt();
		first = 0;
		last = size - 1;
		mid = (first + last) / 2;

		while (first <= last) {
			if (array[mid] < search)
				first = mid + 1;
			else if (array[mid] == search) {
				System.out.println(search + " found at location " + (mid));
				break;
			} else
				last = mid - 1;
			mid = (first + last) / 2;
		}
		if (first > last)
			System.out.println(search + " isn't present in the list \n");
	}
}