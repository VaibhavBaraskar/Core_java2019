//2.	Write a program to enter two angles of a triangle and find the third angle.
package com.hefshine.oops;
import java.util.Scanner;
public class ThirdAngle {
static	int firstangle,secondangle;
					void thirdAngle(int firstangle,int secondangle)
					{
						int thirdangle=180-(firstangle+secondangle);
						System.out.println("Third angle is: "+thirdangle);
					}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ThirdAngle object1= new ThirdAngle();
		System.out.println("Enter the first angle");
		firstangle=sc.nextInt();
		System.out.println("Enter the second angle");
		secondangle=sc.nextInt();
		object1.thirdAngle(firstangle, secondangle);
	}

}
