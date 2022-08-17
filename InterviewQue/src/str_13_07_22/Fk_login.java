package str_13_07_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fk_login {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("button[class$='B4z']")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("a[href*='login']")).click();
	driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/child::input[@type='text']")).sendKeys("9834760308");
	driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/child::input[@type='password']")).sendKeys("9834760308");

	}

}
