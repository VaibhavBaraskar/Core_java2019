//2.	WAP to get a key-value mapping associated with the greatest key less than or equal to the given key
package com.hefshine.basic_collections_map;

import java.util.*;

public class Cw02 {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of map: ");
		int size = sc.nextInt();

		for (int i = 0; i < size; i++) {
			// System.out.println("Enter the value: " + (i + 1));

			System.out.println("Enter the key(Integer Only): ");
			int key = sc.nextInt();

			System.out.println("Enter the value(String only): ");
			String value = sc.next();

			tm.put(key, value);
		}
		System.out.println("Enter the key: ");
		int key = sc.nextInt();
		System.out.println("Key and value of the given key is: " + tm.floorEntry(key));
		
	}
}