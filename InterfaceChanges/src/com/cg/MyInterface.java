package com.cg;

public interface MyInterface 
{

	//static method
	static void anothernewMethod()
	{
		System.out.println("Newly added static method");
	}
	
	 default void newMethod()
	 {
		 System.out.println("Newly added default method");   
	 }
	 void existingMethod(String str); 
}
