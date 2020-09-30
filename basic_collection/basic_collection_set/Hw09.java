//9.	WAP to create a reverse order view of the elements contained in a given TreeSet.
package com.hefshine.collection_set;

import java.util.*;

public class Hw09 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new Mycomparator());
		ts.add(0);
		ts.add(50);
		ts.add(40);
		ts.add(10);
		System.out.println("Reverse order view: "+ts);
	}
}

class Mycomparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {

		Integer l1 = (Integer) o1;
		int l2 = (Integer) o2;
		if (l1 < l2) {
			return 1;
		} else if (l1 > l2) {
			return -1;
		} else {
			return 0;
		}

	}
}