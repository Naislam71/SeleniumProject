package demoSelenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Windowandle {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFolder\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver obj = new ChromeDriver();
		
		obj.get("https://www.w3schools.com/jsref/met_win_open.asp");
		obj.findElementByLinkText("Try it Yourself »").click();
		Set<String> allwin = obj.getWindowHandles();
		for(String eachwin : allwin){
			System.out.println(eachwin);
			
			obj.switchTo().window(eachwin);
			System.out.println(obj.getTitle());
			
			
			
			
		}
		
		


	}

}
