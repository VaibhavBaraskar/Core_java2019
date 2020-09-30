//7.	WAP to split string into 2 tokens where string is “HELLO=WORLD”
package com.hefshine.basic_string;
public class Split {

	public static void main(String[] args) {
		System.out.println("String split of Hello  world is : ");
		String array[] ="Hello world".split(" ");
		for(String string : array)
			System.out.println(string);
	}

}
