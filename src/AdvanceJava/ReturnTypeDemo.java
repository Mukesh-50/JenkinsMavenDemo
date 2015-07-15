package AdvanceJava;

/*
 * 
 * This program will cover overloading in Java with Static and Non static methods
 * 
 * 
 */


public class ReturnTypeDemo {

	public static void main(String[] args) {
	
		ReturnTypeDemo obj1=new ReturnTypeDemo();
		
	   String msg_new= ReturnTypeDemo.add();
		
	   System.out.println(msg_new);
	   
	   
	  double result= obj1.add(12.45, 34.2);
	  System.out.println(result);
		
	 
		
	}
	
	
  

	public static String add(){
	
		String msg="Hello Welcome to Add Program";
		
		return msg;
	}

	
	 public void add1(double a,double b){
	    	
	    	
	    	double c=a+b;
	    	
	    	
	    }
    
    public double add(double a,double b){
    	
    	
    	double c=a+b;
    	
    	return c;
    }
    
  
    
    
    
	
}
