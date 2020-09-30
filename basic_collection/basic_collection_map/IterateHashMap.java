//10.	WAP to get all the entries from a HashMap. Iterate the entries and print the Key & Value values
package com.hefshine.collections_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class IterateHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values you want?");
		int size = sc.nextInt();
		System.out.println("Enter the elements: \n");
		HashMap hm = new HashMap();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the element "+(i+1)+" in hashmap: ");
			System.out.println("Enter the key:(Integers Only) ");
			int key = sc.nextInt();
			System.out.println("Enter the value:(Strings Only) ");
			String value = sc.next();
			hm.put(key, value);
		}
		Iterator itr=hm.entrySet().iterator();
		
		while(itr.hasNext())
		{
			System.out.println("Elements in hash map is: "+itr.next());
		}
	}

}
