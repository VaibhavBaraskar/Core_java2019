//4.	Write a program to check whether a character is uppercase or lowercase alphabet. 
package com.hefshine.control_Statements;
import java.util.Scanner;
public class UppercaseLowercase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c;
		System.out.println("Enter the character name");
		c=sc.next().charAt(0);
		if(c>=65 && c<=96)
		{
			System.out.println("Uppercase");
		}
		if(c>=97 && c<=123)
		{
			System.out.println("Lowercase");
		}
		if(c>=48 && c<=58)
		{
			System.out.println("Digit");
		}
	}

}
