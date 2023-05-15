package com.practice;
import java.util.Arrays;
public class student {
	
	private int id;
	private String name;
	private float Marks;
	
	student()
	{
		
	}
	
	student(int id,String name,float marks)
	{
		this.id=id;
		this.name=name;
		this.Marks=marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return Marks;
	}

	public void setMarks(float marks) {
		Marks = marks;
	}

	@Override
	public String toString() {
		return id+" "+name+" "marks+Arrays.toString(marks);
	}
	
	public void percentage(int marks[])
	{
		float per=0,total=0;
		for(int i=0;i<marks.length;i++)
			total=total+marks[i];
		
		per=(total*100)/500;
		System.out.println(per);
		
	}
}
