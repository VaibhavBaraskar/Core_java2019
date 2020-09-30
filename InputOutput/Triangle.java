package com.hefshine.homework_basic_of_java;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		int breadth,height,areaoftriangle;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the breadth");
		breadth=sc.nextInt();
		System.out.println("Enter the height");
		height=sc.nextInt();
		areaoftriangle=(breadth*height)/2;
		System.out.println("Area of triangle is: "+areaoftriangle);
	}

}
