//9.	Write a Java program to trim trailing white space characters in a string
package com.hefshine.basic_string;
import java.util.Scanner;
public class TrimTrailing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		int count=0;
		char ch[]=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
		{
			if(ch[i]==' ')
			{
				count++;
			}
			else
				break;
		}
		for(int i=0;i<str.length()-count;i++)
		{
			System.out.print(str.charAt(i));
		}
		
	}
}