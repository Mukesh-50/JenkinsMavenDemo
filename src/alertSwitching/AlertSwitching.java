package alertSwitching;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertSwitching {
	
	
        public static void main(String[] args) {
		
		
		FirefoxDriver  driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("alert").click();
		

	    Alert alt=driver.switchTo().alert();
	    
	    // Type 
	    alt.sendKeys("");
	    
	  
	    String alert_text= alt.getText();
	    
	    System.out.println("Alert text is "+alert_text);
	    
	    alt.accept();
	    
	   /* 
	    * Direct approach
	    driver.switchTo().alert().getText();
	    driver.switchTo().alert().accept();
	    
	    
	    */
		
	}
		

}
