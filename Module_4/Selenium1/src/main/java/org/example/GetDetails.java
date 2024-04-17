package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDetails {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jumia.com.ng/");
        String autoCom = driver.findElement(By.id("fi-q")).getAttribute("autocomplete");
        System.out.println(autoCom);


    }

}
