package com.learning.Collections;

import java.util.ArrayList;

public class ArrayList_Removeall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Balaji");
		a1.add("Ajay");
		
		for(String a2:a1)
		{
		System.out.println(a2);
		}
		
		a1.removeAll(a1);
		
		
		
		if (a1.isEmpty())
		{
			System.out.println("Arrya is Empty");
		}
		else
		{
				for(String a2:a1)
				{
				System.out.println(a2);
				}
		}		}
		
		
	}


