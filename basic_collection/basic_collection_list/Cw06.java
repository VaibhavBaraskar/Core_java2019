//6.	WAP to print all the elements of an ArrayList using the position of the elements
package com.hefshine.basic_collections_list;

import java.util.*;

public class Cw06 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList l1 = new ArrayList();
		l1.add("Onkar");
		l1.add("Rushi");
		l1.add("Kalpesh");
		l1.add("Hefshine");
		//System.out.println(l1);
		for(int i=0;i<l1.size();i++)
		System.out.println(l1.get(i));
		
	}
}
