//1.	Display numbers from 1 to 100 using different loops.
package com.hefshine.iteration;
import java.util.Scanner;
public class DisplayNumbers {

	public static void main(String[] args) {
		int i=1;
		while(i<=100)
		{
			System.out.println("Number "+i);
			i++;
		}
		i=1;
		do {
			System.out.println("Number "+i);
			i++;
		}while(i<=100);
		
		for(i=1;i<=100;i++)
		{
			System.out.println("Number "+i);
		}
	}

}
