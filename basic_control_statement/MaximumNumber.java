//1.	How to accept different types of data using Scanner class. 
package com.hefshine.control_Statements;
import java.util.Scanner;
public class MaximumNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number1,number2,number3;
		System.out.println("Enter the three number");
		number1=sc.nextInt();
		number2=sc.nextInt();
		number3=sc.nextInt();
		if(number1>number2 && number1>number3)
		{
			System.out.println("Maximum number is: "+number1);
		}
		else if(number2>number1 && number2>number3)
		{
			System.out.println("Maximum number is: "+number2);
		}
		else
		{
			System.out.println("Maximum number is: "+number3);
		}
		
			
	}

}
