package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.findElement(By.cssSelector("button[name='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.cssSelector("span[class='shopping_cart_badge']")).click();
        driver.findElement(By.cssSelector("button[id='checkout']")).click();

    }
}
