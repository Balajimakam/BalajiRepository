package com.learning.ExceptionHandling;


class ABC
{
	void display() 
	{
		System.out.println("parent class");
		
	}

}
public class ExceptionHandling_MethodOverriding_Unchecked extends ABC {

	void display()
	{
		try
		{
			int a=50/0;
		}catch (Exception e){
			System.out.println(e);
		}
		System.out.println("Child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ABC a = new ExceptionHandling_MethodOverriding_Unchecked();
		a.display();
	}

}
