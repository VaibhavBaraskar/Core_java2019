//5.	Write a program to check whether the triangle is equilateral, isosceles or scalene triangle.
package com.hefshine.control_Statements;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner (System.in);
		int side1,side2,side3;
		System.out.println("Enter the three sides of triangle");
		side1=sc.nextInt();
		side2=sc.nextInt();
		side3=sc.nextInt();
		if(side1==side2 && side2==side3)
		System.out.println("Triangle is equilateral");
		else if(side1*side1+side2*side2==side3*side3||side1*side1+side3*side3==side2*side2||side2*side2+side3*side3==side1*side1)
			System.out.println("Trinagle right angled");
		else 
			System.out.println("Triangle is scelene");
	}

}
