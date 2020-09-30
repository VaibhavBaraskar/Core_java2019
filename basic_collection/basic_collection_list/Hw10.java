//10.	WAP to convert collection into array
package com.hefshine.collection_list;

import java.util.*;

public class Hw10 {
public static void main(String[] args) {
	ArrayList l1 = new ArrayList();
	l1.add("Onkar");
	l1.add("Rushi");
	l1.add("Kalpesh");
	l1.add("Hefshine");
	System.out.println("Collection");
	System.out.println(l1);
	Object arr[]=l1.toArray();
	System.out.println("After Collection to array: ");
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
}
}
