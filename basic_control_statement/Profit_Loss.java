//7.	Write a program to calculate profit or loss. 
package com.hefshine.control_Statements;
import java.util.Scanner;
public class Profit_Loss {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double cost,sell,loss,profit;
		System.out.println("Enter the cost price");
		cost=sc.nextDouble();
		System.out.println("Enter the selling price");
		sell=sc.nextDouble();
		if(sell>cost)
		{
			profit=sell-cost;
			System.out.println("Profit: "+profit);
		}
		else if(sell<cost)
		{
			loss=cost-sell;
			System.out.println("Loss: "+loss);
		}
		else
		{
			System.out.println("No Profit No Loss");
		}
		
	}

}
