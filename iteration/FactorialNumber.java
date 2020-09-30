//2.	Calculate factorial of a number.
package com.hefshine.basic_iteration;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		int fact=1,num;
		System.out.println("Enter the number");
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is: "+fact);
	}

}
