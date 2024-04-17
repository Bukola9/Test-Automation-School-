package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleNavigate {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Actions actions = new Actions(driver);
        actions.sendKeys("Bukola").keyDown(Keys.CONTROL).sendKeys("a").build().perform();
        Thread.sleep(3000);
        actions.sendKeys("Bukola").keyDown(Keys.CONTROL).sendKeys("x").build().perform();
        Thread.sleep(3000);
        actions.sendKeys("Bukola").keyDown(Keys.CONTROL).sendKeys("v").build().perform();

        //driver.findElement(By.name("q")).sendKeys("Bukola");
        //Thread.sleep(5000);
        //driver.findElement(By.name("q")).sendKeys(Keys.ENTER);



        /*Thread.sleep(5000);

        driver.findElement(By.className("lnXdpd")).click();
        Thread.sleep(5000);

        driver.findElement(By.className("gNO89b")).click();*/

    }
}
