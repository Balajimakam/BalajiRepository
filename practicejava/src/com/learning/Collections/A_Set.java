package com.learning.Collections;

import java.lang.reflect.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class A_Set {

	
	
	HashSet s = new HashSet();
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> s = new HashSet<String>();
		
		s.add("Balaji");
		s.add("Ajay");
		s.add("Naveena");
		s.add("zaheer");
		s.remove("Balaji");
		
		
		
//		for(String n : s)
//		{
//			System.out.println(n);
//		}
		
		
		
		for(int i=0; i<s.size(); i++)
		{
			
			System.out.println();
		}
	}

}
