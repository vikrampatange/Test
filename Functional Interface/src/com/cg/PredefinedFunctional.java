package com.cg;

import java.util.function.IntBinaryOperator;

public class PredefinedFunctional
{
	public static void main(String[] args)
	{
		   // lambda expression 
		   IntBinaryOperator sum=(a,b)->a+b;
	       System.out.println("Result:"+sum.applyAsInt(12, 100));
	      
	}

}
