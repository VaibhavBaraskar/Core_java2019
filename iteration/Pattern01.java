/*7.	WAP to print following Pattern
*
*
* *
* * *
* * * *
*/
//package com.hefshine.iteration;
import java.util.Scanner;
public class Pattern01 {

	public static void main(String[] args) {
		for(int i=4;i>0;i--)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
