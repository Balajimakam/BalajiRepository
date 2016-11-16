package com.learning.Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Treeset is used for ordering purpose, it takes least space but very slow
		
		TreeSet<String> t1 = new TreeSet<String>();
		
		t1.add("Balaji");
		t1.add("Arun");
		t1.add("Harsha");
		
		Iterator itr = t1.iterator();
		
				
				
				
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
