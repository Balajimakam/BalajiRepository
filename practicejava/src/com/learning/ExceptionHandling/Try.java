package com.learning.ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Try {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
//		
//		try
//		{
//		int a=50/0;
//		System.out.println(a);
//		
//		}catch(ArithmeticException e){System.out.println(e);
//		}
//		
//		System.out.println("Hello world");
//	}

	String s = "D:\\data.xls";
	
	File f = new File(s);
	
	FileInputStream f1 = new FileInputStream(f);
	
	}
	
}
