package FirefoxProfile;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxProfileDemo {

	public static void main(String[] args) {
		
		
		ProfilesIni profileInit=new ProfilesIni();
		
	    FirefoxProfile testingProfile=profileInit.getProfile("toolsqa");

		FirefoxDriver driver=new FirefoxDriver(testingProfile);
		
		driver.manage().window().maximize();
		
		driver.get("http://www.demoqa.com");
		

	}

}
