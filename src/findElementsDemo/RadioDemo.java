package findElementsDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioDemo {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demoqa.com/registration/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
	    List<WebElement>radio_button=driver.findElements(By.name("radio_4[]"));
	    
	     
	    int total_radio_element=radio_button.size();
	    
	    
	    for(int i=0;i<total_radio_element;i++){
	    		
	       WebElement radio=radio_button.get(i);
	    	
	       String radio_value= radio.getAttribute("value");
	       
	       System.out.println("Value of radio button is "+radio_value);
	       
	    	if(radio_value.equals("divorced")){
	    		
	    		radio.click();
	    		break;
	    	}
	       
	    }
	     
		

	}

}
