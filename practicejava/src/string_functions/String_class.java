package string_functions;

public class String_class {

	

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello World";
		String s2 = "hello World";
		String s1 = "Java";
		
//		//Concatenation
//		System.out.println(s.concat(s1));
//		
//		//Concatenation without string function
//		System.out.println(s + " " +s1);
//		
		
		//split function
		s.split(" ");
		
		for(String n : s.split(" "))
		{		
		System.out.println(n);
		}
		
		//replace function
		
		String n = s.replace('H', 'n');
		
		System.out.println(n);
		
		
		//Length of the string
		System.out.println(s.length());
		
		//equals
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		
		//lowercase conversion
		System.out.println(s.toLowerCase());
		
		//Uppercase
		System.out.println(s.toUpperCase());
		
		//Trim
		String s5 = "              Hello  World               ";
		System.out.println(s5.trim());
		
		//Finds the position of character in string
		System.out.println(s.indexOf('o'));
		
		
		System.out.println(s.substring(6,8));
		
		
		
	}

}
