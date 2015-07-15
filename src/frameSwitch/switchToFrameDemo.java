package frameSwitch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchToFrameDemo {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.toolsqa.com/iframe-practice-page/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//driver.switchTo().frame(1);
		
		//driver.switchTo().frame("iframe2");
		
		WebElement ele=driver.findElementByXPath("/html/body/div[2]/div[3]/div[2]/div/div/div[2]/iframe");
		
		driver.switchTo().frame(ele);
		
		System.out.println("Switch to child frame");
	
		driver.findElementByXPath(".//*[@id='site_navigation']/div/div[1]/a/img").click();
		
		driver.switchTo().defaultContent();
		
		System.out.println("Switch to frame");
		
		driver.quit();
		
		
		
		
		
		

	}

}
