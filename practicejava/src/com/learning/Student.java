package com.learning;

public class Student implements Person{

	private static int rno;
	private String name;
	private String gender;
	private int maths_marks;
	private int sceince_marks;
	private static String schoolname;
	
	public Student(String name,String gender, int maths_marks, int sceince_marks )
	{
		this.name = name;
		this.gender = gender;
		this.sceince_marks = sceince_marks;
		this.maths_marks = maths_marks;
		
		System.out.println("Student name: " +name);
	}
	
	public void courseSelection(int sceince_marks, int maths_marks)
	{
		if(sceince_marks>80 && maths_marks>50)
		{
			System.out.println("Select MBBS course");
		}
		else if(sceince_marks>50 && maths_marks>80)
		{
			System.out.println("Select BE course");
		}
		
		else
		{
			System.out.println("Not elgible for Course");
		}
	}


	public void running() {
		// TODO Auto-generated method stub
		System.out.println("running");
	}

	public void swimming() {
		// TODO Auto-generated method stub
		System.out.println("Swimming");
	}

	public void learning() {
		// TODO Auto-generated method stub
		System.out.println("Learning");
	}

	public static void main(String[] args) {
		
		Student s = new Student("AAA", "Male", 60, 90);
		Student s1 = new Student("BBB", "Female", 90, 70);
		s.courseSelection(s.sceince_marks, s.maths_marks);
		s1.courseSelection(s1.sceince_marks, s1.maths_marks);
	}
	
}
