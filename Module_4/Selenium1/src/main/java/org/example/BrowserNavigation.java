package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Bukola");
        Thread.sleep(5000);

        driver.findElement(By.className("lnXdpd")).click();
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("input[value='Google Search']")).click();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();

    }
}
