package com.cg;

public class Example implements MyInterface
{
	
	@Override
	public void existingMethod(String str) 
	{
		System.out.println("String is: "+str); 
	}

	public static void main(String[] args)
	{
		Example obj=new Example();
		obj.newMethod();
		obj.existingMethod("Learning Java 8 ");   
		MyInterface.anothernewMethod();
	}
}
