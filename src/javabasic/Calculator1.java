package javabasic;


public class Calculator1 
{
	
	

	public static void main(String[] args)
	{
	   
	
		System.out.println("Start");
	  
	 
	    Calculator1.add();
		
	    Calculator1.sub();
	    
	    
	    System.out.println("END");
		
    
	}
	
	
   public static void add()
   {
	   
	   int a=89;
	   int b=67;
	   
	   int c=a+b;
	   
	   System.out.println(c);
	   
   }
	
	
   public static void sub()
   {
	   
	   double a=89.5;
	   double b=10.5;
	   
	   double c=a-b;
	   
	   System.out.println(c);
   }
	

}
