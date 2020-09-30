//4.	Find out given number is palindrome or not.
package com.hefshine.iteration;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0,temp,number,remainder;
		System.out.println("Enter the number");
		number=sc.nextInt();
		temp=number;
		while(number>0)
		{
			remainder=number%10;
			sum=(sum*10)+remainder;
			number=number/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" Number is palindrome");
		}
		else
		{
			System.out.println(temp+" Number is not palindrome");
		}
	}

}
