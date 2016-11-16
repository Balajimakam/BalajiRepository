package com.learning.Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Operations {

	public static void main(String[] args) {
		
		HashMap<Integer,String> h1 = new HashMap<Integer,String>();
		
		h1.put(2, "bali");
		
		h1.put(3, "ajay");
		
		h1.put(1, "Harsha");
		
		
		h1.replace(1, "Bujji");
		
		for(Map.Entry m:h1.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
	}

}
