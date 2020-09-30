//7.	WAP to get the first and last elements in a TreeSet.
package com.hefshine.collection_set;
import java.util.*;
public class Hw07 {

	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(1);
		ts.add(5);
		ts.add(9);
		ts.add(10);
		System.out.println("First element in tree set is: "+ts.first());
		System.out.println("Last elemnt in tree set is:  "+ts.last());
	}

}
