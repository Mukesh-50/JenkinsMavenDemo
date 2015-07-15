package dropdownDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demoqa.com/registration/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement country_drop_down=driver.findElementById("dropdown_7");
		
		Select country=new Select(country_drop_down);
		
		country.selectByIndex(3);
		
		Thread.sleep(2000);
		
		country.selectByValue("Bangladesh");
		
		Thread.sleep(2000);
		
		country.selectByVisibleText("Canada");
		
		
		
		

	}

}
