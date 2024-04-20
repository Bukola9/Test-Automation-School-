package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task17 {
    WebDriver driver = null;
    @BeforeTest
    public void LaunchBrowser(){
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com");
    }
    @Test
    public void testElementsPageNavigation() {
        // Click on the Elements tile
        WebElement elementsTile = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]"));
        elementsTile.click();

        // Assert that you are on the Elements page
        String pageTitle = driver.findElement(By.className("col-12 mt-4 col-md-6")).getText();
        Assert.assertEquals(pageTitle, "Please select an item from left to start practice.");
    }
    public void testFormPageNavigation() {
        // Click on the Elements tile
        WebElement testFormTile = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/svg[1]/g[1]/path[1]"));
        testFormTile.click();

        // Assert that you are on the Elements page
        String pageTitle = driver.findElement(By.className("col-12 mt-4 col-md-6")).getText();
        Assert.assertEquals(pageTitle, "Please select an item from left to start practice.");
    }
    public void WidgetPageNavigation() {
        // Click on the Elements tile
        WebElement WidgetTile = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/svg[1]/path[1]"));
        WidgetTile.click();

        // Assert that you are on the Elements page
        String pageTitle = driver.findElement(By.className("col-12 mt-4 col-md-6")).getText();
        Assert.assertEquals(pageTitle, "Please select an item from left to start practice.");
    }



    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
