package ActionsClassDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) {
    
		
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.toolsqa.com");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		Actions builder=new Actions(driver);
		
	     WebElement demo_site=driver.findElement(By.xpath(".//*[@id='main-nav']/li[8]/a/span"));
		
	     WebElement basic_demo_site=driver.findElement(By.xpath("//.//*[@id='main-nav']/li[8]/ul/li[2]/a/span"));
	     
		 builder.moveToElement(demo_site).moveToElement(basic_demo_site).click().build().perform();
		
		
		
		

	}

}
