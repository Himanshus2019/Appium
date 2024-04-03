 package appium.REAutomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

 
public class IosTest {
	
	@Test
	public void AppiumTest() throws MalformedURLException, URISyntaxException {
		
//		IOSDriver driver = new IOSDriver(new URI("http://127.0.0.1:4723").toURL(), null);

	
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		XCUITestOptions options = new XCUITestOptions();
		
		options.setDeviceName("iPhone 15");
		options.setApp("/Users/macossonoma/Library/Developer/Xcode/DerivedData/TVS-fjphaqldmjxpwwczuqxrrptvzfst/Build/Products/Debug-iphonesimulator/TVS-EUROPE.app");
		options.setPlatformVersion("17.2");
		options.setWdaLaunchTimeout(Duration.ofSeconds(30));
		
		IOSDriver driver = new IOSDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.quit();
		service.stop();
	
		
	}
	
	
	
	
}
	
