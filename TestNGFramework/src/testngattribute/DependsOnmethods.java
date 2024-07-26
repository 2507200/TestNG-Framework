package testngattribute;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnmethods 
{
	@Test
	public void openbrowser()
	{
		Reporter.log("openbrowser",true);
		
     }
	@Test(dependsOnMethods = "openbrowser")
	public void login()
	
	{
		Reporter.log("login",true);
		
	}
	@Test()
	public void register()
	{
		Reporter.log("register",true);
	}

}


