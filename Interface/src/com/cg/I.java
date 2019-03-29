package com.cg;

public interface I 
{
	
	default void show() 
	{
		System.out.println("This is from default method in in interface");
	}

}
