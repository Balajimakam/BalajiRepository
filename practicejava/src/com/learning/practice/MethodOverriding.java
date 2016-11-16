package com.learning.practice;

public class MethodOverriding extends BaseClass{

	
	
	public int run(int a, int b)
	{
		return a-b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MethodOverriding or = new MethodOverriding();
		BaseClass or = new BaseClass();
		System.out.println(or.run(10, 20));
		
	}

}
