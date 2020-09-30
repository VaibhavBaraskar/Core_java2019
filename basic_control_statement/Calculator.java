//8.	Write a program to create simple calculator using switch case.
package com.hefshine.control_Statements;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double number1,number2;
		System.out.println("Enter the two number");
		number1=sc.nextDouble();
		number2=sc.nextDouble();
		System.out.println("Enter your choice");
		System.out.println(" 1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Division");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:double addition=number1+number2;
					System.out.println("Addition: "+addition);
			break;
		case 2:double sub=number1-number2;
				System.out.println("Substraction: "+sub);
				break;
		case 3:double mul=number1*number2;
			System.out.println("Multiplication: "+mul);
				break;
		case 4:double div=number1/number2;
			System.out.println("Division: "+div);
				break;
		default:System.out.println("Invalid Choice:"+number1+" and "+number2);
		}
		
		
		
	}

}
