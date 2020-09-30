//4.	Write a Java program to find power of any number x ^ y.
package com.hefshine.basic_iteration;
import java.util.Scanner;
public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int base,exponent,result=1;
		System.out.println("Enter the base");
		base=sc.nextInt();
		System.out.println("Enter the exponent");
		exponent=sc.nextInt();
		int res=exponent;
		while(exponent!=0)
		{
			
			
			 result=result*base;
			--exponent;
		}
		System.out.println(+base+" Raised to Power of "+res+" is  = " + result);
	
	}

}
