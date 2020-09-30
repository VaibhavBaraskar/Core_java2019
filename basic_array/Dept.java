package com.hefshine.basic_array;

public class Dept {
	int did;
	String name;
	Dept(int did,String name)
	{
		this.did=did;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", name=" + name + "]";
	}
	
}
