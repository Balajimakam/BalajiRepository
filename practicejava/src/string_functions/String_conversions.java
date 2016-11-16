package string_functions;

import java.util.Arrays;

public class String_conversions {

	
	public  static String  reverse(String s1)
	{
		char [] c = s1.toCharArray();
		
		String s2 = "";
		for(int i=s1.length()-1; i>=0; i--)
		{		
			//System.out.println(c[i]);
				
			s2 = s2+c[i];
		}	
		return s2;
	}
	
	public static String palindrome_Check(String s)
	{
		
		String Result;
		if(s.equals(reverse(s)))
		{
			Result = s +" : is Palindrome";
		}
		
		else
		{
			Result = s +" : is not Palindrome";
		}
		
		return Result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "DAD";
		
		
		String Palindrome_Result = palindrome_Check(s); //--> dlroq olleH
		
		System.out.println(Palindrome_Result);
		
		
		
	}

}
