package com.learning.ExceptionHandling;

class InvalidAgeException extends Exception
{
	InvalidAgeException(String s) {
	
	super(s);
	}
}

public class CustomException_Sample {

	
	 void age(int age) throws InvalidAgeException
	{
		if(age<=18)
		{
			throw new InvalidAgeException("not valid");
		}
		else
		{
			System.out.println("Valid Age");
		}
	}
	public static void main(String[] args) throws InvalidAgeException{
		
		CustomException_Sample c = new CustomException_Sample();
		c.age(16);

	}

}
