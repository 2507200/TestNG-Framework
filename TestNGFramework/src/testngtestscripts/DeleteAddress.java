package testngtestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import testngbasepackage.BaseClass;

public class DeleteAddress extends BaseClass
{
	@Test(groups = "Smoke")//Group Execution
	public void deleteaddress()
	{
		driver.findElement(By.xpath("//div[@class='header-links']/ul/li[1]/a")).click();
		driver.findElement(By.partialLinkText("Addresses")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div[2]/input[2]")).click();
		driver.switchTo().alert().accept();
	    Reporter.log("Delete Address",true);
	}

}
