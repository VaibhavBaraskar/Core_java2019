//4.	Write a program to input any alphabet and check whether it is vowel or consonant. 
package com.hefshine.basic_control_statement;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		char alphabet;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabet");
		alphabet=sc.next().charAt(0);
		if(alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u'||alphabet=='A'||alphabet=='E'||alphabet=='I'||alphabet=='O'||alphabet=='U')
		{
			System.out.println("The given alphabet "+alphabet+" is vowel");
		}
		else 
		{
			System.out.println("The given alphabet "+alphabet+" is consonent");
		}
	}

}
