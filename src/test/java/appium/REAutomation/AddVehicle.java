package appium.REAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AddVehicle extends BaseTest {
	
	@Test(priority=1)

	public void settingRE() throws InterruptedException {
		
		{
			driver.switchTo().alert().accept();

//			driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Settings']")).click();
//			driver.findElement(By.xpath("//XCUIElementTypeTextField[@value='Racing Edition']")).sendKeys("Testing");
//			driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == 'Registration Number'`]"))
//					.sendKeys("TVSTEST 12XY Z");
//			driver.findElement(AppiumBy.iOSNsPredicateString(
//					"name == \"Save Changes\" AND label == \"Save Changes\" AND type == 'XCUIElementTypeButton'"))
//					.click();
//			driver.findElement(AppiumBy.iOSNsPredicateString("name == \"ADD VEHICLE\" AND label == \"ADD VEHICLE\" AND type == 'XCUIElementTypeButton'")).click();
//			driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == 'TVS APACHE  RR 310'`]")).click();

			driver.findElement(AppiumBy.iOSClassChain(
					"**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]"))
					.click();
			
			driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeImage[`name == 'ic_explore'`][1]")).click();
			Thread.sleep(5000);
//			driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == 'Testing Name'`]")).clear();
			driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == '*Full Name'`]")).sendKeys("Testing");
			driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == 'SAVE'`]")).click();
			
		}
	}
	public void changeProfile()
	{
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='ic edit profile pic']")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		
	}
}
