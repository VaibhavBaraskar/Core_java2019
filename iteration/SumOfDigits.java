//3.	Find sum of all digits of a number
package com.hefshine.basic_iteration;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int digit,result=0,n;
		System.out.println("Enter the digit");
		digit=sc.nextInt();
		while(digit>0)
		{
			n = digit % 10;
            result = result + n;
            digit = digit / 10;
		}
		System.out.println("Addition of digit is "+result);
	}

}
