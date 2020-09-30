//5.	Write a Java program to count total number of words in a string.
package com.hefshine.strings;

import java.util.Scanner;

public class NumberOfWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre the string: ");
		String str = sc.nextLine();
		int count = 1;
		char arr[] = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > ' ' || arr[i + 1] > ' ')
				if (arr[i] == ' ') {
					count++;
				}

		}
		System.out.println("Number of words is: " + count);
	}
}