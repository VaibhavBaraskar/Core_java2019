//9.	WAP to copy a TreeMap content to another TreeMap
package com.hefshine.collections_map;

import java.util.Scanner;
import java.util.TreeMap;

public class CopyTreeMAp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values you want?");
		int size = sc.nextInt();
		System.out.println("Enter the elements: \n");
		TreeMap tr1 = new TreeMap();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the element "+(i+1)+" in treemap: ");
			System.out.println("Enter the key:(Integers Only) ");
			int key = sc.nextInt();
			System.out.println("Enter the value:(Strings Only) ");
			String value = sc.next();
			tr1.put(key, value);
		}
		System.out.println("All elements in first tree map is: "+tr1);
		TreeMap tr2 = new TreeMap(tr1);
		System.out.println("All elements in seconnd tree map is"+tr2);
	}

}
