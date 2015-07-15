package collectionAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jdt.internal.compiler.ast.ArrayAllocationExpression;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListDemo {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		List list=new ArrayList();
		
		list.add(10);
		
		list.add("Toolsqa");
		
		list.add(15.10);
		
		list.add(10);
		
		
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list);
			

	}

	
	public static void selectDropDown(String value){
		  
		  List<WebElement> li=  driver.findElements(By.tagName("select"));
		  
		
         Iterator<WebElement> i1=li.iterator();
         
         while(i1.hasNext()){
        	 
        	WebElement ele= i1.next();
        	 
        	Select sel=new Select(ele);
        	
        	sel.selectByValue(value);
        	
         }
		
	}
}
