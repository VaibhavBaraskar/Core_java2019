//3.	WAP to remove all of the elements from a HashSet.
package com.hefshine.basic_collection_set;

import java.util.*;

public class Cw03 {

	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(40);
		h1.add(50);
		h1.add(60);
		System.out.println(h1);
		h1.removeAll(h1);
		System.out.println(h1);
	}

}
