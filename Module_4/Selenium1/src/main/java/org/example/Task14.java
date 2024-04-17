package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task14 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.toolsqa.com/");
        driver.findElement(By.xpath("//span[contains(text(),'Tutorials')]")).click();
    }
}
