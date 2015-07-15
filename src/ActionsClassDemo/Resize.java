package ActionsClassDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Resize {

	public static void main(String[] args) {
    
		
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demoqa.com/resizable/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		Actions builder=new Actions(driver);
		
	    WebElement ele=driver.findElement(By.xpath(".//*[@id='resizable']/div[1]"));
		
		builder.clickAndHold(ele).moveToElement(ele, ele.getLocation().getX(),400).release().build().perform();
		
		System.out.println(ele.getLocation().getY());
	    
		
		
		
		

	}

}
