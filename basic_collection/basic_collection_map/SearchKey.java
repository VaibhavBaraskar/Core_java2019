//3.	WAP to search a key in a TreeMap
package com.hefshine.collections_map;

import java.util.Scanner;
import java.util.TreeMap;

public class SearchKey {
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
		System.out.println("Enter the key to check key is present or not");

		int key=sc.nextInt();
		if (tr.containsValue(key))
			System.out.println("'"+key+"' Key is present in tree map");
		else
			System.out.println("'"+key+"' Key is not present in tree map");
	}
}