package com.learning.practice;

 class parent 
{
	public int size =30;
}

public class Sample2010 extends parent{

	int size =10;
	
	public void print(int size)
	{
		// size =20;
		
		System.out.println(size);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2010 s = new Sample2010();
		//System.out.println(s.size);
		
		parent p = new parent();
		s.print(s.size);
	}

}
