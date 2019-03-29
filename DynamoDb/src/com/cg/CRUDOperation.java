package com.cg;
import java.util.ArrayList;
import java.util.List;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;

public class CRUDOperation 
{

	public static void main(String[] args) 
	{
		//System.out.println("Hello");
		createExampleTable();

    }

	private static void createExampleTable() 
	{
		List<AttributeDefinition> attributeDefinitions = new ArrayList<AttributeDefinition>();
		System.out.println("attributeDefinitions:"+attributeDefinitions);		
	}
}
