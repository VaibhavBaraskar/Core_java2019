//3.	Write a Java program to concatenate two strings.
package com.hefshine.basic_string;
import java.util.Scanner;
public class Concatenate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String str1=sc.next();
		System.out.println("Enter the second string: ");
		String str2=sc.next();
		System.out.println("Concatenated string is: "+str1+" "+" "+str2);
	}

}
