package com.learning;


abstract class shape
{
	abstract void draw();
}

class shape1 extends shape{

	void draw()
	{
		System.out.println("y");
	}
}

public class Abstract_class extends shape{

	void draw()
	{
		System.out.println("IMplemented Abstract class successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		shape a1 = new Abstract_class();
		a1.draw();
		
		shape a2 = new shape1();
		a2.draw();
		
		System.out.println(a1 instanceof shape1);
		
	}

}
