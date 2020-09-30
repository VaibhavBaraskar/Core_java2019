package com.hefshine.basic_collections_map;

import java.util.Scanner;
import java.util.TreeMap;

public class Cw04 {
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
		System.out.println("Key and value of the given key is: " + tm.ceilingEntry(key));
		
	}
}
