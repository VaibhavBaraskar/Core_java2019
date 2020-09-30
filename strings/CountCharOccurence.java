//3.	Write a Java program to count occurrences of a character in given string.
package com.hefshine.strings;

import java.util.Scanner;

public class CountCharOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.next();
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(ch + " Occures the " + count + " times");
	}
}