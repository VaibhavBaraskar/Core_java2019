//10.	Write a Java program to trim both leading and trailing white space characters in a string
package com.hefshine.strings;

import java.util.Scanner;

public class TrimLeadTrail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int count = 0, lcount = 0;
		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == ' ') {
				count++;

			} else
				break;
		}

		for (int i = str.length() - 1; i >= 0; i--) {
			if (ch[i] == ' ') {
				lcount++;
			} else
				break;
		}
		for (int i = count; i < str.length() - lcount; i++) {
			System.out.print(ch[i]);
		}
		sc.close();
	}
}
