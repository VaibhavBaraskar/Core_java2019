 //7.	Write a Java program to search all occurrences of a character in given string.
package com.hefshine.strings;

import java.util.Scanner;

public class AllCharOccurences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the character: ");
		char ch = sc.next().charAt(0);
		int count = 0;
		System.out.println("You entered string is: " + str);
		System.out.println("You entered the '" + ch + "' character..");
		System.out.println("Character '" + ch + "' occurs the");
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				System.out.println("Position: " + i);
				count++;
			}
		}
		System.out.println("Character '" + ch + "' occur '" + count + "' times");
	}
}