package appium.REAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class EuropeB extends BaseTest{
	
	
	@Test(priority=1)
	public void signUp() throws InterruptedException 
	
	{
		
		driver.findElement(By.xpath("//XCUIElementTypeTextField[@value=\"*Full Name\"]")).sendKeys("Testing Name");
		driver.findElement(By.xpath("//XCUIElementTypeTextField[@value=\"*Mobile Number\"]")).sendKeys("7400045150");
		driver.findElement(By.xpath("//XCUIElementTypeTextField[@value=\"*City\"]")).sendKeys("Lucknow");
		driver.findElement(AppiumBy.accessibilityId("Done")).click();
		
		driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"ic uncheck\"])[2]")).click();
		driver.findElement(By.xpath("(//XCUIElementTypeButton[@name=\"ic uncheck\"])[1]")).click();
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"SUBMIT\"]")).click();
		
		Thread.sleep(9000);
		
		driver.findElement(By.xpath("//XCUIElementTypeKey[@name=\"8\"]")).click();
		driver.findElement(By.xpath("//XCUIElementTypeKey[@name=\"4\"]")).click();
		driver.findElement(By.xpath("//XCUIElementTypeKey[@name=\"2\"]")).click();
		driver.findElement(By.xpath("//XCUIElementTypeKey[@name=\"6\"]")).click();
		driver.findElement(By.xpath("//XCUIElementTypeKey[@name=\"9\"]")).click();
		driver.findElement(By.xpath("//XCUIElementTypeKey[@name=\"1\"]")).click();
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"SUBMIT\"]")).click();
		
		Thread.sleep(8000);
		

	}
	
    @Test(priority=2)
	
	public void addingRE () 

{
    	driver.findElement(AppiumBy.iOSClassChain(
				"**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther"))
				.click();
	    driver.findElement(AppiumBy.iOSClassChain(
			"**/XCUIElementTypeButton[`name == 'ADD VEHICLE'`]"))
			.click();
	}
	
}
