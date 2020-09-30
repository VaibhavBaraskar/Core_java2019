//1.	WAP to create a Treemap which contains Strings
package com.hefshine.collections_map;

import java.util.Scanner;
import java.util.TreeMap;

public class Contains_Strings {

	public static void main(String[] args) {
	TreeMap tr=new TreeMap();
	Scanner sc=new Scanner(System.in);
	System.out.println("How many element you want?");
	int size=sc.nextInt();
	
	
	for(int i=0;i<size;i++)
	{
		System.out.println("Enter the element "+(i+1)+" in treemap: ");
		System.out.println("Enter the key:(Integers Only)");
		int key=sc.nextInt();
		System.out.println("Enter the value:(Strings Only)");
		String value=sc.next();
		tr.put(key, value);
	}
	System.out.println("String values in tree map is: "+tr);
	}

}