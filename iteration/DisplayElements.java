//6.Display all elements between 400 to 500 (both numbers excluded) ending with seven.{Hint: output-407,417,427….}
package com.hefshine.iteration;
import java.util.Scanner;
public class DisplayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int number;
		for(int i=400;i<500;i++)
		{
			if(i%10==7)
			{
				System.out.println(i);
			}
		}
			
	}

}
