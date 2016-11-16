package com.learning.ExceptionHandling;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			try
			{
				int a=30/0;
			}catch(ArithmeticException e){System.out.println(e);}
			
			try
			{
				int num[] = new int [5];
						num[6]=40;
			}catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
			
			
			
		}catch(Exception e){System.out.println(e);}
	}

}
