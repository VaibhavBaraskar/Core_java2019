//15.	Write a menu driven program to find all prime, even and odd numbers between 1 to 100 using switch case
package com.hefshine.iteration;
import java.util.Scanner;
public class PrimeEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your choice");
		System.out.println("1.Prime numbers \n2.Even or Odd numbers\n");
		int choice=sc.nextInt();
	
		switch(choice)
		{
		case 1:int i;
				for( i=1;i<=100;i++)
					{
				int cnt=0;
					for(int j=1;j<=i;j++)
					{
						if(i%j==0)
						cnt++;
					}
					if(cnt==2)
					{
						System.out.println("prime number:"+i);
					}
				}
				break;
	case 2:	for(i=1;i<=100;i++)
				{
					if(i%2==0)
						System.out.println("Even numbers:"+i);
					else 
					System.out.println("Odd numbers:"+i);
				}
			break;
		default:System.out.println("Invalid");
		}
	}

}
