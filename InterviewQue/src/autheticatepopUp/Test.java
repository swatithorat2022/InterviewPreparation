package autheticatepopUp;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32_104\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String username="admin";
		String password="admin";
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		//WebDriverWait wait=new WebDriverWait(driver, 10);
           //    Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		String msg=driver.findElement(By.cssSelector("div#content > div > p")).getText();

		System.out.println(msg);
	}

}
