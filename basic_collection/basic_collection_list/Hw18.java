//18.	WAP to copy one ArrayList into another
package com.hefshine.collection_list;

import java.util.ArrayList;

public class Hw18 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		System.out.println("First arraylist: ");
		System.out.println(a1);
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		System.out.println("Second arraylist: ");
		System.out.println(a2);
	}

}
