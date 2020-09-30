//7.	WAP to get only the Values from a HashMap
package com.hefshine.collections_map;

import java.util.Scanner;
import java.util.HashMap;

public class GetValuesHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values you want?");
		int size = sc.nextInt();
		System.out.println("Enter the elements: \n");
		HashMap hm = new HashMap();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the element "+(i+1)+" in treemap: ");
			System.out.println("Enter the key:(Integers Only) ");
			int key = sc.nextInt();
			System.out.println("Enter the value:(Strings Only) ");
			String value = sc.next();
			hm.put(key, value);
		}
		System.out.println("All values in hash map is"+hm.values());
	}

}
