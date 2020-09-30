package com.hefshine.basic_array;

public class MyDate {
		int day,month,year;
		MyDate(int day,int month,int year)
		{
			this.day=day;
			this.month=month;
			this.year=year;
		}
		@Override
		public String toString() {
			return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
		}
		
}
