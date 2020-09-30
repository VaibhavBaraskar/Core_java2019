//8.	Write a program to convert days into years, weeks and days.{Hint: Input-373 days Output-1Year,1Weak,1 day
package com.hefshine.homework_basic_of_java;
import java.util.Scanner;
public class ConvertDay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int days,day,year,week;
System.out.println("Enter the days");
days=sc.nextInt();
	year=days/365;
	week=(days%365)/7;                                                 
	day=(days%365)%7;
	System.out.println("Number of years "+year+" Number of weeks "+week+" and Number of days "+day);
	}

}
