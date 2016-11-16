package com.learning;

class parent
{
	int add(int a, int b)
	{
		return a;
	}
}
public class Overriding extends parent {

	int add(int a, int b)
	{
		System.out.println("Additinon of two integers is:" + (a+b));
		return a-b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Overriding o = new Overriding();
		o.add(20,10);
		System.out.println(o.add(10,10));
	}

}
