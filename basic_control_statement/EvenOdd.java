//3.	Write a program to check whether a number is even or odd.
package com.hefshine.basic_control_statement;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the number");
		number=sc.nextInt();
		if(number%2==0)
		{
			System.out.println(+number+ " Number is even");
		}
		else
		{
			System.out.println(+number+ " Number is odd");
		}

	}

}
