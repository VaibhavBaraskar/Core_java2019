//1.	Write a program to accept input from console & write contents in file.
package com.hefshine.InputOutput;

import java.io.*;
import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		File fp = new File("B:/Hefshine/Files/Demo3.txt");
		fp.createNewFile();
		FileWriter fw = new FileWriter(fp);
		System.out.println("Enter the file input: ");

		String s = sc.nextLine();

		fw.write(s);
		fw.flush();
		fw.close();

		BufferedReader br = new BufferedReader(new FileReader(new File("B:/Hefshine/Files/Demo3.txt")));
		System.out.println(br.readLine());
	}

}
