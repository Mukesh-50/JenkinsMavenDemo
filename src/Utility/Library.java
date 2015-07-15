package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Library {
	
	
	
	public static void captureScreenShot(WebDriver ldriver){
		
		TakesScreenshot ts=(TakesScreenshot)ldriver; 
		  
		File screen_src=ts.getScreenshotAs(OutputType.FILE);
		
		String path="./Screenshots/"+System.currentTimeMillis()+".png";
		
		File destination=new File(path);
		
		try {
			FileUtils.copyFile(screen_src, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
