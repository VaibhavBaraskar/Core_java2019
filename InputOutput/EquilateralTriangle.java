//6.	Write a program to calculate area of an equilateral triangle.
package com.hefshine.homework_basic_of_java;
import java.util.Scanner;
public class EquilateralTriangle {

	public static void main(String[] args) {
		double equilateral,sqrt,height;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height");
		height=sc.nextInt();
		
		sqrt=Math.sqrt(3);
		equilateral=(sqrt/4)*(height*height);
    System.out.println("Area of Equilateral triangle: "+equilateral);
	}

}
