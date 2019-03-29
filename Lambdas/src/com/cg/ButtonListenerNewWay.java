package com.cg;

import java.awt.Button;
import java.awt.Frame;

public class ButtonListenerNewWay {

	/*public ButtonListenerNewWay() 
	{
		// TODO Auto-generated constructor stub
	}*/

	public static void main(String[] args)
	{
		 Frame frame=new Frame("ActionListener java 8");
		 Button b=new Button("Click Here");  
	     b.setBounds(50,100,80,50);  
	     
	     b.addActionListener(e->System.out.println("Hello World!"));
	     frame.add(b);
	     frame.setSize(200,200);  
	      frame.setLayout(null);  
	      frame.setVisible(true);   
	}

}
