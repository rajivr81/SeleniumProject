package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import UI_Components.LoginComponent;

public class AbstractTest {
	
	LoginComponent loginComponent;
	WebDriver driver;
	
	public AbstractTest(){
		loginComponent = new LoginComponent();
	}
	
	@BeforeTest
	public void setupEnvironment(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajiv\\workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		PageFactory.initElements(driver, loginComponent);
	}
	
	@AfterTest
	public void closeEnvironment(){
		driver.close();
	}

}
