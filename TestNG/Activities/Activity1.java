package Activities;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import dev.failsafe.internal.util.Assert;
public class Activity1 {
	 // Declare the WebDriver object
    WebDriver driver;
    
    @BeforeClass
    public void setup() {
        // Download and install Geckodriver
        WebDriverManager.firefoxdriver().setup();
        //Initialize
        driver = new FirefoxDriver();
        
        //Open the page
        driver.get("https://v1.training-support.net");
    }
 
    @Test
    public void exampleTestCase() {
        // Check the title of the page
        String title = driver.getTitle();
            
        //Print the title of the page
        System.out.println("Page title is: " + title);
            
            //Assertion for page title
        Assert.assertEquals("Training Support", title);
                    
        //Find the clickable link on the page and click it
        driver.findElement(By.id("about-link")).click();
                    
        //Print title of new page
        System.out.println("New page title is: " + driver.getTitle());
        
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }
 
    @AfterClass
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
 
}
