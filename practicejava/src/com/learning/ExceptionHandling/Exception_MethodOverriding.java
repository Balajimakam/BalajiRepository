package com.learning.ExceptionHandling;


class A
{
	void display() throws Exception
	{
		System.out.println("parent class");
		throw new Exception("invalid exception for class A");
	}
}

public class Exception_MethodOverriding extends A{

	void display() throws Exception 
	{
		System.out.println("child class");
		throw new Exception("Invalid exception");
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		A a = new Exception_MethodOverriding();
		a.display();
		
	}

}


