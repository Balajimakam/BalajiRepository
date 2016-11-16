package com.learning.ExceptionHandling;

public class Multicatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		int a[] = new int [5];
		a[6]= 20/0;
		}
		catch(ArithmeticException e){System.out.println(e);}
		catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
		catch(Exception e){System.out.println("Taks 3 is completed");}
		System.out.println("Hello world");
		
		
		
	}

}
