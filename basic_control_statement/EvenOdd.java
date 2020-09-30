//3.	Display all even and odd numbers from 1 to 100.
package com.hefshine.control_Statements;

public class EvenOdd {

	public static void main(String[] args) {
		int even=0,odd=0;
		for(int i=1;i<=5;i++)
		{
		if(i%2==0)
			{
				even++;
			
			}
			else 
			{
				odd++;
			
			}
		}
		System.out.println("Total number of even numbers is"+even);
		System.out.println("Total number of odd numbers is"+odd);
	}
	
}
