package org.example.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SectionA {
    WebDriver driver = null;
    @BeforeTest
    public void LaunchBrowser(){
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");
    }
    @Test(priority=1)
    public void ClickSignup(){
        driver.findElement(By.partialLinkText("Signup / Log")).click();
    }
    @Test(priority=2)
    public void FillingForm() throws InterruptedException {

        //Entering Account Info
        driver.findElement(By.cssSelector("input[data-qa='signup-name']")).sendKeys("Sam");
        driver.findElement(By.cssSelector("input[data-qa='signup-email']")).sendKeys("Bukolasam@gmail.com");
        driver.findElement(By.cssSelector("button[data-qa='signup-button']")).click();

        WebElement Mr = driver.findElement(By.xpath("//input[@id='id_gender1']"));
        Thread.sleep(3000);
        if(!Mr.isSelected()){
            Mr.click();
        }
        driver.findElement(By.cssSelector("input[data-qa='password']")).sendKeys("Bukola");



        //Selecting Day
        WebElement dropdownElement = driver.findElement(By.id("days"));
        Select days = new Select(dropdownElement);
        days.selectByVisibleText("9");
        Thread.sleep(3000);

        //Selecting Month
        WebElement dropdownElement2 = driver.findElement(By.cssSelector("select[data-qa='months']"));
        Select Month = new Select(dropdownElement2);
        days.selectByIndex(4);
        Thread.sleep(3000);

        //Selecting Year
        WebElement dropdownElement3 = driver.findElement(By.id("years"));
        Select Year = new Select(dropdownElement3);
        days.selectByIndex(3);

        //Entering Address Info
        driver.findElement(By.id("first_name")).sendKeys("Bukola");
        driver.findElement(By.id("last_name")).sendKeys("Adeniran");
        driver.findElement(By.id("company")).sendKeys("Testify");
        driver.findElement(By.id("address1")).sendKeys("No 3, solomon Niran");
        driver.findElement(By.id("address2")).sendKeys("No 3, solomon Niran");

        WebElement dropdownElement4 = driver.findElement(By.xpath("//select[@id='country']"));
        Select Country = new Select(dropdownElement4);
        days.selectByIndex(3);

        driver.findElement(By.id("state")).sendKeys("Oyo state");
        driver.findElement(By.id("city")).sendKeys("Ibadan");
        driver.findElement(By.id("zipcode")).sendKeys("12321");
        driver.findElement(By.id("mobile_number")).sendKeys("08112317555");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("button[data-qa='create-account']")).click();

        //asserting that I have finally registered
        String Expectedtext = driver.findElement(By.xpath("//b[contains(text(),'Account Created!')]")).getText();
        String actualtext = "Account Created!";
        Assert.assertEquals(actualtext,Expectedtext);










    }
}
