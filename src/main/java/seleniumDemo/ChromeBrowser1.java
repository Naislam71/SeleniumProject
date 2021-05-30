package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drever", "C:\\SeleniumFolder\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		

	}

}
