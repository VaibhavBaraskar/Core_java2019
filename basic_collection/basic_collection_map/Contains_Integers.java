//2.	WAP to create a Treemap which contains Integers
package com.hefshine.collections_map;

import java.util.Scanner;
import java.util.TreeMap;

public class Contains_Integers {
	public static void main(String[] args) {
		TreeMap tr=new TreeMap();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many element you want?");
		int size=sc.nextInt();
		
		
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the element "+(i+1)+" in treemap: ");
			System.out.println("Enter the key:(Integers Only) ");
			String key=sc.next();
			System.out.println("Enter the value:(Integers Only) ");
			String value=sc.next();
			tr.put(key, value);
		}
		System.out.println("Integer elements in a tree map is: "+tr);
		}
}
