//1.	WAP to iterate through all elements in a TreeSet.
package com.hefshine.collection_set;

import java.util.*;

public class Hw01 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(5);
		ts.add(7);
		ts.add(1);
		ts.add(8);
		System.out.println(ts);
		Iterator itr = (Iterator) ts.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "  ");
		}
	}

}
