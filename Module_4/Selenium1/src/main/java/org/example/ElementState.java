package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementState {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
        Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        driver.findElement(By.cssSelector("input[value='red']")).click();
        boolean red =driver.findElement(By.cssSelector("input[value='red']")).isSelected();
        boolean yellow =driver.findElement(By.cssSelector("input[value='yellow']")).isSelected();

        System.out.println(red);
        System.out.println(yellow);



      // boolean test =  driver.findElement(By.cssSelector("div[class ='q-flex qu-justifyContent--space-between qu-alignItems--center']")).isEnabled();
        //boolean state = driver.findElement(By.cssSelector("img[alt='Google']")).isDisplayed();
       // System.out.println(test);

    }
}
