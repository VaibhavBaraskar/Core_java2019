// 4.	Write a program to enter P, T, and R and calculate Simple Interest.
package com.hefshine.basic_of_java;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		float principal,time,rate,SimpleInterest;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal amount");
		principal=sc.nextInt();
		System.out.println("Enter the time in year");
		time=sc.nextInt();
		System.out.println("Enter the rate amount");
		rate=sc.nextInt();
		SimpleInterest=((principal*time*rate)/100);
		System.out.println("SimpleInterest is: "+SimpleInterest);

	}

}
