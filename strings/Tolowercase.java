//8.	Write a Java program to convert uppercase string to lowercase.
package com.hefshine.strings;

import java.util.Scanner;

public class Tolowercase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Entre the string: ");
		String str=sc.next();
		System.out.println("Before changing lowercase: "+str);
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		if(ch[i]>=65 && ch[i]<=90)
		{
			ch[i]=(char) (ch[i]+32);
		}
		}
		System.out.print("\nAfter changing lowercase: ");
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]);
	}

}
