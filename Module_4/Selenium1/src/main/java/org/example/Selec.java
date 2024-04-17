package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selec {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        WebElement SelMenu = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
        Thread.sleep(5000);
        Select select = new Select(SelMenu);
        select.selectByIndex(4);

    }


    //
}
