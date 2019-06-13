package com.oops.inheritance;

class Product{
	
	int pid;
	String name;
	int price;
	
	Product()
	{
		System.out.println(">>> Product object constructor");
		
	}
	void setProductionDetails(int pid,String name,int price)
	{
		this.pid=pid;
		this.name=name;
		this.price=price;
	}
	void showProductDetails()
	{
		System.out.println("------------Product ID:"+pid+"----------");
		System.out.println("Name:\t"+name);
		System.out.println("Price:\t"+price);
		System.out.println("------------------------------------------");
		
	}
	void setpid(int pid)
	{
		this.pid=pid;
	}
	int getpid()
	{
		return pid;
	}
}
public class Inheritance {

	public static void main(String[] args) {
		
		Product pro=new Product();
		System.out.println("product is: "+pro);
		
		pro.setProductionDetails(01, "TV", 48000);
		pro.showProductDetails();
		
		Product pro1=new Product();
		pro1.setpid(201);
		pro1.name="Bike";
		pro1.price=80000;
		pro1.showProductDetails();
		
		
		
		
		
		
		
		
			}

}
