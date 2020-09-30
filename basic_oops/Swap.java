//1.	Swap values of two integer variables using third variable.
package com.hefshine.oops;
import java.util.Scanner;
public class Swap {
			void swap(int number1,int number2)
			{
				System.out.println("Before swap:\n number1= "+number1+"\n number2= "+number2);
				int temp;
				temp=number1;
				number1=number2;
				number2=temp;
				System.out.println("After swap:\n number1= "+number1+"\n number2= "+number2);
				
			}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Swap object1=new Swap();
			System.out.println("Enter the two numbers");
			int number1=sc.nextInt();
			int number2=sc.nextInt();
			object1.swap(number1, number2);
	}

}
