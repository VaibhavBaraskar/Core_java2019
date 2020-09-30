//6.	Write a Java program to copy one string to another string.
package com.hefshine.basic_string;

import java.util.Scanner;

public class CopyString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.next();
		System.out.println("Enter the second string: ");
		String str2=sc.next();
		System.out.println("First string is: "+str);
		System.out.println("Second string is:"+str2);
		System.out.println("Copy string is: "+(str=str2));
	}

}
