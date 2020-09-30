//3.	Write a program to create table of a number
package com.hefshine.iteration;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int multi,number;
	System.out.println("Enter the number");
	number=sc.nextInt();
	for(int i=1;i<=10;i++)
	{
		multi=number*i;
		System.out.println(multi);
	}
	}

}
