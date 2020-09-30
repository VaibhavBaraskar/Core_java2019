//13.	WAP to iterate through all elements in a linked list.
package com.hefshine.collection_list;

import java.util.*;

public class Hw13 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(1);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		
		Iterator itr=l1.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}

}
