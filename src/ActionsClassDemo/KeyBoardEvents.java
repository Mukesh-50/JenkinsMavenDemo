package ActionsClassDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents {

	public static void main(String[] args) {
    
		
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		Actions builder=new Actions(driver);
		
		builder.contextClick(driver.findElement(By.xpath(".//*[@id='_eEe']/a[4]"))).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	    
		
		
		
		

	}

}
