/*4.	Create class Dept(did, dname), class MyDate(day, month, year) 
Class Employee(emp_id, emp_name, salary, MyDate (object), dept(object)). Create array of Employee and display the array elements.
*/
package com.hefshine.basic_array;

import java.util.Scanner;

public class Employee {
			int eid;
			String ename;
			float salary;
			Dept dept;
			MyDate mydate;
			
			Employee(int eid,String ename,float salary,Dept dept,MyDate mydate)
			{
				this.eid=eid;
				this.ename=ename;
				this.salary=salary;
				this.dept=dept;
				this.mydate=mydate;
			}
			
			@Override
			public String toString() {
				return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", dept=" + dept
						+ ", mydate=" + mydate + "]";
			}

			void display() {
				System.out.println("Details of employee is: ");
				System.out.println(dept);
				System.out.println(mydate);
			}
			public static void main(String []args)
			{
				Scanner sc=new Scanner(System.in);
//				
//				System.out.println("Enter the id of department: ");
//				int id=sc.nextInt();
//				System.out.println("Enter the name of department: ");
//				String name=sc.next();
//				Dept dep=new Dept(id,name);
//				System.out.println("Enter the day,month and year: ");
//				int day=sc.nextInt();
//				int month=sc.nextInt();
//				int year=sc.nextInt();
//				MyDate mydate=new MyDate(day,month,year);
//				System.out.println("Enter the employee id: ");
//				int eid=sc.nextInt();
//				System.out.println("Enter the employee name: ");
//				String ename=sc.next();
//				System.out.println("Enter the employee salary");
//				float salary=sc.nextFloat();
				Employee emp[]=new Employee[2];
				emp[0]=new Employee(1," Rushikesh",25000, new Dept(1,"Computer_Science"),new MyDate(19,06,1999));
				emp[0].display();
				emp[1]=new Employee(2,"Onkar",30000,new Dept(2,"Computer_Engineering"),new MyDate(01,06,1999));
				emp[1].display();
			}
}
