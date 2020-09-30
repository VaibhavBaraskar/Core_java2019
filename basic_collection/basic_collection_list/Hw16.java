//16.	WAP to use add all elements to ArrayList
package com.hefshine.collection_list;

import java.util.ArrayList;

public class Hw16 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		
		
		ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add(4);
		a2.add(5);
		a2.add(6);
		System.out.println(a2);
	}

}
