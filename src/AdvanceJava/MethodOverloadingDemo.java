package AdvanceJava;

/*
 * 
 * This program will cover overloading in Java
 * 
 * 
 */


public class MethodOverloadingDemo {

	public static void main(String[] args) {
	
		MethodOverloadingDemo obj1=new MethodOverloadingDemo();
		obj1.add(12.5, 12);
		obj1.add(10, 35.5);		
	}
	
	
    public void add(int a,double b)
    {
		
		double  c=a+b;
		System.out.println("Data with 2 argu "+c);
	}
    
    public void add(double b,int a)
    {
    	double  c=a+b;
		System.out.println("Data with 2 argu but order changed "+c);
		
	}
	
	
	public void add(){
		
		
	}

	
    public void add(int a,int b){
		
		
	}
    
    public void add(double a,double b){
    	
    	
    }
    
    public void add(int a,int b,int c){
		
		
  	}
    
    
    
	
}
