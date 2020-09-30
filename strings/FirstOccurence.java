//8.	Write a Java program to find first occurrence of a character in a given string.
package com.hefshine.basic_string;

import java.util.Scanner;

public class FirstOccurence {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.next();
		System.out.println("Enter the char: ");
		String ch=sc.next();
		System.out.println("First occurence: "+str.indexOf(ch));
		
	}

}
