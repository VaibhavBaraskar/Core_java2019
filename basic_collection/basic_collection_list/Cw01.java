//1.	WAP to add an element at a particular index using Add().
package com.hefshine.basic_collections_list;

import java.util.*;

public class Cw01 {

	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("Onkar");
		l1.add("Rushi");
		l1.add(13);
		System.out.println(l1);
		System.out.println("adding element at a particular index");
		l1.add(1,"Hefshine");
		System.out.println(l1);
	}

}
