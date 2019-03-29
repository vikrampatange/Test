package com.cg;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;

public class DocumentTableApiExample
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		createTableExample();
		
	}

	private static void createTableExample() 
	{
		List<AttributeDefinition> attributeDefinitions=new ArrayList<AttributeDefinition>();
		//System.out.println(attributeDefinitions);
		attributeDefinitions.add(new AttributeDefinition());
		
			
	}

}
