package demoSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFolder\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		/*//way 1
		driver.switchTo().frame("iframeResult");
		
		System.out.println("Succesfully enter into the Frame");
		 
		driver.findElementByXPath("//input[@id='fname']").clear();
		driver.findElementByXPath("//input[@id='fname']").sendKeys("Nazmul");
		driver.findElementByXPath("//input[@name='lname']").clear();
		driver.findElementByXPath("//input[@name='lname']").sendKeys("Islam");
		*/
				
	/*	//way 2 with index
		driver.switchTo().frame(0);
		driver.findElementByXPath("//input[@name='lname']").clear();
		driver.findElementByXPath("//input[@name='lname']").sendKeys("Islam");
	
		driver.findElementByXPath("//input[@value='Submit' ]");
		driver.switchTo().defaultContent();
		*/
		
		//3rd way-by using Iframe Xpath,webElement and variable
		//move to Frame from html
		
	    WebElement iframeWay3 = driver.findElementByXPath("//iframe[@id='iframeResult']");
		driver.switchTo().frame(iframeWay3);
		
		System.out.println("Succesfully switch in to frame");
		driver.findElementByXPath("//input[@name='fname']").clear();
		driver.findElementByXPath("//input[@name='fname']").sendKeys("Faiza");
		
		driver.findElementByXPath("//input[@name='lname']").clear();
		driver.findElementByXPath("//input[@name='lname']").sendKeys("Raisa");
		
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		
		driver.close();
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
