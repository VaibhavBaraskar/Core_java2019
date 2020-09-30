//1.	Create String with new operator and without new.
package com.hefshine.strings;

import java.util.Scanner;

public class CreateString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String string1 = new String(sc.nextLine());
		System.out.println("Enter the second string: ");
		String string2 = sc.nextLine();
		System.out.println("String 1: " + string1);
		System.out.println("String 2: " + string2);
	}
}

/**/