/*5.	In our FaceBook profile,  we would like to hide the age, marital status 
and phone number information to the external world. 
This can be done using encapsulation where the fields are made private and can be accessed only by the accessor
(getter) and mutator (setter)methods.  */
package com.hefshine.polymorphism_encapsulation;

import java.util.Scanner;

public class Facebookprofile {

	private int age;
	private String marital_status;
	private long phone_no;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	
	
}
class MainFace
{
	public static void main(String[] args) {
		
		Facebookprofile obj = new Facebookprofile();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value for age");
		int age=sc.nextInt();
		System.out.println("enter value for marital state");
		String marsat=sc.next();
		System.out.println("enter value for phone no");
		long phone=sc.nextLong();
		
		obj.setAge(age);
		obj.setMarital_status(marsat);
		obj.setPhone_no(phone);
		
		
		
		System.out.println(obj.getAge());
		System.out.println(obj.getMarital_status());
		System.out.println(obj.getPhone_no());
				
	}
}