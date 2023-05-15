package com.Mobile_Management;

import java.util.Scanner;

public class MobileDB {
	
	static Scanner sc=new Scanner(System.in);
	static int x=0;
	
	public void addmobile(Mobile m) 
	{
		System.out.println("Enter Mobile Id:");
		m.setId(sc.nextInt());
		
		System.out.println("Enter Mobile Name:");
		m.setName(sc.next());
		
		System.out.println("Ente Mobile Brand:");
		m.setBrand(sc.next());
		
		System.out.println("Enter Mobile Price:");
		m.setPrice(sc.nextFloat());
		
		System.out.println("=============================");
	}
	
	public void updatemobile(Mobile m[],int id)
	{
		for(int i=0;i<x;i++)
		{
			if(m[i].getId()==id)
			{
				System.out.println(m[i].getName()+" "+m[i].getPrice());
				
				System.out.println("Enter Mobile Name");
				String name=sc.next();
				m[i].setName(name);
				
				System.out.println("Enter Mobile Price");
				float price=sc.nextFloat();
				m[i].setPrice(price);
				break;
			}
		}
	}
	
	public void deletemobile(Mobile[]m,int id)
	{
		boolean flag=false;
		for(int i=0;i<x;i++)
		{
			if(m[i].getId()==id)
			{
				flag=true;
				System.out.println(m[i].getId()+" "+m[i].getName()+" "+m[i].getBrand()+" "+m[i].getPrice());
				
				for(int j=i;j<x-1;j++)
				{
					m[j]=m[j+1];
				}
				m[x-1]=null;
				System.out.println("Mobile"+id+"delete successfully");
				
					if(!flag)
					{
						System.out.println("Mobile not found");
					}
				break;
	    }
		
	}
}
	
	public void Viewmobile(Mobile mb[])
	{
		for(int i=0;i<x;i++)
		{
			System.out.println(mb[i]);
		}
	}
	
	public void viewmobileByBrand(Mobile[]m,String brand) 
	{
		for(int i=0;i<x;i++)
		{
			if(m[i].getBrand()==brand);
			System.out.println(m[i].toString());
		}
	}
	

	public static void main(String[] args) 
	{
		MobileDB mdb=new MobileDB();
		
		Mobile m[]=new Mobile[20];
		
		Scanner sc=new Scanner(System.in);
		int choice;
		
		do
		{
			System.out.println("_________MobileDB___________");
			System.out.println("_________Choose Following Options__________");
			System.out.println("1.Add Mobile");
			System.out.println("2.Update Mobile");
			System.out.println("3.View Mobile");
			System.out.println("4.View Mobile By Brand");
			System.out.println("5.Delete mobile");
			System.out.println("------------------------------------------");
		
			System.out.println("Enter Your Choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				if(x<m.length)
				{
					m[x]=new Mobile();
					mdb.addmobile(m[x]);
					x++;
				}
				else
				{
					System.out.println("You have already added maximum mobile");
				}
				break;
				
			case 2:
				System.out.println("Enter Mobile Price to update:");
				int price=sc.nextInt();
				
				System.out.println("Mobile updated Successfully");
				break;
				
			case 3:
				mdb.Viewmobile(m);
				break;
				
			case 4:
				System.out.println("Enter Brand for View Mobile");
				String brand=sc.next();
				mdb.viewmobileByBrand(m,brand);
				break;
				
			case 5:
				System.out.println("Enter Id for delete");
				int id=sc.nextInt();
				mdb.deletemobile(m, id);
				System.out.println("Mobile deleted successfully");
				break;
				
			case 6:
				System.out.println("Invalid Input");
			}
			
			System.out.println("Do you want to perform more operation Yes-1/No-0");
			choice=sc.nextInt();
		}
		
		while(choice==1);
	}

}
			
			
			
		
	
		

