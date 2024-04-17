package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://worldweather.wmo.int/en/home.html.");
        driver.findElement(By.linkText("please click here")).click();
        driver.findElement(By.cssSelector("input[id='q_search']")).sendKeys("Lagos");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[class='top_searchbox_submit']")).click();
        Thread.sleep(3000);
        List<WebElement> links = driver.findElements(By.cssSelector("div[class='city_fc_date fs0']"));
        for (WebElement link:links){
            System.out.println(link.getText());
        }
       List<WebElement> links2 = driver.findElements(By.cssSelector("div[class = 'city_fc_desc fs0']"));
        for (WebElement link1:links2){
            System.out.println(link1.getText());
        }

    }
}
