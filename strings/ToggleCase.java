//12.	Write a Java program to toggle case of each character of a string.
package com.hefshine.basic_string;

import java.util.Scanner;

public class ToggleCase {
		public static void main(String args[]) {
			Scanner sc= new Scanner(System.in);
				System.out.println("Enter the string: ");
				String str=sc.next();
				System.out.println("String is before toggle: "+str);
			    char ch[]=str.toCharArray();
			    	for(int i=0;i<ch.length;i++)
		        	{
		            	if(ch[i]>=97 && ch[i]<=122)
		            		ch[i]=(char) (ch[i]+32);
		            	else
		            		ch[i]=(char) (ch[i]-32);
		        	}
			     			System.out.println("After toggle:");
			     	for(int i=0;i<ch.length;i++)
			     			System.out.print(ch[i]);
		}

}
