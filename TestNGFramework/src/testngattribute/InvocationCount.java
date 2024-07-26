package testngattribute;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount 
{
	@Test
	public void openbrowser()
	{
		Reporter.log("openbrowser",true);
		
     }
	@Test
	public void login()
	
	{
		Reporter.log("login",true);
		
	}
	@Test(invocationCount = 4)
	public void register()
	{
		Reporter.log("register",true);
	}



}
