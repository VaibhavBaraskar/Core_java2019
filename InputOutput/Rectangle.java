//3.	Write a program to find area and perimeter of rectangle.
package com.hefshine.homework_basic_of_java;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float perimeter,area,length,width,height;
		System.out.println("Enter the length");
		length=sc.nextInt();
		System.out.println("Enter the width");
		width=sc.nextInt();
		System.out.println("Enter the height");
		height=sc.nextInt();
		perimeter=2*(length+width);
		
		area=width*height;
		
		System.out.println("Perimeter of reactangle= "+perimeter);
		System.out.println("Area= "+area);
	}

}
