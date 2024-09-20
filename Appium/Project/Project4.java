package Project;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import groovy.time.Duration;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

Run All
public class Project4 {
	AndroidDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() throws MalformedURLException {
		
	//capablities
		UiAutomator2Options options =new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setAutomationName("UiAutomator2");
		options.setAppPackage("com.Android.chrome");
		options.noReset();
		
		URL serverURL	= new URI("http://localhost:4723/").toURL();
		
		driver = new AndroidDriver (serverURL, options);
		wait= new WebDriverwait(driver,Duration.ofseconds(20));
		
		
		driver.get("https://v1.training-support.net/selenium");
		
		@Test
		public void WebAppTest() throws InterruptedException {
			Dimension dims = driver.manage().window().getSize();
			Point start = new point();		}
	}
	
	
	
	
}
