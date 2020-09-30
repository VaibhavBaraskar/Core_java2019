//6.Write a Java program to find first occurrence of a word in a given string.
package com.hefshine.strings;

import java.util.Scanner;

public class FirstOccurenceWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		System.out.println("Enter the word to find occurence: ");
		String word = sc.next();
		String ch[] = str.split(" ");
		int count = 1;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i].equals(word)) {
				System.out.println("'" + word + "' is found at '" + (i+1) + "' location.");
				break;
			}
		}
	}

}
