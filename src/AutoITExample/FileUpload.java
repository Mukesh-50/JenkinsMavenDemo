package AutoITExample;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException {
		
        FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Mukesh_50/Desktop/Toolsqahtmlfile/fileupload.html");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath(".//*[@id='1']").click();
		
		Runtime.getRuntime().exec("C:\\Users\\Mukesh_50\\Desktop\\ToolsqaAutoitScripts\\FileUpload.exe");
			
	}

}
