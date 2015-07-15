package dummy;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class ExplicitWait_Example {
 
public static void main(String[] args) throws InterruptedException {
 
// Open Firefox browser
FirefoxDriver driver=new FirefoxDriver();
 
// Maximize the window
driver.manage().window().maximize();
 
// Open applicatiion
driver.get("http://www.facebook.com");

//((JavascriptExecutor)driver).executeScript("document.querySelectorAll('input#pass').value='mukesh';");

// This will execute JavaScript in your script
((JavascriptExecutor)driver).executeScript("document.getElementById('email').value='mukesh';");

String xpath="input#pass";



((JavascriptExecutor)driver).executeScript("document.getElementById('loginbutton').click();");

}
 
}
