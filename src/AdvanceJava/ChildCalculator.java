package AdvanceJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import CalculationsJava.BaseCalculator;


public class ChildCalculator extends BaseCalculator {

	public static void main(String[] args) {
	
		
	 // Scenario 1- Creating child class object and Storing child Class reference	
	 ChildCalculator obj1=new ChildCalculator();
	 obj1.add();
	 obj1.sub();
	 obj1.mul();
	 obj1.div();
	 obj1.calculateEMI();
	 
	 
	 // Scenario 2- Creating child class object and Storing Base Class reference	
	 BaseCalculator obj2=new ChildCalculator();
	 obj2.add();
	 
	 // Scenario 3- Creating Base class object and Storing Child Class reference	
	  
	 //ChildCalculator obj3=new BaseCalculator();
	 
	 // Scenario 4- Creating Base Class object and Storing base Class Reference
	 
	 BaseCalculator obj4=new BaseCalculator();
	 obj4.add();
	 
	
	}
	
	public int calculateEMI(){
		System.out.println("Your EMI is 2000");
		return 10;
	}
	
	
}
