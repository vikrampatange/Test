package com.cg;

public class C extends A implements I
{

	
	public static void main(String[] args) 
	{
		
		//more priority for class rather than interface
		C c=new C();
		c.show();
	}

}
