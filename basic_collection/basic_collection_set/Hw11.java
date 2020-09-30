//11.	WAP to empty a HashSet.
package com.hefshine.collection_set;

import java.util.HashSet;

public class Hw11 {

	public static void main(String[] args) {
	HashSet hs=new HashSet();
	System.out.println("is Hash set empty? "+hs.isEmpty());
	hs.add(5);
	hs.add(5);
	hs.add(5);
	hs.add(5);
	System.out.println("\nis Hash set empty? "+hs.isEmpty());
	hs.clear();
	System.out.println("\nis Hash set empty? "+hs.isEmpty());
	}
}
