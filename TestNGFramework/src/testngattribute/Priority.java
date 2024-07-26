package testngattribute;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority 
{

	@Test(priority =1)
	public void dummyMethod() {
		Reporter.log("openbrowser",true);
		
     }
	@Test(priority = 3)
	public void login()
	
	{
		Reporter.log("login",true);
		
	}
	@Test(priority = 2)
	public void regidter()
	{
		Reporter.log("register",true);
	}
	
	

}
