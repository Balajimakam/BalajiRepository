package com.learning.ExceptionHandling;

public class Finally_keyword {

	public static void main(String[] args) {
		
		//Finally block always executes whether exception is handled or not. In genral finally is used for closing connection or stream etc..
		// Scenario - Exception is handled
		/*try
		{
			int a[] = new int [5];
			a[6] =30;
			
		}catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}
		finally
		{
			System.out.println("Finally block successfully exceuted");
		}*/
		
		//Output
		//java.lang.ArrayIndexOutOfBoundsException: 6
		//Finally block successfully exceuted
		
		
		//Finally block executed when exception is not handled
		/*try
		{
			int a[] = new int [5];
			a[6] =30;
			
		}catch(ArithmeticException e){System.out.println(e);}
		finally
		{
			System.out.println("Finally block successfully exceuted");
		}*/
		
		/*Output:
		 * Exception in thread "main" Finally block successfully exceuted
			java.lang.ArrayIndexOutOfBoundsException: 6
			at com.learning.ExceptionHandling.Finally_keyword.main(Finally_keyword.java:30)

		 */
		
		
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
		
			
		

		/*OUTPUT:
		 * Finally block successfully exceuted
			Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6
			at com.learning.ExceptionHandling.Finally_keyword.main(Finally_keyword.java:48)
		 * */
		 */
	
	}
}



