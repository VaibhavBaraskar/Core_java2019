//5.	Count number of digits of any number.
package com.hefshine.iteration;
import java.util.Scanner;
public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number,count=0;
		System.out.println("Enter the number");
		number=sc.nextInt();
		int temp=number;
		while(number!=0)
		{
			number=number/10;
			count++;
		}
		System.out.println(temp+" is a "+count +" digit number");
	}

}
