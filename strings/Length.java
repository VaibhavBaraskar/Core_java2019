//2.	Write a Java program to find length of a string.
package com.hefshine.basic_string;

import java.util.Scanner;

public class Length {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string:");
		String string=sc.next();
		char ch[]=string.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			count++;
		}
		System.out.println("Length of the string is: "+count);
	}
}
