package DSMB;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseClass 

{

	public static WebDriver driver;
	
	
	@BeforeSuite
	public static void launch() throws IOException
	{
		driver = new FirefoxDriver();		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("http://www.google.co.uk");
	}
	
	@AfterSuite
	public static void teardown()
	{
		driver.close();
		driver.quit();
	}
	
}
