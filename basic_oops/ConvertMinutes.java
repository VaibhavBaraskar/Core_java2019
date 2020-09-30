//7.	Write a program to convert minutes into number of years and days.
package com.hefshine.oops;

import java.util.Scanner;

public class ConvertMinutes {
			void convertMinutes(int minutes)
			{
				int year=minutes/525600;
				int day=(minutes%525600)/1440;
				System.out.println(year);
				System.out.println(day);
			}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ConvertMinutes object=new ConvertMinutes();
		System.out.println("Enter the minutes");
		int minutes=sc.nextInt();
		object.convertMinutes(minutes);
		
	}

}
