package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        ////button[contains(text(),'Double-Click Me To See Alert')]
        Thread.sleep(3000);
        WebElement doubleclick=  driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
        //WebElement click=  driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
        Actions mouse = new Actions(driver);
        mouse.doubleClick(doubleclick).build().perform();
        //driver.findElement(By.cssSelector(".context-menu-icon-edit")).click();
        Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        System.out.println("success");



        /* System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.konga.com/");
        WebElement mous = driver.findElement(By.xpath("//a[contains(text(),'Computers and Accessories')]"));
        Actions mouse = new Actions(driver);
        mouse.moveToElement(mous).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Computers and Accessories')]")).click();*/


    }





    //
}
