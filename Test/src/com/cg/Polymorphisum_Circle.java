package com.cg;

import java.security.PublicKey;

public class Polymorphisum_Circle 
{
	
	public void draw()
	{
		System.out.println("Drwaing circle with default color Black and diameter 1 cm.");
	}
	
	public void draw(int diameter)
	{
		System.out.println("Drwaing circle with default color Black and diameter"+diameter+" cm.");
		
	}
	
	public void draw(int diameter, String color)
	{
		
		System.out.println("Drawing acircle with color "+color+"and diameter"+ diameter+"cm");
	}

	
	
}
