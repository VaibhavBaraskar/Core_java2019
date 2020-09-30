//4.	WAP to create a HashSet from an ArrayList.
package com.hefshine.collection_set;

import java.util.*;

public class Hw04 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		System.out.println("Array List Is: "+a1);
		HashSet hs=new HashSet(a1);
		System.out.println("Hash Set Is: "+hs);
		
	}
}
