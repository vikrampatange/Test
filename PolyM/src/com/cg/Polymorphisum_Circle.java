package com.cg;

import java.util.Scanner;
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
	
	
	
	private static double getShape() 
	{
		int r, l, b, s1, s2, s3;
		double pi = 3.14;
		double perimeter;
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter radius of circle:");
	    r = s.nextInt();
	    perimeter = 2 * pi * r;
	    //System.out.println("Perimeter of circle:"+perimeter);
	        
		    return perimeter;
	}
	
	 public static void main(String arString[])
	 {
		 Shape sh=new Circle();
		 sh.draw();
		 double sh1 = getShape(); //some third party logic to determine shape
		//sh1.draw();
		System.out.println(sh1);  	 
	 }



	
}
