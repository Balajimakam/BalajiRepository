package com.learning.ExceptionHandling;

public class Throw_keyword {

	static void validate(int age) 
	{		if(age<18)
		
			throw  new NullPointerException("not valid");
		
		else
		
			System.out.println("Please vote");
		
	
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		validate(15);
	}

}
