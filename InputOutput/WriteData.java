package com.hefshine.InputOutput;

import java.io.*;
import java.util.Scanner;

public class WriteData {

	public static void main(String[] args) throws Exception {
		File fp = new File("B:/Hefshine/Files/Demo4.txt");
		fp.createNewFile();
		FileWriter fw = new FileWriter(fp);
		

		fw.write("Hello");
		fw.write("Java");
		fw.flush();
		fw.close();
	}

}
