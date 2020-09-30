package com.hefshine.stringbuffer;

import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str1=sc.nextLine();
		System.out.println("First string is: "+str1);
		System.out.println("Enter string to copy: ");
		String str2=sc.nextLine();
		StringBuffer str3=new StringBuffer(str1);
		str3.replace(0,5,str2);
		System.out.println(str3);
	}

}
