//5.	WAP to get all keys from the given a TreeMap
package com.hefshine.collections_map;

import java.util.Scanner;
import java.util.TreeMap;

public class GetKey {
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
	System.out.println("All keys in tree map is"+tr.keySet());
}
}
