package testngtestscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import testngbasepackage.BaseClass;

public class UbdateAddress extends BaseClass
{
	@Test(groups = "Regression")//Group Execution
	public void ubdateaddress()
	{
		driver.findElement(By.xpath("//div[@class='header-links']/ul/li[1]/a")).click();
		driver.findElement(By.partialLinkText("Addresses")).click();
		driver.findElement(By.cssSelector("[class='button-1 add-address-button']")).click();
		driver.findElement(By.id("Address_FirstName")).sendKeys("Iyyanar");
		driver.findElement(By.id("Address_LastName")).sendKeys("s");
		driver.findElement(By.id("Address_Email")).sendKeys("kalai812117@gmail.com");
		WebElement dd1 = driver.findElement(By.id("Address_CountryId"));
		Select sec1=new Select(dd1);
		sec1.selectByValue("41");
		driver.findElement(By.id("Address_City")).sendKeys("Villupuram");
		driver.findElement(By.id("Address_Address1")).sendKeys("2/394,kudimara Street");
		driver.findElement(By.id("Address_Address2")).sendKeys("Periyababusamuthiram");
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys("605102");
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys("7835353421");
		driver.findElement(By.cssSelector("[class='button-1 save-address-button']")).click();
        Reporter.log("Ubdate Address",true);
	}
	

}
