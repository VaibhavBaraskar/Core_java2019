//11.	Write a Java program to remove all extra blank spaces from a given string.
package com.hefshine.basic_string;

import java.util.Scanner;

public class BlankSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		System.out.println("Entered String Is: "+str);
		String result="";
		char ch[]=str.toCharArray();
		char pc=' ';
		for(int i=0;i<ch.length;i++)
		{
			char cc=ch[i];
			if(!(pc==' ' && pc==cc))   
			{
				result=result+cc;
			}
			pc=cc;
		}
		System.out.println("After remove blank spaces: ");
		System.out.println(result);
	}

}
