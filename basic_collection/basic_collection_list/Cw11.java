//11.	WAP to iterate through all elements in an ArrayList using for loop
package com.hefshine.basic_collections_list;

import java.util.ArrayList;
import java.util.Iterator;

public class Cw11 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add(8);
		al.add(9);
		al.add(0);
		
		Iterator itr=(Iterator) al.iterator();
		for(int i=0;i<al.size();i++)
		{
			System.out.print(itr.next()+" ");
		}
	}

}
