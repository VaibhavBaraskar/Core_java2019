//3.	Write a program to enter two numbers and perform sum of two numbers.
package com.hefshine.basic_of_java;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		int number1,number2,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		number1=sc.nextInt();
		System.out.println("Enter the second number");
		number2=sc.nextInt();
		result=number1+number2;
		System.out.println("Addition of two number is: "+result);
	}

}
