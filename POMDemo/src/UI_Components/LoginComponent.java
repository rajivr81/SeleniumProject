package UI_Components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import bds_Queries.serviceCall;

public class LoginComponent {
	
	@FindBy(name="userName")
	static WebElement userNameEditBox;
	
	@FindBy(name="password")
	static WebElement passwordEditBox;
	
	@FindBy(xpath="//input[@name='login']")
	static WebElement loginButton;
	
	@FindBy(xpath="//*[@src='/images/spacer.gif'][1]//following::font")
	static WebElement loginVerificationText;
	

	public void login(){
		userNameEditBox.sendKeys("mercury");
		passwordEditBox.sendKeys("mercury");
		loginButton.click();
		
	}
	
	public boolean verifyLoginFunc(){
		
		String actualText = loginVerificationText.getText();
		String expectedText = serviceCall.getLoginVerificationText();
		if(actualText.equals(expectedText))
			return true;
		else
			return false;
	}

}
