//2.	Find if given number is prime or not
package com.hefshine.iteration;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				cnt++;
			}
			
		}
		if(cnt==2)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not prime");
		}
	}

}
