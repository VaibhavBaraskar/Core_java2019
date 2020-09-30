//4.	WAP to search the specified collection in this collection
package com.hefshine.basic_collections_list;

import java.util.*;

public class Cw04 {
	
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("Onkar");
		l1.add("Rushi");
		l1.add(13);
		System.out.println(l1);
		ArrayList l2=new ArrayList<>();
		l2.add("Kalpesh");
		l2.addAll(l1);
		System.out.println(l2);
	}


}
