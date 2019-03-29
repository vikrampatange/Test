package com.cg;

public class Example2 implements MyInterface,MyInterface2
{
	@Override
	public void existingMethod(String str)
	{
		System.out.println("String is: "+str); 
		
	}
	@Override
	public void disp(String str)
	{
		System.out.println("String is: "+str); 
		
	}
	 //Implementation of duplicate default method
	@Override
	public void newMethod() 
	{
		
		System.out.println("Implementation of default method");
	
	}
	public static void main(String[] args) 
	{
		//System.out.println("Inside Example2");
		
		Example2 obj=new Example2();
		obj.newMethod();
	
	}

	

	

	

}
