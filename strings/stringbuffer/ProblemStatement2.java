package com.hefshine.stringbuffer;

public class ProblemStatement2 {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("I am a StringBuffer");
		System.out.println(sb.append("”- This is a sample program” "));
		System.out.println(sb.insert(21,sb));
		System.out.println(sb.reverse());
		StringBuilder sb1=new StringBuilder(sb);
		System.out.println(sb1);
		try
		{
			int c=5/0;
		}
		catch(Exception e)
		{
			System.out.println();
			
		}
		finally {
			
			try {
				int c=5/0;	
			}
			catch(Exception e)
			{
				System.out.println();
			}
		}
	}

}
