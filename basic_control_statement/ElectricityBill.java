/*Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:  
a.	For first 50 units Rs. 0.50/unit 
b.	For next 100 units Rs. 0.75/unit 
c.	For next 100 units Rs. 1.20/unit 
d.	For unit above 250 Rs. 1.50/unit 
e.	An additional surcharge of 20% is added to the bill  
*/
package com.hefshine.control_Statements;
import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double unit,total=0;
		System.out.println("Enter the units");
		unit=sc.nextInt();
		if(unit>=0 && unit<=50)
		{
			total=unit*0.5;
		}
		else if(unit>50 && unit<=150)
		{
			total=(50*0.50+(unit-50)*0.75) ;
		}
		else if(unit>150 && unit<=250)
		{
			total=(100*0.75+(unit-150)*1.20) ;
		}
		else if(unit>250)
		{
			total=(100*1.20+100*0.75+50*0.5+(unit-250)*1.50) ;
		}
		else 
		{
			System.out.println("Enter unit's correctly");
		}
		double amount=(total*20)/100;
		System.out.println("Total electricity bill:"+(amount+total));
	}

}
 