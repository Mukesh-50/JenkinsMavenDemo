package waitDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) {
		
		
        FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
		
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		
		wait.withTimeout(50, TimeUnit.SECONDS);
		
		wait.pollingEvery(2, TimeUnit.SECONDS);
		
	    WebElement ele=wait.until(new Function<WebDriver,WebElement>(){

			@Override
			public WebElement apply(WebDriver fluentdriver) {
				
			WebElement buzz_value=fluentdriver.findElement(By.id("clock"));
				
		    String value=buzz_value.getAttribute("innerHTML");
			
		    if(value.contains("Buzz")){
		    	
		    	System.out.println("Value is "+value);
		    	return buzz_value;
		    	
		    }
		    else{
		    	
		    	System.out.println("Value is "+value);
		    	return null;
		    }
		    
		  	
			}
			
			
		});
		
		
		System.out.println("Tag name is "+ele.getTagName());

	}

}
