package JavaScriptExecutorDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollPage {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	   WebElement para=driver.findElementByXPath(".//*[@id='mCSB_3_container']/p[3]");
	   
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   
	   js.executeScript("arguments[0].scrollIntoView(true);",para);
	  
	   String paragraph= para.getText();
		
	   System.out.println("Para is "+paragraph);
	 
	   /* JavascriptExecutor js=(JavascriptExecutor)driver;
	    
	    //js.executeScript("alert('Welcome to Toolsqa');");
	    
	    Thread.sleep(5000);
	    
	    js.executeScript("scroll(0,600)");*/
		
		

	}

}
