package com.learning.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map m1 = new HashMap();
		
		m1.put(1, "Balaji");
		m1.put(2, "Ajay");
		m1.put(3, "Vinay");
		
		System.out.println( m1.containsKey(1));
		
		
		
		System.out.println( m1.get(1));
		
		m1.remove(2);
		for(int i=0; i<=3; i++)
		{
		System.out.println(m1.get(i));
		}
		
		
		
	
	}

}
