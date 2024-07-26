package testngbasepackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;

	@Parameters("browser")
	@BeforeClass(alwaysRun = true) // Group Execution
	public void openbrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Reporter.log("open browser", true);
	}

	/*@AfterClass(alwaysRun = true) // Group Execution
	public void logout()

	{
		driver.findElement(By.partialLinkText("Log out")).click();
		Reporter.log("logout", true);

	}*/

	@BeforeMethod(alwaysRun = true) // Group Execution
	public void login() {
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("kalai2000@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Iyyanar@2000");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("login", true);
	}

	@AfterMethod(alwaysRun = true) // Group Execution
	public void close() {
		driver.close();
		Reporter.log("close", true);
	}
}

