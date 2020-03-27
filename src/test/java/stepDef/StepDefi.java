package stepDef;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.fingertip.pageobjects.LoginPage;
//import com.fingertip.utilities.TestBase;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class StepDefi {
public static WebDriver driver=null;
	@Given("^user launches Url$")
	public void user_launches_Url() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hari\\EclipseFiles\\SampleFramework\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}

}