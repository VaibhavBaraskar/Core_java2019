/*10.	WAP to print following Pattern
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
*/
package com.hefshine.iteration;

public class Pattern04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			
			for(int j=i;j>=1;j--)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}

}
