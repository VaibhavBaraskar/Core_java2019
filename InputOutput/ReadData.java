//2.	Write a program to read data from File.
package com.hefshine.InputOutput;

import java.io.*;

public class ReadData {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader(new File("B:/Hefshine/Files/Demo3.txt")));
		
		System.out.println(br.readLine());
	}

}
