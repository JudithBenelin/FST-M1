package Activities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.jupiter.api.Test;
import com.ibm.icu.impl.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

 class Activity3 {
	 WebDriver driver;
	 
	    @BeforeClass
	    public void beforeClass() {
	        // Set up the Firefox driver
	        WebDriverManager.firefox().setup();
	        driver = new FirefoxDriver();
	 
	        //Open browser
	        driver.get("https://v1.training-support.net/selenium/login-form");
	    }
	 
	    @Test
	    public void loginTest() {
	        //Find the username and password fields
	        WebElement username = driver.findElement(By.id("username"));
	        WebElement password = driver.findElement(By.id("password"));
	        
	        //Enter credentials
	        username.sendKeys("admin");
	        password.sendKeys("password");
	        
	        //Click login
	        driver.findElement(By.xpath("//button[text()='Log in']")).click();
	        
	        //Read login message
	        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
	        Assert.assertEquals("Welcome Back, admin", loginMessage);
	    }
	 
	    @AfterClass
	    public void afterClass() {
	        //Close browser
	        driver.close();
	    }
}