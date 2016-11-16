package com.learning.practice;

public class Child extends BaseClass{

	Child()
	{
		System.out.println("child construcot");
	}
	
	Child(String a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		BaseClass c = new BaseClass();
//		
	new Child("ABN");
	
		//new BaseClass();
		
	//new BaseClass("ABN");
	//Child c = new Child();
	
	Child c = (Child) new BaseClass();
	
	BaseClass b = new Child();
	
//		c.base();
//		
//		System.out.println(c.a);
	}

}
