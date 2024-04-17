package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable/");
        driver.switchTo().frame(0);
        Thread.sleep(3000);
        WebElement resize =driver.findElement(By.xpath("//div[@id='resizable']"));
        Actions mouse = new Actions(driver);
        mouse.clickAndHold(resize).moveByOffset(200,200).release().perform();
    }
}
