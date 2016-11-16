package com.learning.Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset_FWD_BWD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Linked Hashset values is the list of values where duplicates are not allowed
		LinkedHashSet<String> a1= new LinkedHashSet<String>();
		
		a1.add("Balaji");
		a1.add("Harsha");
		a1.add("Balaji");
		a1.add("Arun");
		
		
		//Iterator is used to rotate the values of linked Hash  set values
		Iterator<String> a2 = a1.iterator();
		while(a2.hasNext())
		{
			System.out.println(a2.next()); 
		}
		
		
		// Linked Hashset order is predictable whereas Hashset order is unpredicatable
		
		// LInkedHashset takes momre space compared to Hashset and Treeset
		
		
		
	}

}
