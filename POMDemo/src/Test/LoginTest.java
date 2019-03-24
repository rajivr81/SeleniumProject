package Test;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import UI_Components.LoginComponent;

public class LoginTest extends AbstractTest {
			
	@Test
	public void verifyLogin(){
		loginComponent.login();
		assertTrue(loginComponent.verifyLoginFunc(), "Verify Login");
	}

}
