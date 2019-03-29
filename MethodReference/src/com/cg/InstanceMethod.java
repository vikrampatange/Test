package com.cg;

import java.util.Arrays;

public class InstanceMethod
{

	public static void main(String[] args)
	{
		//System.out.println("Inside InstanceMethod ");
		
		String [] stringArray= {"Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
		//System.out.println(stringArray);
		Arrays.sort(stringArray,String::compareToIgnoreCase);
		for(String str: stringArray)
		{
			System.out.println(str);
			
		}
		

	}

}
