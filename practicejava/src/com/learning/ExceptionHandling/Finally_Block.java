package com.learning.ExceptionHandling;

public class Finally_Block {

	

		public static void main(String[] args) {
			
			//Finally block always executes whether exception is handled or not. In genral finally is used for closing connection or stream etc..
			// Scenario - Exception is handled
			
			
			
			//Finally block executed when exception is not handled at all
			try
			{
				int a[] = new int [5];
				a[6] =30;
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("Hello World");
			}
			
				
			
			try
			{
				int a= 50/0;
				System.out.println(a);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("Hello Java");
			}
			
				
			
			int a = 50;
			System.out.println(a);

		
		
		}
	}





