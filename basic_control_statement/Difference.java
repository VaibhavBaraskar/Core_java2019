//2.	Write a program to find maximum and minimum between two numbers. 
package com.hefshine.basic_control_statement;
import java.util.Scanner;
public class Difference {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number1,number2;
		System.out.println("Enter the first number");
		number1=sc.nextInt();
		System.out.println("Enter the second number");
		number2=sc.nextInt();
		if(number1>number2) {
			System.out.println(+number1+ " is maximum and "+number2+ " is minimum");
		}
		else
		{
			System.out.println(+number2+ " is maximum and "+number1+ " is minimum");
		}
	}

}
