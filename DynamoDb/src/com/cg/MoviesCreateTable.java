package com.cg;

import java.util.Arrays;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;

public class MoviesCreateTable
{
	public static void main(String[] args) 
	{
		
		  AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withRegion(Regions.US_WEST_2).build();  
		  CreateTableRequest request = new CreateTableRequest().withTableName("customers");
			          request.withKeySchema(new KeySchemaElement()
			         .withAttributeName("customerId")
			         .withKeyType(KeyType.HASH));

			          request.withAttributeDefinitions(new AttributeDefinition()
			         .withAttributeName("customerId")
			         .withAttributeType(ScalarAttributeType.S));

			          request.setProvisionedThroughput(new ProvisionedThroughput()
			         .withReadCapacityUnits((long) 5)
			         .withWriteCapacityUnits((long) 2));
			          client.createTable(request);
			          
			        
			        
			        
		 /*AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
		.withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration("http://localhost:8000", "us-west-2"))
		 .build();*/
         /*DynamoDB dynamoDB = new DynamoDB(client);

		        String tableName = "Movies";

		        try
		        {
		        	System.out.println("Attempting to create table; please wait...");
		        	Table table = dynamoDB.createTable(tableName,
			        Arrays.asList(new KeySchemaElement("year", KeyType.HASH), // Partition
			                                                                          // key
		                    new KeySchemaElement("title", KeyType.RANGE)), // Sort key
		                Arrays.asList(new AttributeDefinition("year", ScalarAttributeType.N),
		                    new AttributeDefinition("title", ScalarAttributeType.S)),
		                new ProvisionedThroughput(10L, 10L));
		            table.waitForActive();
		            System.out.println("Success.  Table status: " + table.getDescription().getTableStatus());

		        }
		        catch (Exception e)
		        {
		            System.err.println("Unable to create table: ");
		            System.err.println(e.getMessage());
		        }*/
		
		    }	 
	}
