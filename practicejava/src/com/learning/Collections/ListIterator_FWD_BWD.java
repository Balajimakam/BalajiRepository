package com.learning.Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_FWD_BWD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<String> a1 = new ArrayList<String>();
			a1.add("Balaji");
			a1.add("Arun");
			
			//select particular element
			System.out.println(a1.get(0));
			
			
			//iterate forward
			ListIterator<String> a2 = a1.listIterator();
			
			while(a2.hasNext())
			{
				System.out.println(a2.next());
			}
			
			while(a2.hasPrevious())
			{
				System.out.println(a2.previous());
			}
	}
}
