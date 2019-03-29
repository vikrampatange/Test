package com.cg;

public class SingleParameter {

	public static void main(String[] args) 
	{
		MyFunctionalInterface f=(num)->num + 5;
		
	    System.out.println(f.incrementByFive(22));
	}

}
