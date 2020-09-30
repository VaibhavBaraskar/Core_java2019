//2.	Compare string using ==.
package com.hefshine.strings;

import java.util.Scanner;

public class CompreString2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first the string: ");
		String s1 = sc.next();
		System.out.println("Enter the second string: ");
		String s2 = sc.next();
		if (s1 == s2) {
			System.out.println("String is equal: ");
		} else {
			System.out.println("String is not equal: ");
		}
	}
}