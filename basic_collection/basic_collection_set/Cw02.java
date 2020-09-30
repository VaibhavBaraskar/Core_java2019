//2.	WAP to convert a HashSet to an array.
package com.hefshine.basic_collection_set;

import java.util.*;

public class Cw02 {

	public static void main(String[] args) {

		HashSet h1 = new HashSet();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(40);
		h1.add(50);
		h1.add(60);
		System.out.println(h1);
		Object arr[] = h1.toArray();

		for (int i = 0; i < arr.length; i++) {
			System.out.print("  " + arr[i]);
		}
	}

}
