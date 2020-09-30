//8.	Write a program to enter temperature in °Celsius and convert it into °Fahrenheit and vice versa.
package com.hefshine.oops;
import java.util.Scanner;
public class CelsiusFahrenheit {
			void celsiusTofahrenheit(double celsius)
			{
				double fahrenheit=(celsius*1.8)+32;
				System.out.println("Tempreature in celsius to fahrenhrit: "+fahrenheit);
				celsius=(celsius-32)*0.55556;
				System.out.println("Tempreature in fahrenheit to celsius: "+celsius);
			}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			CelsiusFahrenheit object=new CelsiusFahrenheit();
			System.out.println("Enter the tempreature in celsius");
			double celsius=sc.nextDouble();
			object.celsiusTofahrenheit(celsius);
	}

}
