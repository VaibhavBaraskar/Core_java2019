//8.	WAP to get the number of elements in a TreeSet.
package com.hefshine.collection_set;

import java.util.TreeSet;

public class Hw08 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(8);
		ts.add(9);
		ts.add(5);
		ts.add(60);
		ts.add(20);
		System.out.println("Number of element present in tree set is: "+ts.size());
	}

}
