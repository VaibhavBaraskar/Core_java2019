//21.	WAP to clone an ArrayList to another ArrayList
package com.hefshine.collection_list;

import java.util.ArrayList;

public class Hw21 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		ArrayList a2=(ArrayList)a1.clone();
		System.out.println(a2);
	}

}
