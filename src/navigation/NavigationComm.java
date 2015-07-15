package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationComm {

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver=new FirefoxDriver();
			
		driver.manage().window().maximize();
		
		driver.get("http://www.demoqa.com");
		
		
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.quit();
		
	
	}

}
