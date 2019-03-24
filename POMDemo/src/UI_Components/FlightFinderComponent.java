package UI_Components;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.testng.annotations.*;

public class FlightFinderComponent {
	@FindBy(name="tripType")
	static List<WebElement> tripTypeRadios;
	
	public void selectFlight(){
		
	}
}
