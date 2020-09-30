//14.	WAP to get a reverse order view of the keys contained in a given map TreeMap
package com.hefshine.collections_map;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;

class MyComparator5 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;
		if (I1 < I2) {
			return 1;
		} else if (I1 > I2) {
			return -1;
		} else {
			return 0;
		}

	}

}

public class ReverseOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elemetnts you want?");
		int size = sc.nextInt();
		System.out.println("Enter the elements in a map: ");
		TreeMap tr = new TreeMap(new MyComparator5());
		for (int i = 0; i < size; i++) {

			System.out.println("\nEnter the " + (i + 1) + " element");
			System.out.println("Enter the key:(Integers only)");
			int key = sc.nextInt();
			System.out.println("Enter the value:(Strings only)");
			String value = sc.next();
			tr.put(key, value);
		}
		System.out.println("Values in tree map is: " + tr);

	}
}
