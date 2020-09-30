//6.	WAP to get the number of elements in a HashSet.
package com.hefshine.collection_set;

import java.util.*;

public class Hw06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(8);
		hs.add(10);
	System.out.println("Number of element in hash set is: "+hs.size());
	System.out.println(hs);
	}

}
