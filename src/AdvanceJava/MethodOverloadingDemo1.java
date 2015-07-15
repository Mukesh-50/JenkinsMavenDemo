package AdvanceJava;

/*
 * 
 * This program will cover overloading in Java with Static and Non static methods
 * 
 * 
 */


public class MethodOverloadingDemo1 {

	public static void main(String[] args) {
	
		MethodOverloadingDemo1 obj1=new MethodOverloadingDemo1();
		
		obj1.add(12, 12, 23);
		
		MethodOverloadingDemo1.add();
		MethodOverloadingDemo1.add(34.6, 12);
		MethodOverloadingDemo1.add(34, 24.5);
		
	}
	
	
    public static void add(int a,double b)
    {
		
		double  c=a+b;
		System.out.println("Data with 2 argu "+c);
	}
    
    public static void add(double b,int a)
    {
    	double  c=a+b;
		System.out.println("Data with 2 argu but order changed "+c);
		
	}

	public static void add(){
		
		System.out.println("Default add with zero Argument");
		
	}

	
    public void add(int a,int b){
		
		
	}
    
    public void add(double a,double b){
    	
    	
    }
    
    public void add(int a,int b,int c){
		
		
  	}
    
    
    
	
}
