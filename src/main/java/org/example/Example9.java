
package org.example;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example9 {

    private static WebDriver driver;

    @Test
    public void Assertion() {

        // Create a new instance of Chrome driver
        driver = new ChromeDriver();

        // Launch the browser
        driver.get("http://demo.guru99.com/test/newtours/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Maximize the window
        driver.manage().window().maximize();

        // Find the submit button
        WebElement btnSubmit = driver.findElement(By.name("submit"));

        // Check whether the submit button is displayed
        Assert.assertTrue(btnSubmit.isDisplayed());

        // Click the submit button
        btnSubmit.click();

        // Close the browser
        driver.quit();
    }
}
