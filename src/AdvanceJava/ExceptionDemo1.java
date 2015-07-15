package AdvanceJava;

import java.io.FileNotFoundException;


/*
 * 
 *  Exception Handling using Throws
 * 
 */


public class ExceptionDemo1 {

	public static void main(String[] args) 
	{
		
		ExceptionDemo1 obj1=new ExceptionDemo1();
	

	}

	
	public void div() throws FileNotFoundException {

		int c=45/0;
		
		System.out.println("The Div result is "+c);	
		
	}
	public void GoodByeMsg() throws FileNotFoundException{
		
		System.out.println("Bye");
	}
	
	
}
