/*9.	WAP to print following Pattern 
A
A B
A B C
A B C D 
A B C D E
A B C D E F
*/
package com.hefshine.iteration;
import java.util.Scanner;
public class Pattern03 {

	public static void main(String[] args) {
		int i,j;
for(i=1;i<=5;i++)
		{
			char ch='A';
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+ch);
				ch++;
			}
			System.out.println();
		}
	}

}
