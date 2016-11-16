package logics;

public class Thirddigit_fromlast {

	public char find_digit(String str, int j)
	{
			char d = 0;
		char[] c = str.toCharArray();
		
		int lstr = str.length();
		
		for(int i=lstr; i>=0; i--)
		{
			if(i==lstr-j)
			{
				d = c[i];
				break;
			}
		}
		return d;
		
	}
	
	
	public String check_even(int i)
	{
		String result;
		if(i%2==0)
		{
			result ="Even";
		}
		else
		{
			result ="Odd";
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thirddigit_fromlast t = new Thirddigit_fromlast();
		
		char h =  t.find_digit("12345678", 3);
		
		
		 int num = Character.getNumericValue(h);
		
		String result = t.check_even(num);
				
		System.out.println("Third digit of given number is: "+h +"   Number is: " +result);
	}

}


