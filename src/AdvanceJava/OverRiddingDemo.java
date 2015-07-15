package AdvanceJava;

import CalculationsJava.BaseCalculator;


public class OverRiddingDemo extends BaseCalculator {

	public static void main(String[] args) {
	
		OverRiddingDemo obj1=new OverRiddingDemo();
		obj1.add();
		obj1.sub();
		obj1.add1();
		obj1.calculateEMI();

	}
	
	public int calculateEMI(){
		System.out.println("Your EMI is 2000");
		return 10;
	}
	
	 
	
	   public void add(){
		   
			  System.out.println("Calling Add method from Child Class"); 
		   }
		   
	public void sub(){
			 
		  System.out.println("Calling Sub method from Child Class"); 
	}
	
}
