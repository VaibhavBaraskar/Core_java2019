//3.	Explain the concept of constructor overloading with suitable example.
package com.hefshine.basic_polymorphism_encapsulation;
import java.util.Scanner;
public class ConstructorOverloading {
	int number1;
	int number2;
	int number3;
	 ConstructorOverloading()
	{
		 number1=0;
		 number2=0;
		 number3=0;
     System.out.println("number1= "+number1+ " number2 = "+number2+ " number3= "+number3);
	}
	ConstructorOverloading(int number1,int number2)
	{
		int mul=number1*number2;
		System.out.println("multiplication is="+mul);
	}
	ConstructorOverloading(int number1,int number2,int number3)
	{
		int expree=(number1/number2)+number3;
		System.out.println("expression is="+expree);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value for number1");
		int number1=sc.nextInt();
		System.out.println("enter value for number2");
		int number2=sc.nextInt();
		System.out.println("enter value for number3");
		int number3=sc.nextInt();
		ConstructorOverloading obj = new ConstructorOverloading();
		ConstructorOverloading obj1 = new ConstructorOverloading(number1,number2);
		ConstructorOverloading obj2 = new ConstructorOverloading(number1,number2,number3);
	}
}
