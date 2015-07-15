package browserComm;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommDemo {

	public static void main(String[] args) {
		
	
        FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.demoqa.com");
		
		
		String page_title=driver.getTitle();
		
	    System.out.println("Current Page title is " + page_title);
	    
	    
	   String current_url=driver.getCurrentUrl();
	   
	   System.out.println("Current Page url is " + current_url);
	   
	   
	   
	   String page_source= driver.getPageSource();
		
	   System.out.println("Current Page Source is " + page_source);	
	  	
	   
	   driver.quit();

	}

}
