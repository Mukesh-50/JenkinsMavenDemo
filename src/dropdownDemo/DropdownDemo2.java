package dropdownDemo;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demoqa.com/registration/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement country_drop_down=driver.findElementById("dropdown_7");
		
		Select country=new Select(country_drop_down);
		
	    WebElement first_option=country.getFirstSelectedOption();
	    
	    
	    String value= first_option.getText();
		
	    System.out.println("Default value is "+value);
	    
	    
	    List<WebElement> country_values= country.getOptions();
	    
	   Iterator<WebElement> country_iterator=  country_values.iterator();
	    
	    
	  while(country_iterator.hasNext())
	  {
		  
		/*WebElement ele=  country_iterator.next();
		   
		String value1=ele.getText();
		
		System.out.println(value1);*/
		
		System.out.println("Countries are "+country_iterator.next().getText());
		  
	  }
	    
	
	  System.out.println("Total country is "+country_values.size());
		

	}

}
