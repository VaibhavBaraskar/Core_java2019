//5.	Write a program to input all sides of a triangle and check whether triangle is valid or not. 
package com.hefshine.oops;
import java.util.Scanner;
public class ValidTriangleWithSide {
						void checkTriangle(int side1,int side2,int side3)
						{
						if((side1+side2)>side3 && (side1+side3)>side2 || (side2+side3)>side1 && (side2+side1)>side3 || (side3+side2)>side1 && (side3+side1)>side2 )
								System.out.println("Traingle is valid");
							else
								System.out.println("Triangle is not valid");
						}
	public static void main(String[] args) {
	int side1,side2,side3;
	ValidTriangleWithSide object=new ValidTriangleWithSide();
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the three sides of a triangle");
			side1=sc.nextInt();
			side2=sc.nextInt();
			side3=sc.nextInt();
			object.checkTriangle(side1, side2, side3);
	}

}
