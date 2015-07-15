package ActionsClassDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {
    
		WebDriver driver1=new FirefoxDriver();
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demoqa.com/droppable/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		 Actions builder=new Actions(driver);
		
	     WebElement src=driver.findElement(By.xpath(".//*[@id='draggableview']"));
		
	     WebElement destination=driver.findElement(By.xpath(".//*[@id='droppableview']"));
	     
		 builder.dragAndDrop(src, destination).build().perform();
		
		
		
		

	}

}
