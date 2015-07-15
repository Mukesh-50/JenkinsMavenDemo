package windowHandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowSwitching {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    String parent_window_name=driver.getWindowHandle();
	    
	    driver.findElementById("button1").click();
	    
	    Set<String> window_handle=driver.getWindowHandles();
	    
	    Iterator<String> window_iterator= window_handle.iterator();
	    
	    while(window_iterator.hasNext()){
	    	
	    	String child_window_name=window_iterator.next();
	    
	    	
	    	if(!parent_window_name.equalsIgnoreCase(child_window_name)){
	    		
	    		driver.switchTo().window(child_window_name);
	    	
	    		
	    		driver.manage().window().maximize();
	    		
	    		/*
	    		 * 
	    		 * Here you can write code based on your req
	    		 * 
	    		 * 
	    		 */
	    		
	    		driver.close();
	    		
	    	}
	    	
	    	
	    	
	    }
	   
	   driver.switchTo().window(parent_window_name);
	   
	   driver.quit();
	   
	   
		

	}

}
