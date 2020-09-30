//1.	Write a program to print hello.
package com.hefshine.basic_of_java;
import java.util.Scanner;
public class PrintHello {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the message");
		String message=sc.next();
		System.out.println("Entered message is: "+message);
	}

}
