package com.learning;

class parentclass
{
	void parentclass()
	{
		System.out.println("parent class construcotr is called");
	}
	void display()
	{
		System.out.println("Parent class is called");
	}
}

public class Inheritance extends parentclass{

	void Inheritance()
	{
		System.out.println("Child class construcotr is called");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inheritance i = new Inheritance();
		System.out.println(i instanceof Inheritance);
		
	}

}
