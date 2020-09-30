//13.	WAP to get the first (lowest) key and the last (highest) key currently in a TreeMap
package com.hefshine.collections_map;

import java.util.Scanner;
import java.util.TreeMap;

public class LowestKeyGreatestKey {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elemetnts you want?");
		int size=sc.nextInt();
		System.out.println("Enter the elements in a map: ");
		TreeMap tr=new TreeMap();
		for(int i=0;i<size;i++)
		{
			
			System.out.println("\nEnter the "+(i+1)+" element");
			System.out.println("Enter the key:(Integers only)");
			int key=sc.nextInt();
			System.out.println("Enter the value:(Strings only)");
			String value=sc.next();
			tr.put(key, value);
		}
		System.out.println("Values in tree map is: "+tr);
		System.out.println("Greatest key is '"+tr.lastKey()+"' and Lowest key is '"+tr.firstKey()+"'.");
		
	}
}
