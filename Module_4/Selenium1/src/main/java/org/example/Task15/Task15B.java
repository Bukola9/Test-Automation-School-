package org.example.Task15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task15B {
    WebDriver driver = null;
    @BeforeTest
    public void LaunchBrowser(){
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mcdonalds.com/us/en-us.html");
    }
    @Test
    public void LocateButton(){
       WebElement button = driver.findElement(By.id("button-ordernow"));
       String color = button.getCssValue("color");
        System.out.println("Button color is: "+ color);
    }
    @AfterTest
    public void QuitBrower(){
        driver.close();
    }


}

