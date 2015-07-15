package AdvanceJava;
/*
 * 
 *  Exception Handling using Try Catch
 * 
 */
import java.util.InputMismatchException;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		ExceptionDemo obj1=new ExceptionDemo();
		obj1.div();
		obj1.GoodByeMsg();

	}

	
	public void div(){
		
		
		try
		{
	
		int c=45/0;
		
		System.out.println("The Div result is "+c);
		
		}
		
		
		catch(ArithmeticException e)
		{
			System.out.println("Please dont enter zero in denominator");
			System.out.println(e.getMessage());
		}
		
		catch(InputMismatchException e){
			
			
		}
	
		catch(Exception e)
		{
			
		}
		
	    catch(Throwable e){
			
			
		}
		
		finally
		{
			
		 System.out.println("Closing Database");
		}
		
	
	
	}
	public void GoodByeMsg(){
		
		System.out.println("Bye");
	}
	
	
}
