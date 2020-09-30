//10.	WAP to print all elements of ArrayList using iterator
package com.hefshine.basic_collections_list;

import java.util.*;

public class Cw10 {
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("Onkar");
		l1.add("Rushi");
		l1.add("Hefshine");
		Iterator itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
