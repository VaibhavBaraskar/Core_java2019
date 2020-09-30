//5.	Write a Java program to convert lowercase string to uppercase.
package com.hefshine.basic_string;
import java.util.Scanner;
public class Uppercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.next();
		System.out.println("Before changing case: "+str);
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		if(ch[i]>=97 && ch[i]<=122)
		{
			ch[i]=(char) (ch[i]-32);
		}
		}
		System.out.print("After changing uppercase: ");
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]);
}
}