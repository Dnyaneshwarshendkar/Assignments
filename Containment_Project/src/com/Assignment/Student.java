package com.Assignment;

public class Student {
	
	private static final int Course = 0;
	private int id;
	private String name;
	private int age;
	private Course course;
	
	Student()
	{
		
	}
	
	Student(int id,String name,int age,Course course)
	{
		this.id=id;
		this.age=age;
		this.name=name;
		this.course=course;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setCourse(Course course)
	{
		this.course=course;
	}
	public Course getCourse()
	{
		return course;
	}
	
	public String toString()
	{
		return +id+" "+name+" "+age+" "+Course;
	}
	
	
}
