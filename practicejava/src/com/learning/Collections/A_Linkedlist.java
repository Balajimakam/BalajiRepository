package com.learning.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class A_Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> ls = new LinkedList();
		
		  ls.add("1");
		 ls.add("Ajay");
		 ls.add("Naveena");
		 ls.add("Harsha");
		 
		
		 
		 LinkedList<String> lb = new LinkedList<String>();
		 
		 lb.add("Balaji");
		 lb.add("Ajay");
		 lb.add("Harsha");
		 
		 
		 ls.retainAll(lb);
		 
		 
		 
		 
		 
		 
		 Iterator i =  ls.iterator();
		 
		 while (i.hasNext())
		 {
			 System.out.println(i.next());
		 }
		 
		 
	}

}
