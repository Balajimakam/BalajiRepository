package com.learning.practice;

public class MethodOverlaoding extends BaseClass{

	
	public void run()
	{
		System.out.println("run");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MethodOverlaoding m = new MethodOverlaoding();
		//MethodOverlaoding
		//BaseClass b = new BaseClass();
		//b.run();
		//m.run();
		
		BaseClass n = (BaseClass) new MethodOverlaoding();
		
		System.out.println(n instanceof BaseClass);
		n.run();
		
	}

}
