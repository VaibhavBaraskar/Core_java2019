/*5.	WAP to print following Pattern
* * * * *
* * * *
* * *
* *
*
*/
package com.hefshine.basic_iteration;
import java.util.Scanner;
public class Pattern {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int i,j;
	System.out.println("Enter the rows");
	int rows=sc.nextInt();
	for(i=rows;i>0;i--)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}
