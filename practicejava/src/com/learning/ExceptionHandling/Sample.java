package com.learning.ExceptionHandling;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
//		
//		int a[]=new int[]{1, 2, 3, 4, 5};
//		
//		System.out.println(a[5]);
		
		try
		{
//		String s =null;
//		
//		System.out.println(s.length());
			
			int a[] = new int[]{1, 2, 3};
			
			System.out.println(a[4]);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Execptio :  " + e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index Out of bound exception :   " + e );
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		int i = 50;
		System.out.println(i);
		
		
		
		
	}

}
