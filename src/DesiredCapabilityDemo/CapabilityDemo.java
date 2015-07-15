package DesiredCapabilityDemo;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CapabilityDemo {

	public static void main(String[] args) {
		
		
		Proxy localproxy=new Proxy();
		localproxy.setHttpProxy("localhost:4444");
		localproxy.setFtpProxy("localhost:4445");
		
		
		DesiredCapabilities capability=new DesiredCapabilities();
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		capability.setCapability(CapabilityType.PROXY, localproxy);
		capability.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, true);
	

		FirefoxDriver driver=new FirefoxDriver(capability);
		
		driver.get("http://demoqa.com");
		
		//InternetExplorerDriver driver=new InternetExplorerDriver(capability);
		
		
		
		

	}

}
