//2.	Write a program to perform arithmetic operations on two numbers. 
package com.hefshine.homework_basic_of_java;
import java.util.Scanner;
public class ArithmeticOperation {

	public static void main(String[] args) {
		float number1,number2,result;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the first number");
		number1=sc.nextInt();
		System.out.println("Enter the second number");
		number2=sc.nextInt();
		result=number1+number2;
		System.out.println("The addition is: "+result);
		result=number1-number2;
		System.out.println("The substraction is: "+result);
		result=number1*number2;
		System.out.println("The multiplication is: "+result);
		result=number1/number2;
		System.out.println("The result is: "+result);
		
	}

}
