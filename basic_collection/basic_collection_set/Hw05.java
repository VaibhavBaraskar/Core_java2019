//5.	WAP to iterate through all elements in a HashSet and print the elements. Observe the order of elements.
package com.hefshine.collection_set;

import java.util.*;

public class Hw05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet hs = new HashSet();
		System.out.println("How many element to be add: ");
		int n = sc.nextInt();
		System.out.println("Enter the element to add: ");
		for (int i = 0; i < n; i++) {
			String ele = sc.next();
			hs.add(ele);
		}
		//System.out.println(hs);
		Iterator itr = (Iterator) hs.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
