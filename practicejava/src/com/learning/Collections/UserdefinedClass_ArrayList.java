package com.learning.Collections;

import java.util.ArrayList;

class Student 
{
	int rno;
	String name;
	static String school_name;
	
	Student(int rno, String name)
	{
		this.rno =rno;
		this.name= name;
		
	}
}


public class UserdefinedClass_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student (1, "Balaji");
		Student s2 = new Student (2, "Ajay");
		ArrayList<Student> a1 = new ArrayList<Student>();
		Student s3 = new Student (3, "Harsha");
		a1.add(s3);
		a1.add(s2);
		
		for(Student b1:a1)

		{
			System.out.println(b1.name);
		}
		
	}

}
