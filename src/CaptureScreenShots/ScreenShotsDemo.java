package CaptureScreenShots;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.Library;

public class ScreenShotsDemo {

	public static void main(String[] args) throws IOException {
		
	    FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    Library.captureScreenShot(driver);
	
		driver.quit();
		

	}

}
