//19.	WAP to compare two ArrayLists print if equal?
package com.hefshine.collection_list;

import java.util.ArrayList;

public class Hw19 {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		ArrayList a2 = new ArrayList();
		a2.add(4);
		a2.add(5);
		a2.add(6);
		if(a1.equals(a2))
		System.out.println(" "+a1);
		else
			System.out.println("Array List is not equal: ");
	}

}
