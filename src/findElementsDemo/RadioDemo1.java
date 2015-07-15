package findElementsDemo;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioDemo1 {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/registration/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
	    List<WebElement>radio_button_list=driver.findElements(By.name("radio_4[]"));
	    
	     
	    Iterator<WebElement> radio_button_iterator= radio_button_list.iterator();
	     
	   
	    while(radio_button_iterator.hasNext())
	    {
	    	
	    	
	    WebElement radio_button=radio_button_iterator.next();
	    	
	    if(radio_button.getAttribute("value").equals("single"))
	    {
	    	
	    	radio_button.click();
	    	
	    }
	    
	    
	    }
	     
	    
	    
	    
	    
	     
		

	}

}
