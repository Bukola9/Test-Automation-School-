package org.example.Task15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task15 {
    WebDriver driver = null;
    @BeforeTest
    public void LaunchBrowser(){
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }
    @Test
    public void Search(){
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testify ltd");
    }
    @AfterClass
    public void CloseBrowser(){
        driver.close();
    }
}
