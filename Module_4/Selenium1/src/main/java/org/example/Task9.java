package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.navigate().back();
        String value = driver.findElement(By.cssSelector("input[type='submit']")).getAttribute("VALUE");
        System.out.println(value);

        Thread.sleep(5000);
        driver.navigate().forward();
       String value2 = driver.findElement(By.cssSelector("button[name='add-to-cart-sauce-labs-backpack']")).getText();
        System.out.println(value2);
    }
}
