package com.learning.Collections;

import java.util.LinkedHashSet;

public class A_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> s = new LinkedHashSet<String>();
		
		s.add("Balaji");
		s.add("Ajay");
		s.add("Naveena");
		s.add("Balaji");
		s.add("zaheer");
		
		
		for(String n: s)
		{
			System.out.println(n);
		}
	}

}
