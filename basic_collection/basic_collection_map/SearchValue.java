//4.	WAP to search a value in a TreeMap
package com.hefshine.collections_map;

import java.util.Scanner;
import java.util.TreeMap;

public class SearchValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values you want?");
		int size = sc.nextInt();
		System.out.println("Enter the elements: \n");
		TreeMap tr = new TreeMap();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the element "+(i+1)+" in treemap: ");
			System.out.println("Enter the key:(Integers Only) ");
			int key = sc.nextInt();
			System.out.println("Enter the value:(Strings Only) ");
			String value = sc.next();
			tr.put(key, value);
		}
		System.out.println("Enter the value to check value is present or not");
		String value=sc.next();
		if (tr.containsValue(value))
			System.out.println("'"+value+"' Value is present in tree map");
		else
			System.out.println("'"+value+"' Value is not present in tree map");
	}
}
