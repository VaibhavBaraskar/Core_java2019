//12.	WAP to test is a HashSet is empty or not.
package com.hefshine.collection_set;

import java.util.HashSet;

public class Hw12 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		System.out.println("Hash set is empty? "+hs.isEmpty());
		hs.add(5);
		hs.add(5);
		hs.add(5);
		hs.add(5);
		System.out.println("\nHash set is empty? "+hs.isEmpty());	
	}

}
