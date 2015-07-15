package ActionsClassDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop2 {

	public static void main(String[] args) {
    		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demoqa.com/draggable/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		 Actions builder=new Actions(driver);
		
	     WebElement src=driver.findElement(By.xpath(".//*[@id='draggable']"));
	     
	     int x_cordinate=src.getLocation().getX();
	     
	     int y_cordinate=src.getLocation().getY();
	     
         System.out.println(x_cordinate);
	     
	     System.out.println(y_cordinate);
		
	     builder.dragAndDropBy(src, x_cordinate+200, y_cordinate+100).build().perform();
	     
         int x_cordinate1=src.getLocation().getX();
	     
	     int y_cordinate1=src.getLocation().getY();
	     
	     System.out.println(x_cordinate1);
	     
	     System.out.println(y_cordinate1);
	     
		
		
		
		
		

	}

}
