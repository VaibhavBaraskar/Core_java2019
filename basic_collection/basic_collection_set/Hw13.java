//13.	WAP to create a TreeSet from a HashSet.
package com.hefshine.collection_set;

import java.util.HashSet;
import java.util.TreeSet;

public class Hw13 {

	public static void main(String[] args) {
	HashSet hs=new HashSet();
	hs.add(2);
	hs.add(8);
	hs.add(9);
	hs.add(18);
	hs.add(89);
	System.out.println("Elements in hash set is: "+hs);
	TreeSet ts=new TreeSet(hs);
	System.out.println("\nElements in tree set is: "+ts);
	}

}
