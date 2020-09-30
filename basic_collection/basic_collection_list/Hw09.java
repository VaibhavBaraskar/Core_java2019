//9.	WAP to check if collection is empty
package com.hefshine.collection_list;

import java.util.ArrayList;

public class Hw09 {
	public static void main(String[] args) {

	ArrayList l1 = new ArrayList();
	System.out.println(l1.isEmpty());
	l1.add("Onkar");
	l1.add("Rushi");
	System.out.println(l1.isEmpty());
	}
}