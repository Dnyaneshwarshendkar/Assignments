package com.HashMap;

public class Employee {
	
	
	private int eid;
	private String name;
	private float salary;
	private Object obj;
	
	public Employee()
	{
		super();
	}
	
	public Employee(int eid,String name,float salary)
	{
		super();
		this.eid=eid;
		this.name=name;
		this.salary=salary;
	}
	
	@Override
	public int hashCode()
	{
		return eid+name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(this.getClass()!= obj.getClass())
			return false;
		
		Employee e=(Employee)obj;
		return(eid==e.eid)&&(name.equals(e.name));
		
		
	}
	
}

