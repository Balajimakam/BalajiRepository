package com.learning;

public class String_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Three ways of creating string object
		String s1= "Welcome";
		String s2 = new String("to");
		char[] a = {'j','a','v','a'};
		String s3 = new String(a);
		
		System.out.println(s1 +" "+s2 +" "+s3);
		
		//Length of String s1
		System.out.println(s1.length());
		
		//gives the value of index mentioned
		System.out.println(s1.charAt(4));
		
		//gives substring		
		System.out.println(s1.substring(3));
		
		
		//joining the string
		String s4 = String.join("-",s1,s2,s3);
		System.out.println(s4);
		
		//Check the equality of string
		boolean b1 = s1.equals(s2);
		System.out.println(b1);
		
		//Concatenation		
		System.out.println(s1.concat("Balaji"));
		
		//Check substring exists in string or not
		System.out.println(s4.contains(s1));
		
		//equals and ignore case
		String s10 ="welcome";
		System.out.println(s1.equalsIgnoreCase(s10));
		
		
		//Replacing the word in string
		String s11 =s1.replace("come", "alll");
		System.out.println(s11);
		
		//split the string 
		String s12[] = s4.split("-");
		
		for (String split1 : s12) {
			System.out.println(split1);
		}
		
		
		
		
	}

}
