package com.example.FST_m1_Selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Project01 {
	public static void main(String[] args) {
		// Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
	    driver.get("http://alchemy.hguy.co/orangehrm");
	    // Get Title of the page
	    String title = driver.getTitle();
	    System.out.println("Home page title: " + title);
	    if(title=="OrangeHRM") {
	 // Close the browser
        driver.close();
	    }
	    else {
	    	driver.close();
	    }
	}
	    
}
