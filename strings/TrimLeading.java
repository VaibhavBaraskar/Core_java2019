//4.	Write a Java program to trim leading white space characters in a string.
package com.hefshine.strings;

import java.util.Scanner;

public class TrimLeading {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(count) == ' ') {
				count++;
			}
		}
		for (int i = count; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	}
}