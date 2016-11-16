package com.learning.Collections;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class LinkedHashMap_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LinkedHashMap maintains the insertion order
		
		LinkedHashMap<Integer, String> m1 = new LinkedHashMap<Integer,String>();
		
		m1.put(1, "Balaji");
		m1.put(4, "Vinay");
		m1.put(2, "Ajay");
		

		
		for(Map.Entry n1: m1.entrySet() )
		{
			System.out.println(n1.getKey()+" "+n1.getValue());
		}
	}

}
