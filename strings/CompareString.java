//4.	Write a Java program to compare two strings.
package com.hefshine.basic_string;
import java.util.Scanner;
public class CompareString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1=sc.next();
		System.out.println("Enter the second string: ");
		String str2=sc.next();
		if(str1.equals(str2))
			System.out.println("String is equal: ");
		else
			System.out.println("String is not equal: ");
		if(str1.contentEquals("Java"))
			System.out.println("String is equal: ");
		else
			System.out.println("String is not equal: ");
		System.out.println(str1.equalsIgnoreCase("hello"));
	}

}
