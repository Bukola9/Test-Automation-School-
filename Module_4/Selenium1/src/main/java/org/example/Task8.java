package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://idorenyinankoh.github.io/loginPage/");
        boolean state= driver.findElement(By.id("create")).isEnabled();
        driver.findElement(By.id("firstName")).sendKeys("bukola");
        driver.findElement(By.id("lastName")).sendKeys("Samuel");
        driver.findElement(By.id("email")).sendKeys("bukola@mail.com");
        driver.findElement(By.id("male")).click();
        driver.findElement(By.id("password")).sendKeys("olubukola");
        driver.findElement(By.id("confirmPass")).sendKeys("olubukola");
        driver.findElement(By.id("xpLevel")).sendKeys("meeee");
        boolean second = driver.findElement(By.id("create")).isEnabled();

        System.out.println(state);
        System.out.println(second);
    }
}
