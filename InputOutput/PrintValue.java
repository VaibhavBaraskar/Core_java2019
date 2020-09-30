//2.	Write a program to print an integer, char, and float value.
package com.hefshine.basic_of_java;
import java.util.Scanner;
public class PrintValue {

	public static void main(String[] args) {
		int intnumber;
		float floatnumber;
		char character;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer number:");
		intnumber=sc.nextInt();
		System.out.println("Enter the decimal number");
		floatnumber=sc.nextFloat();
		System.out.println("Enter the character");
		character=sc.next().charAt(0);
		System.out.println("Integer Number Is:"+intnumber);
		System.out.println("Float Number Is:"+floatnumber);
		System.out.println("Character Number Is:"+character);
	}

}
