//6.	Write a program to enter length in centimetre and convert it into meter and kilometre.
package com.hefshine.oops;
import java.util.Scanner;
public class LengthConversion {
			
	void meter(float 	centimeter)
	{
		float meter=centimeter/100;
		System.out.println(+centimeter+" centimeter="+meter+" meter");
		float kilometer=centimeter/1000;
		System.out.println(+centimeter+" centimeter="+kilometer+" kilometer");
	}

		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LengthConversion object= new LengthConversion();
		System.out.println("Enter the length in centimeter");
		float length=sc.nextInt();
		object.meter(length);
	}
	
	}
