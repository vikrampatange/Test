package com.cg;

import java.util.function.BiFunction;

public class Example
{
	 public void myMethod()
	 {  
			System.out.println("Instance Method ");  
     }  
	public static void main(String[] args) 
	{
		Example obj=new Example();
		
		//this is for method reference to an instance method of an Object
		// Method reference using the object of the class
		/*MyInterface ref=obj::myMethod;
		// Calling the method of functional interface  
		ref.display();	
		BiFunction<Integer, Integer, Integer> product=Multiplication::Multiply;
		int pr = product.apply(11, 5);  
		System.out.println("Product of given number is: "+pr);*/  
		
		MyInterface2 ref = Hello::new;  
        ref.display("This is for the reference to constructor"); 
	}

}
