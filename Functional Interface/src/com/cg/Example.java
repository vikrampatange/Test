package com.cg;

public class Example 
{
	public static void main(String[] args)
	{
		MyFunctionalInterface sum=(a,b)->a+b;//lambda expression
		System.out.println("Result: "+sum.addMethod(12, 100));
	}

}
