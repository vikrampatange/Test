package com.cg;

import java.util.ArrayList;
import java.util.List;

public class IteratingCollection 
{
	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<String>();
		//System.out.println(list.size());
		list.add("Rick");
		list.add("Negan");
		list.add("Daryl");         
	    list.add("Glenn");         
	    list.add("Carl");
	    list.forEach((names)->System.out.println(names));
	    
	    
	}

}
