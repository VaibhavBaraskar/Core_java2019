/*17.	Write a Java program to display the number rhombus structure. 
1                                                  
2 1 2                                                 
3 2 1 2 3                                                
4 3 2 1 2 3 4  
*/
package com.hefshine.iteration;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				for(int i=1;i<=5;i++)
				{
					for(int j=i;j>=1;j--)
						System.out.print(j+" ");
					for(int k=2;k<=i;k++)
						System.out.print(k+" ");
					System.out.println(" ");
				}
	}

}
