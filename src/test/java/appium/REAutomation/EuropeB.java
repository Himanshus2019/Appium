package appium.REAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class EuropeB extends BaseTest{
	
	
	@Test
	public void signUp() throws InterruptedException 
	
	{
//		for(int i=0; i<2; i++)
//		{
//			Alert permissionAlert = driver.switchTo().alert();
//			permissionAlert.accept();
//
//		}

		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Yes\"]")).click();
		
		driver.findElement(By.xpath("//XCUIElementTypeTextField[@value=\"*Full Name\"]")).sendKeys("Testing Name");
		driver.findElement(By.xpath("//XCUIElementTypeTextField[@value=\"*Mobile Number\"]")).sendKeys("7750445150");
		driver.findElement(By.xpath("//XCUIElementTypeTextField[@value=\"*City\"]")).sendKeys("Lucknow");
		
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		
		driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"ic uncheck\"])[2]")).click();
		driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"ic uncheck\"])[1]")).click();
		
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"SUBMIT\"]")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//XCUIElementTypeKey[@name=\"8\"]")).click();
		driver.findElement(By.xpath("//XCUIElementTypeKey[@name=\"4\"]")).click();
		driver.findElement(By.xpath("//XCUIElementTypeKey[@name=\"2\"]")).click();
		driver.findElement(By.xpath("//XCUIElementTypeKey[@name=\"6\"]")).click();
		driver.findElement(By.xpath("//XCUIElementTypeKey[@name=\"9\"]")).click();
		driver.findElement(By.xpath("//XCUIElementTypeKey[@name=\"1\"]")).click();
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"SUBMIT\"]")).click();
		
		
//		Thread.sleep(400);
//		driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Add a vehicle\"`]")).click();

	}
	
}
