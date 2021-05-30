package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {

	
ChromeDriver driver;
	
	@Given("launch chromeBrowser and load url")
	public void launchChromeBrowserAndLoadUrl() {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The chrome browser launched successfully");
	
	}

	@Given("enter userName as DemoSalesManager")
	public void enterUserNameAsDemoSalesManager() {
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
   
	}

	
	@Given("enter password as crmsfa")
	public void enterPasswordAsCrmsfa() {
		driver.findElementById("password").sendKeys("crmsfa");
	    
	}

	@When("click the login button")
	public void clickTheLoginButton() {
		
		driver.findElementByClassName("decorativeSubmit").click();
  
	}

	@Then("it is navigated homepage")
	public void itIsNavigatedHomepage() {
		
		System.out.println(driver.getTitle());
	  
	}

	@Then("click the logout button")
	public void clickTheLogoutButton() {
		
		driver.findElementByClassName("decorativeSubmit").click();
	 
	}
	

@Given("enter userName as Mamun")
public void enterUserNameAsMamun() {
	driver.findElementById("username").sendKeys("Mamun");
}

@Then("it is navigated samepage")
public void itIsNavigatedSamepage() {
	
	System.out.println(driver.getTitle());
   
}

@Then("verify error massage")
public void verifyErrorMassage() {
    String errorMassage = driver.findElementById("errorDiv").getText();
	if(errorMassage.contains("Mamun")) {
		System.out.println("Error massage is match");
	}else {
		System.out.println("Error massage is not match");
	}
}


@Then("close browser")
public void closeBrowser() {
  driver.close();
}


}

