package com.learning;

public class Propogation {

	
	void s()
	{
		System.out.println("before method s ");
		try
		{
			int n = 50/0;
			System.out.println(n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("After method s ");
	}
	
	void m()
	{
		System.out.println("before method m ");
		s();
		System.out.println("after method m ");
	}
	
	void n()
	{
		System.out.println("before method n ");
		
			m();
		
		System.out.println("after method n ");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Propogation p = new Propogation();
		p.n();
		
	}

}
