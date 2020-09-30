//9.	Write a Java program to remove all occurrences of a character from string.
package com.hefshine.strings;

import java.util.Scanner;

public class RemoveAll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		System.out.println("Enter the character: ");
		char ch=sc.next().charAt(0);
		char array[]=str.toCharArray();
		String result="";
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=ch)
			{
				result=result+array[i];
				
			}
		}
		System.out.println("Result: "+result);
	}

}
