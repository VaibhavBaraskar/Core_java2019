/*19.	WAP to print following Pattern
 ABCDEFGFEDCBA
ABCDEF  FEDCBA
ABCDE     EDCBA
ABCD         DCBA
ABC             CBA
AB                 BA
A                     A
*/
package com.hefshine.iteration;

public class Pattern12 {

	public static void main(String[] args) {
			int i,j;
		for(i=1;i<=7;i++)
		{
			char ch='A';
			for(j=1;j<=13;j++)
			{
			if(j<=(8-i) || j>=(6+i))
			{
				System.out.print(ch);
				int s=j<7?ch++:ch--;
			}
			else {
				System.out.print(" ");
				if(j==7)
					ch--;
			}
		}
			System.out.println();
		}

	}
}
