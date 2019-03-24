package FlightDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectRadio {
	
	public void RadioSelection(WebElement driver, String radioButton ,String tripType){
		List<WebElement> radioTripType = driver.findElements(By.tagName(radioButton));
		//radioTripType.get(1).click();
		for(WebElement currRadio : radioTripType){
			if(currRadio.getAttribute("value").equalsIgnoreCase(tripType)){
				currRadio.click();
			}
		}
		//radioTripType.get(1).getAttribute("value");
	}

}



