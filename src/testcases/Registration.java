package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		
		
		    FirefoxDriver driver=new FirefoxDriver();
			
			driver.manage().window().maximize();
			
			driver.get("http://demoqa.com/registration/");
			
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			
		   WebElement first_name=driver.findElementById("name_3_firstname");
			
		   
		   first_name.sendKeys("toolsqa firstname");
			
		   
		  WebElement last_name= driver.findElementByName("last_name");
		   
		  last_name.sendKeys("toolsqa last name");
			
			
		
		   WebElement check_box=driver.findElementByXPath(".//*[@id='pie_register']/li[3]/div/div/input[1]");
		  
		   boolean check_box_status=check_box.isSelected();
		   
		   System.out.println("Status of Check box is "+ check_box_status);
		 
		   Thread.sleep(2000);
		   
		   check_box.click();
		   
		   
           boolean check_box_status_new=check_box.isSelected();
		   
		   System.out.println("Status of Check box is "+ check_box_status_new);
		   
		   
		   driver.findElementByName("pie_submit").click();
		   
		 
		   
	}

}
