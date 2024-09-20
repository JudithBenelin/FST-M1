package com.example.FST_m1_Selenium01;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project02 {
	public static void main(String[] args) {
		// Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        String URL = "http://alchemy.hguy.co/orangehrm";
	    driver.get(URL);
	    WebElement img = driver.findElement(By.id("divLogo"));
	    String src = img.getAttribute("src");
	    System.out.println("The URL of the image is: " + src);
	 // Close the browser
        driver.close();
	}
	    

}
