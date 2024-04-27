package org.example.Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SectionB {
    WebDriver driver = null;
    @BeforeTest
    public void LaunchBrowser(){
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://blazedemo.com/");
    }
    @Test(priority=1)
    public void ClickFlight(){
        //Clicking the flight
        driver.findElement(By.xpath("//body/div[3]/form[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();
    }
    @Test(priority=2)

    public void FillForm() throws InterruptedException {

        //Filling the norml form
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Bukola");
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Agbowo, Ibadan, Oyo state Nigeria");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Ibadan");
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Oyo State");
        WebElement ElementCopy = driver.findElement(By.xpath("//p[contains(text(),'Flight Number: UA954')]"));
        ElementCopy.click();
        Actions mouse = new Actions(driver);
        mouse.sendKeys(Keys.CONTROL,"c").build().perform();
        WebElement ElementPaste = driver.findElement(By.xpath("//input[@id='zipCode']"));
        ElementPaste.click();
        mouse.sendKeys(Keys.CONTROL,"v").build().perform();

        //Selecting Card type
        WebElement dropdownElement = driver.findElement(By.xpath("//select[@id='cardType']"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText("Diner's Club");

        //clearing the month field and entering a new month
        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("12039993933");
        WebElement month = driver.findElement(By.xpath("//input[@id='creditCardMonth']"));
        month.clear();
        month.sendKeys("1");

        //clearing the year field and entering a new year
        WebElement year = driver.findElement(By.xpath("//input[@id='creditCardYear']"));
        year.clear();
        year.sendKeys("2029");

        //Entering the name on the card
        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Bukola Adeniran");

        //Tick the‘RememberMe’checkbox and Purchase flight
        WebElement checkbox = driver.findElement(By.id("rememberMe"));
        Thread.sleep(3000);
        if(!checkbox.isSelected()){
            checkbox.click();
        }
        driver.findElement(By.xpath("//body/div[2]/form[1]/div[11]/div[1]/input[1]")).click();
        System.out.println("Flight purchase successfully");
    }
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }

}
