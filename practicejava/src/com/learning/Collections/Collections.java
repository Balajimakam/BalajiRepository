package com.learning.Collections;

import java.util.ArrayList;
import java.util.Iterator;


public class Collections {

	

	public static void main(String[] args) {
		
		ArrayList<String> n = new ArrayList<String>();
		
		n.add("Balaji");
		n.add("Sandeep");
		n.add("Ajayseshu");
		n.add("Vinay");
		n.add("Arun kumar");
		
		/*Iterator i= n.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());			
		}*/
		
		for(String i:n)
		{
			System.out.println(i);
		}
		
	}

	

}
