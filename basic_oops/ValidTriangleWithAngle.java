//4.	Write a program to input angles of a triangle and check whether triangle is valid or not.
package com.hefshine.oops;

import java.util.Scanner;

public class ValidTriangleWithAngle {
				void checkTriangle(int angle1,int angle2,int angle3)
				{
					if(angle1>angle2 && angle1>angle3 || angle2>angle1 && angle2>angle3 || angle3>angle1 && angle3>angle2 )
						System.out.println("Triangle is valid");
					else
						System.out.println("Triangle is  not valid");
				}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		ValidTriangleWithAngle object = new ValidTriangleWithAngle();
		System.out.println("Enter the 3 angles of triangle");
		int angle1,angle2,angle3;
		angle1=sc.nextInt();
		angle2=sc.nextInt();
		angle3=sc.nextInt();
		object.checkTriangle(angle1,angle2,angle3);
	}

}
