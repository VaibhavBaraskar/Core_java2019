/*3.	WAP add elements to HashMap without using generics, 
0th location use String as key and Integer as value, on 1st location use String as key String and Integer as value.*/
package com.hefshine.basic_collections_map;

import java.util.Scanner;
import java.util.HashMap;

public class Cw03 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 1; i++) {
			System.out.println("Enter the key(String Only): ");
			String key = sc.next();
			System.out.println("Enter the value(Integer only): ");
			int value = sc.nextInt();
			hm.put(key, value);
			}
		System.out.println(hm);
	}
}