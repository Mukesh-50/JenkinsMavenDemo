package waitDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo2 {

	public static void main(String[] args) {
		
        FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("New Element1")));
		
		driver.findElementByLinkText("New Element1").click();
		
		driver.findElementById("timingAlert").click();
		
		
		driver.switchTo().alert().accept();
		
		

	}

}
