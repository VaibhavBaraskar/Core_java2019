//7.	WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)
package com.hefshine.collection_list;

import java.util.*;

public class Hw07 {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		for (int i = 1; i <= 50; i++)
			l1.add(i);
		Iterator itr = l1.iterator();
		System.out.println("Even numbers are: ");
		while (itr.hasNext()) {
			Integer I = (Integer) itr.next();
			if (I % 2 == 0) {
				System.out.println(I);
			}
		}
	}
}
