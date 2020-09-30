	//2.	WAP to access different methods and variables by creating two objects of a class.

package com.hefshine.basic_oops;

public class TwoObjects {

		void m1() {
			
			int a,b,c;
			a=76;
			b=66;
			c=a+b;
			System.out.println(c);
		}
	void m2() {
			
			int a,b,c;
			a=76;
			b=66;
			c=a-b;
			System.out.println(c);
		}

		public static void main(String[] args) {
			
			
			TwoObjects object = new TwoObjects();
			object.m1();
			object.m2();
			TwoObjects object2 = new TwoObjects();
			object2.m2();

		}

	}

