package browserComm;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommDemo1 {

	public static void main(String[] args) {
	
        FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.demoqa.com");
		
		
	    String link_href=driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).getAttribute("href");
		
	    System.out.println("link href is "+ link_href);
	  	
	   
	    String tag_name=driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).getTagName();
	    
	    System.out.println("Tag name is "+tag_name);
	   
	    
	   driver.quit();

	}

}
