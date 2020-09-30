//3.	Create a class Addition having three instance variables, three methods. Calculate and display addition for two objects.
package com.hefshine.basic_oops;

import java.util.Scanner;

public class Addition {
	double number1,number2,result;
	void addition1(double number1,double number2)
	{
		 result=number1+number2;
		
	}
	void addition2()
	{
		System.out.print("\nResult: ");
	}
	void addition3()
	{
		System.out.print(result);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Addition object1=new Addition();
		Addition object2=new Addition();
		System.out.println("Enter the two numbers");
		System.out.println("Number1: ");
		double number1=sc.nextDouble();
		System.out.println("Number2: ");
		double number2=sc.nextDouble();
		object1.addition1(number1,number2);
		object1.addition2();
		object1.addition3();
		object2.addition1(number1, number2);
		object2.addition2();
		object2.addition3();
		
	}

}
