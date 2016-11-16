package com.learning.practice;

public class TwoWheelers implements vehicle {

	public TwoWheelers()
	{
		System.out.println("COnstructor");
	}
	 public void run()
	{
		System.out.println("run");
	}
	
	public void flow()
	{
		System.out.println("flow");
	}
	
	public void fly()
	{
		System.out.println("fly");
	}
	
	public void run1()
	{
		System.out.println("run1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TwoWheelers tw = new TwoWheelers();
		
		tw.run();
		tw.run1();
		
		
	}

}
