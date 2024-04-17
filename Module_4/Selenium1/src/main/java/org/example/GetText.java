package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://saucedemo.com/");
        String text1 = driver.findElement(By.id("login_credentials")).getText();
        String text2 = driver.findElement(By.cssSelector("div[class='login_password']")).getText();

        text1 =text1.substring(24,38);
        text2 = text2.substring(23,36);
        System.out.println(text1);
        System.out.println("............");
        System.out.println(text2);
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(text1);
        System.out.println(driver.findElement(By.cssSelector("input[placeholder='Username']")).getTagName());
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(text2);
        System.out.println(driver.findElement(By.cssSelector("input[type='submit']")).getCssValue("background-color"));

    }
}
