package appium.REAutomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
@Test


public class BaseTest {
	
	public IOSDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException, URISyntaxException
	{
		
		service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		XCUITestOptions options = new XCUITestOptions();
		
		options.setDeviceName("iPhone 15");
		options.setApp("/Users/macossonoma/Library/Developer/Xcode/DerivedData/TVS-fjphaqldmjxpwwczuqxrrptvzfst/Build/Products/Debug-iphonesimulator/TVS-EUROPE.app");
		options.setPlatformVersion("17.2");
		options.setWdaLaunchTimeout(Duration.ofSeconds(30));
		
	    driver = new IOSDriver(new URI("http://127.0.0.1:4723").toURL(), options);
	}
	
public void EuropeBasicTest() throws InterruptedException 
	
	{
		for(int i=0; i<2; i++)
		{
			Alert permissionAlert = driver.switchTo().alert();
			permissionAlert.accept();

		}
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	
		driver.findElement(AppiumBy.accessibilityId("ic next")).click();
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"LOGIN\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("ic down arrow")).click();
		driver.findElement(AppiumBy.accessibilityId("Germany-Eng")).click();
		driver.findElement(AppiumBy.accessibilityId("mobileNumber")).sendKeys("Himanshu0401@mailinator.com");
		driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"CONTINUE\"]")).click();
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Yes\"]")).click();    // (For New Signup)
		Thread.sleep(8000);

		
//		driver.findElement(By.xpath("//XCUIElementTypeKey[@name=\"8\"]")).click();
//		driver.findElement(By.xpath("//XCUIElementTypeKey[@name=\"4\"]")).click();
//		driver.findElement(By.xpath("//XCUIElementTypeKey[@name=\"2\"]")).click();
//		driver.findElement(By.xpath("//XCUIElementTypeKey[@name=\"6\"]")).click();
//		driver.findElement(By.xpath("//XCUIElementTypeKey[@name=\"9\"]")).click();
//		driver.findElement(By.xpath("//XCUIElementTypeKey[@name=\"1\"]")).click();
//		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"SUBMIT\"]")).click();
//		Thread.sleep(10000);
		
	}
	
	@AfterClass
	public void TearDown()
	{
	
//		driver.quit();
		service.stop();
		
	}
}
