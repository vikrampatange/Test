package com.cg;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Names
{
	
		
		 public static void main(String args[]) {
			 PriorityQueue<Integer>pq = new PriorityQueue<Integer>();
		        
		        pq.offer(2);
		        pq.offer(new Integer(1));
		        pq.offer(3);
		        
		        while (!pq.isEmpty()) {
		            System.out.print(pq.poll() + " ");
		        }
		    }
		} 
