//7.	Write a program to enter marks of five subjects and calculate total, average and percentage.
package com.hefshine.homework_basic_of_java;
import java.util.Scanner;
public class Percentage 
{
		public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		int subject1,subject2,subject3,subject4,subject5,total;
		System.out.println("Enter the five subject marks");
		System.out.println("Subject1");
		subject1=sc.nextInt();
		System.out.println("Subject2");
		subject2=sc.nextInt();
		System.out.println("Subject3");
		subject3=sc.nextInt();
		System.out.println("Subject4");
		subject4=sc.nextInt();
		System.out.println("Subject5");
		subject5=sc.nextInt();
		total=subject1+subject2+subject3+subject4+subject5;
		System.out.println("Total marks are: "+total);
		float average=total/5;
		System.out.println("Average="+average);
		float percentage=(total*100)/500;
		System.out.println("Percentage="+percentage);
	}

}
