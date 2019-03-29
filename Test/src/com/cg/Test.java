package com.cg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test
{

	public static void main(String[] args) throws ClassNotFoundException, IOException
	{
		
		 B b = new B();

		 ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream("datafile"));
		 save.writeObject(b); 
		 save.flush(); 


		 ObjectInputStream restore = null;
		try {
			restore = new ObjectInputStream(new FileInputStream("datafile"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 B z = (B) restore.readObject();



		     }
		     
		 }

