package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/");
        driver.findElement(By.linkText("Security Project")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("Bukola");
        driver.findElement(By.name("password")).sendKeys("bukola");
        driver.findElement(By.name("btnLogin")).click();
    }
}
