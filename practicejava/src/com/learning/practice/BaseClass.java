package com.learning.practice;

public class BaseClass {

	public int a=10;
	private int b=20;
	protected int c=30;
	int d =40;
	
	public BaseClass()
	{
		System.out.println("Baseclass consturcot");
	}
	
	public BaseClass(String a)
	{
		System.out.println(a);
	}
	
	public void run()
	{
		System.out.println("parent -run");
	}
	
	public int run(int a, int b)
	{
		
		return a+b;
	}
	
	public void base()
	{
		System.out.println("Bae mehotd");
		System.out.println(b);
	}
	

}
