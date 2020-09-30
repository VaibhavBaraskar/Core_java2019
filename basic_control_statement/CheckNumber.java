//2.	Write a program to check whether a number is negative, positive or zero. 
package com.hefshine.control_Statements;
import java.util.Scanner;
public class CheckNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int number;
	System.out.println("Enter the number");
		number=sc.nextInt();
		if(number==0)
		{
			System.out.println(+number+" Number is Zero");
		}
		else if(number>0)
		{
			System.out.println(+number+" Number is Positive");
		}
		else
		{
			System.out.println(+number+" Number is Negative");
		}
		
	}

}
