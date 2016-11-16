package com.learning.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_AddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a1 =   new ArrayList<String>();
		a1.add("Balaji");
		a1.add("Harsha");
		
		
		ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Harsha");
		a2.add("zaheer");
		a2.addAll(a1);
		
		a2.retainAll(a1);
		//Sorting an array
		Collections.sort(a2);
		
		for(String a3:a2)
		{
			System.out.println(a3);
		}
		
		List <String> ls = new ArrayList();
		
		
		List<String> lb = new LinkedList<String>();
		
		
		
		
	}

}
