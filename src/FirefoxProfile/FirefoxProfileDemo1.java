package FirefoxProfile;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirefoxProfileDemo1 {

	public static void main(String[] args) {
		
		
		FirefoxProfile profile=new FirefoxProfile();
		
		profile.setAcceptUntrustedCertificates(true);
		
		profile.setAssumeUntrustedCertificateIssuer(true);
		
		profile.setPreference("intl.accept_languages", "zh");
		
		FirefoxDriver driver=new FirefoxDriver(profile);
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		
		
		

	}

}
