package com.learning.Collections;

import java.util.HashSet;

public class Hashset_Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Hashset is fatser compared to LinkedhAshset and Treeset
		HashSet<String> a1 = new HashSet<String>();
		a1.add("Balaji");
		a1.add("Arun");
		a1.add("Balaji");
		
		//Hashset removes duplicate elements
		
		for(String a2:a1)
		{
			System.out.println(a2);
		}
	}

}
