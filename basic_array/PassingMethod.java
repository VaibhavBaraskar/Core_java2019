//2.	How to pass array as a parameter to method in java?
package com.hefshine.basic_array;

public class PassingMethod {

	public static int[] getArray(int[] array) {
		return array;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4 };
		int[] records = getArray(numbers);
		for (int i : records) {
			System.out.println(i);
		}

	}

}
