package com.learning.ExceptionHandling;

public class ExceptionPropogation_Unchecked {

	
	static void m()
	{
		System.out.println("m block is called");
		int a=50/0;
		
	}
	
	void n()
	{
		System.out.println("n block is called");
		m();
	}
	
	void p()
	{
		
	try
	{
		n();
		System.out.println("p block is called");
	}
	catch(ArithmeticException e){System.out.println(e);}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ExceptionPropogation_Unchecked e = new ExceptionPropogation_Unchecked();
		e.p();
	}

}
