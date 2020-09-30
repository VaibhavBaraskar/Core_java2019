//14.	WAP to create a new TreeSet, add Strings and print the TreeSet.
package com.hefshine.collection_set;

import java.util.*;

public class Hw14 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		TreeSet ts= new TreeSet();
		System.out.println("How many strings you want? ");
		int size=sc.nextInt();
		System.out.println("Enter string:");
		for(int i=0;i<size;i++)
		{
			String str=sc.next();
			ts.add(str);
		}
		System.out.println(ts);
	}

}
