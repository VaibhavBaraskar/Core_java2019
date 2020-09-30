//1.	How to accept different types of data using Scanner class. 
package com.hefshine.basic_control_statement;
import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
		int number1;
		float number2;
		char character;
		System.out.println("Enter the number: ");
		number1=sc.nextInt();
		System.out.println("The entered number is: "+number1);
		System.out.println("Enter the decimal number: ");
		number2=sc.nextFloat();
		System.out.println("Entered number is: "+number2);
		System.out.println("Enter the character");
		character=sc.next().charAt(0);
		System.out.println("Entered character is: "+character);
	}

}
