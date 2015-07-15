package javabasic;


public class Calculator 
{
	
	

	public static void main(String[] args)
	{
	   
		// First statement of main will be entry
		
	   // Classname object-name=new Classname();
		
	    Calculator obj1=new Calculator();	
	
	// to Call non static method in java we have to use object and we need to call method using . operator  
	
		System.out.println("Start");
	  
	    obj1.add();
	  
	    obj1.sub();
	    
	    
	    System.out.println("END");
		
    // Last statement of main will be exit
	}
	
	
   public void add()
   {
	   
	   int a=89;
	   int b=67;
	   
	   int c=a+b;
	   
	   System.out.println(c);
	   
   }
	
	
   public void sub()
   {
	   
	   double a=89.5;
	   double b=10.5;
	   
	   double c=a-b;
	   
	   System.out.println(c);
   }
	

}
