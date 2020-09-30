//9.	Write a program to enter P, T, and R and calculate Compound Interest.
package com.hefshine.homework_basic_of_java;
import java.util.Scanner;
public class Compound_Interest {

	public static void main(String[] args) {
	
		float principal,timeinyears,rateofinterest,power,compoundinterest;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal");
		principal=sc.nextFloat();
		System.out.println("Enter time in years");
		timeinyears=sc.nextFloat();
		System.out.println("Enter rate of interest");
		rateofinterest=sc.nextFloat();
		power=(float)Math.pow((1+rateofinterest), timeinyears);
		compoundinterest=principal*power-1;
		System.out.println("compoundinterest "+compoundinterest);
	}

}