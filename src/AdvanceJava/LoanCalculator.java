package AdvanceJava;

/*
 * This program will show how interface works
 *  
 * 
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


interface Calc{
	
	public void add();
	
	public void sub();
	
	
	
}



public class LoanCalculator implements Calc {

	public static void main(String[] args) {
		
		LoanCalculator obj1=new LoanCalculator();
		obj1.add();
		obj1.sub();
		obj1.div();
		
		Calc obj2=new LoanCalculator();
		obj2.add();
		obj2.sub();
		
		// I can access only webdriver methods which are required for automation
		WebDriver driver=new FirefoxDriver();
		
		
		// I can access all method of FirefoxDriver
		FirefoxDriver driver1=new FirefoxDriver();
		

	}
	
	public void add(){
		System.out.println("Add 2 number");
	}

	public void sub(){
		System.out.println("Sub 2 number");
	}
	
	public void div(){
		System.out.println("Div 2 numbers");
	}
	
}
