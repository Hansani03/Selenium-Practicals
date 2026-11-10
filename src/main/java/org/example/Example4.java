
package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

import java.time.Duration;

public class Example4 {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {

        // Create an instance of ChromeDriver
        driver = new ChromeDriver();

        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the browser
        driver.get("http://demo.guru99.com/test/newtours");

        // Maximize the window
        driver.manage().window().maximize();
    }

    @Test
    public void testMethod() {

        // Enter username
        driver.findElement(By.name("userName")).sendKeys("tutorial");

        // Enter password
        driver.findElement(By.name("password")).sendKeys("tutorial");

        // Click submit button
        driver.findElement(By.name("submit")).click();

        // Print successful login message
        System.out.println("Login Successfully");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {

        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
