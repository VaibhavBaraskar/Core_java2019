
//5.	In our FaceBook profile,  we would like to hide the age, marital status and phone number information to the external world. 
//This can be done using encapsulation where the fields are made private and can be accessed only by the accessor(getter) and mutator (setter)methods
package com.hefshine.polymorphism_encapsulation;
class Fb
{
	int age;
	String status;
}
class S extends Fb
{
	void set()
	{
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
class G extends S
{
	void get()
	{
		
	}
	public int getAge() {
		return age;
	}
	public String getStatus() {
		return status;
	}
}
public class Hw5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G ob=new G();
		ob.setAge(16);
		ob.setStatus("single");
		System.out.println(ob.getAge());
		System.out.println(ob.getStatus());

	}

}
