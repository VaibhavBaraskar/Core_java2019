package com.hefshine.stringbuffer;

public class ProblemStatement1 {

	public static void main(String[] args) {
		String str="Welcome to Java world";
		System.out.println(str.charAt(5));
		String str2="WELCOME";
		String str3="welcome";
		System.out.println(str2.compareToIgnoreCase(str3));
		System.out.println(str.concat(" “- Let us learn"));
		System.out.println(str.indexOf('a'));
		System.out.println(str.replace('a', 'e'));
		System.out.println(str.substring(4, 10));
		System.out.println(str.toLowerCase());
	}

}
