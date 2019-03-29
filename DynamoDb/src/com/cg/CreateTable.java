package com.cg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import com.amazonaws.AmazonClientException;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreams;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBStreamsClientBuilder;
import com.amazonaws.services.dynamodbv2.model.AttributeDefinition;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.KeySchemaElement;
import com.amazonaws.services.dynamodbv2.model.KeyType;
import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
import com.amazonaws.services.dynamodbv2.model.ScalarAttributeType;
import com.amazonaws.services.dynamodbv2.model.StreamSpecification;
import com.amazonaws.services.dynamodbv2.model.StreamViewType;
import com.amazonaws.services.dynamodbv2.util.TableUtils;

public class CreateTable 
{

	public static void main(String[] args)
	{
		/*AmazonDynamoDBClient dynamoDB = new AmazonDynamoDBClient();
		Region region = Region.getRegion(Regions.US_EAST_1);
		dynamoDB.setRegion(region);
		
		
		System.out.println("CreateTable");
		 final String USAGE = "\n" +
		            "Usage:\n" +"CreateTable <table>\n\n" +
		            "Where:\n" +
		            "    table - the table to create.\n\n" +
		            "Example:\n" +
		            "CreateTable HelloTable\n";
		 
		 String table_name = args[0];

	        System.out.format(
	            "Creating table \"%s\" with a simple primary key: \"Name\".\n",
	            table_name);
		 
		 if (args.length < 1)
		 {
	            System.out.println("USAGE:"+USAGE);
	            System.exit(1);
	            
	     }
		 
		    CreateTableRequest request = new CreateTableRequest().
		    		withAttributeDefinitions(new AttributeDefinition(
		    "Name", ScalarAttributeType.S)).withKeySchema(new KeySchemaElement("Name", KeyType.HASH))
		     .withProvisionedThroughput(new ProvisionedThroughput(
		       new Long(10), new Long(10))) .withTableName(table_name);
		    
		    final AmazonDynamoDB ddb = AmazonDynamoDBClientBuilder.defaultClient();
		    System.out.println("AmazonDynamoDB:"+ddb);
		    
		    */
		
		 AmazonDynamoDB dynamoDBClient = AmazonDynamoDBClientBuilder
		 .standard().withRegion(Regions.AP_SOUTH_1).withCredentials(new DefaultAWSCredentialsProviderChain())
		  .build();
		 
		 //System.out.println("dynamoDBClient:"+dynamoDBClient);
		   AmazonDynamoDBStreams streamsClient =AmazonDynamoDBStreamsClientBuilder
		   .standard().withRegion(Regions.AP_SOUTH_1)
		    .withCredentials(new DefaultAWSCredentialsProviderChain()).build();
		   //System.out.println("AmazonDynamoDBStreams:"+streamsClient);
		   
		   // Create a table, with a stream enabled
	        String tableName = "TestTable";
	        //System.out.println("tableName:"+tableName);
	        
	       ArrayList<AttributeDefinition> attributeDefinitions = new ArrayList<>(
	         Arrays.asList(new AttributeDefinition().withAttributeName("name")
	         .withAttributeType("N")));
	        
	      // System.out.println("attributeDefinitions:"+attributeDefinitions);
	        
	          ArrayList<KeySchemaElement> keySchema = new ArrayList<>(
	          Arrays.asList(new KeySchemaElement()
	         .withAttributeName("name").withKeyType(KeyType.HASH))); // Partition key
	          //System.out.println("keySchema:"+keySchema);
	          
	          StreamSpecification streamSpecification = new StreamSpecification()
	          .withStreamEnabled(true).withStreamViewType(StreamViewType.NEW_AND_OLD_IMAGES);
	          
	          
	                   CreateTableRequest createTableRequest = new CreateTableRequest().withTableName(tableName)
	                  .withKeySchema(keySchema).withAttributeDefinitions(attributeDefinitions)
	                  .withProvisionedThroughput(new ProvisionedThroughput()
	                  .withReadCapacityUnits(10L)
	                  .withWriteCapacityUnits(10L))
	                  .withStreamSpecification(streamSpecification);
	          
	          System.out.println("Issuing CreateTable request for " + tableName);
	          dynamoDBClient.createTable(createTableRequest);
	          System.out.println("Waiting for " + tableName + " to be created...");
	          
	          try 
	          {
	              try
	              {
					TableUtils.waitUntilActive(dynamoDBClient, tableName);
				  } 
	              catch (InterruptedException e)
	              {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	          } 
	          catch (AmazonClientException e) 
	          {
	              e.printStackTrace();
	          }
	          System.out.println("Performing write activities on " + tableName);
	                         	 
	}

}
