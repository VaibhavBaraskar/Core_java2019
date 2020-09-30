//4.	Write a program to find diameter, circumference and area of circle.
package com.hefshine.homework_basic_of_java;
import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int diameter,radius;
		double circumference,area;
		System.out.println("Enter the radius");
		radius=sc.nextInt();
		area=3.14*(radius*radius);
		diameter=2*radius;
		circumference=2*3.14*radius;
		System.out.println("Area of circle: "+area);
		System.out.println("Diameter of circle is: "+diameter);
		System.out.println("circumference of circle is: "+circumference);
	}

}
