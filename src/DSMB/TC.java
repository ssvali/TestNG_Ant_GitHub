package DSMB;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC extends BaseClass

{

	@Test
	public void TestCase1()
	{
		driver.findElement(By.id("gbqfq")).sendKeys("First Selenium Script");
	}
	
	
}
