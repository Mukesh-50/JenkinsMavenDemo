package waitDemo;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo3 {

	public static void main(String[] args) {
		
        FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
	
		driver.findElementById("timingAlert").click();
		
		wait.until(ExpectedConditions.alertIsPresent());

		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		


	}

}
