package appium.REAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AddVehicle extends BaseTest {
	
	@Test

	public void settingRE() throws InterruptedException {
		
		{
			driver.switchTo().alert().accept();
			
//			driver.findElement(AppiumBy.iOSClassChain(
//					"**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeImage[1]"))
//					.click();
//			driver.findElement(AppiumBy.accessibilityId("Emergency Contact")).click();
//			driver.findElement(By.xpath("//XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton")).click();
//			driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == 'CANCEL'`]")).click();
//			driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == 'Emergency Information'`]")).click();

//		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name='Settings']")).click();
//			driver.findElement(By.xpath("//XCUIElementTypeTextField[@value='Racing Edition']")).sendKeys("Testing");
			driver.findElement(AppiumBy.iOSClassChain(
					"**/XCUIElementTypeButton[`name == 'ADD VEHICLE'`]"))
					.click();
			driver.findElement(AppiumBy.iOSClassChain(
					"**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther"))
					.click();
			driver.findElement(AppiumBy.iOSClassChain(
					"**/XCUIElementTypeButton[`name == 'ADD VEHICLE'`]"))
					.click();
//			driver.findElement(AppiumBy.iOSNsPredicateString(
//					"name == \"Save Changes\" AND label == \"Save Changes\" AND type == 'XCUIElementTypeButton'"))
//					.click();
//			driver.findElement(AppiumBy.iOSNsPredicateString("name == \"ADD VEHICLE\" AND label == \"ADD VEHICLE\" AND type == 'XCUIElementTypeButton'")).click();
//		
//			driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeStaticText[`name == \"Racing Edition\"`][2]")).click();
//			
//			
//			
//			driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeImage[`name == 'ic_explore'`][1]")).click();
//			Thread.sleep(5000);
//			driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == 'Testing Name'`]")).clear();
//			driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeTextField[`value == '*Full Name'`]")).sendKeys("Testing");
//			driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == 'SAVE'`]")).click();
			
		}
	}
//	public void changeProfile()
//	{
//		driver.findElement(By.xpath("//XCUIElementTypeButton[@name='ic edit profile pic']")).click();
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().accept();
//		
//	}
}
