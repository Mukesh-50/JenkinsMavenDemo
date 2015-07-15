package AdvanceJava;

/*
 * This program will show how interface works
 *  
 * 
 */


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


interface Calc1{
	
	public void add();
	
	public void sub();
	
	public void calculateMoney();

}



public abstract class LoanCalculator1 implements Calc1 {

	public static void main(String[] args) {
		
		
	}
	
	public void add(){
		System.out.println("Add 2 number");
	}


	public abstract void sub();
	
	public void div(){
		System.out.println("Div 2 numbers");
	}
	
}
