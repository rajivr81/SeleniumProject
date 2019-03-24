package FlightDemo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class FlightBooking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajiv\\workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
		
/*		WebElement txtUserName = driver.findElement(By.name("userName"));
		txtUserName.sendKeys("mercury");
		
		WebElement txtPassword = driver.findElement(By.name("password"));
		txtPassword.sendKeys("mercury");
		
		WebElement btnSignIn = driver.findElement(By.name("login"));
		btnSignIn.click();
		
		List<WebElement> radioTripType = driver.findElements(By.tagName("input"));
		radioTripType.get(1).click();
		//radioTripType.get(1).getAttribute("value");
		
		//Working with List box
		WebElement lstFromPort = driver.findElement(By.name("fromPort"));
		Select select = new Select(lstFromPort);
		select.selectByVisibleText("London");
		
		List<WebElement> frmPort = select.getOptions();
		//Size
		System.out.println("Size of List:"+frmPort.size());
		
		//List of Name
		for(WebElement CurrValue : frmPort){
			System.out.println(CurrValue.getText());
		}
		//frmPort.get(0).getText();
		//List<String> allPort = Arrays.asList();
				//Arra.asList("London", "Denver");
		//Select a option
		for(WebElement CurrValue : frmPort){
			if(CurrValue.getText().equalsIgnoreCase("London")){
				CurrValue.click();
			}
		}
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Type 1 Xpath(which will always a tag with prelocator) for finding password field
		////TagName of helper tag[@locator = 'locator value']//following::tagname of desired tag
		// we can also use "//preceeding" as well
		driver.findElement(By.xpath("//input[@name='userName']//following::input")).sendKeys("mercury");
		//locating the sign in button
		driver.findElement(By.xpath("//input[@name='userName']//following::input[2]")).click();
		
		
		//Type 2 Xpath(not need to have prelocator, should use the unique attribute of the tag)
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		Select toPort = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		toPort.selectByVisibleText("Paris");
		
		driver.findElement(By.xpath("//select[@name='toPort']//following::option[@value='Paris'")).click();
		driver.findElement(By.xpath("//option[@value='Paris'][2]")).click();
		
		
		//Type 3 xpath(make use of text on the element
		driver.findElement(By.xpath("//option[contains{text(),'Blue Skies')]")).click();
		
		
		
		Select lstcount = new Select(driver.findElement(By.name("passCount")));
		lstcount.selectByVisibleText("2");
		
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("buyFlights")).click();
		
		System.out.println(driver.findElement(By.partialLinkText("Flight Confirmation")).getText());
		
		
		//CLick on link using xpath
		driver.findElement(By.xpath("//a[contains(text(), 'REGISTER')]")).click();
	
		//get all the links, anme and URL
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(WebElement currLink : allLinks){
			//System.out.println(currLink.getText() + " : " + currLink.getAttribute("href"));
			if(currLink.getAttribute("href").contains("mercuryunderconst")){
				System.out.println(currLink.getText() + " not working");
			}
		
		}
		//get the broken link with the help of above example, need to check for href attribute, if it is blank
	*/
		driver.manage().window().maximize();
		try {
			driver.findElement(By.xpath("//input[@name='from']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//option[@value='6'][1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active' and contains(text(),'3')]")).click();
			/*List<WebElement> allDates = driver.findElements(By.xpath("//a[contains(text(),'3')]"));
			for(WebElement curDate : allDates){
				if(curDate.getText().equals("3")){
					curDate.click();
				}
			}*/
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
