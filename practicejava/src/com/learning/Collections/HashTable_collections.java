package com.learning.Collections;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

public class HashTable_collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		
		h1.put(1, "Balaji");
		h1.put(2,"VInay");
		h1.put(3, "Ajay");
		
		
		for(Map.Entry m1:h1.entrySet())
		{
			System.out.println(m1);
		}
		
	}

}
