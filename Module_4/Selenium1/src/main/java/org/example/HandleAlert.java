package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HandleAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.dezlearn.com/multiple-browser-windows/");
        String Window = driver.getWindowHandle();
        driver.findElement(By.xpath("//button[@id='u_7_8']")).click();
        Set<String> Windows = driver.getWindowHandles();

        for(String win:Windows){
          //  driver.switchTo().win(win);
            Thread.sleep(3000);
            System.out.println(driver.getCurrentUrl());
        }




        /*JavascriptExecutor scroll = (JavascriptExecutor)driver;
        scroll.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//button[@id='p_alert3']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Bukola");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();*/






        /*driver.findElement(By.xpath("//button[@id='c_alert2']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[@id='c_alert2']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();*/


    }
}
