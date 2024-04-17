package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@id='u_0_0_Yl']")).click();
       // Wait wait = new WebDriverWait(driver, 5);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
        driver.findElement(By.name("firstname")).sendKeys("Bukky");
    }
}
