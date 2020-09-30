//10.	WAP to remove a given element from a TreeSet.
package com.hefshine.collection_set;

import java.util.*;

public class Hw10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet ts = new TreeSet(new Mycomparator());
		ts.add(0);
		ts.add(50);
		ts.add(40);
		ts.add(10);
		System.out.println("Total element of tree set is: "+ts);
		System.out.println("Enter the element to remove: ");
		int element=sc.nextInt();
		ts.remove(element);
		System.out.println("After remove element is tree set is: "+ts);
	}

}
