package testngattribute;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled 
{
	@Test
	public void openbrowser() {
		Reporter.log("openbrowser", true);

	}

	@Test(enabled = false)
	public void login()

	{
		Reporter.log("login", true);

	}

	@Test
	public void register() {
		Reporter.log("register", true);
	}

}
