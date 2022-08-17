package sslCertificateError;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32_104\\chromedriver.exe");
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//dc.setAcceptInsecureCerts(true);
		ChromeOptions coptions=new ChromeOptions();
		coptions.merge(dc);
		WebDriver driver=new ChromeDriver(coptions);
		driver.get("http://expired.badssl.com");
		driver.manage().window().maximize();
		
	}

}
