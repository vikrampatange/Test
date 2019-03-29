package com.cg;

public class Noparameter 
{

	public static void main(String[] args)
	{
		
		// lambda expression
    	MyFunctionalInterface msg = ()->
    	{
    		  return "Hello This is lambda expresion";
    	};
        System.out.println(msg.sayHello());
         
	}


}
