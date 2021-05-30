package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchChromeBrowser {

	//public static void main(String[] args) throws InterruptedException {
 
	@Test
	public void launchChromeBrowser() throws InterruptedException{
		

		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFolder\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(3000);
		
		driver.close();
	}

}

