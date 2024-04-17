package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/mac/Bukola's Project/Selenium1/src/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testify ltd");
        driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='main']/div[@id='cnt']/div[@id='rcnt']/div[@id='center_col']/div[@id='res']/div[@id='search']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/a[1]/h3[1]")).click();
        Thread.sleep(5000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
        Thread.sleep(3000);
        String mainWindowHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            // Switch to the new tab
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        Thread.sleep(3000);

        try {
            // Identify the dialogue box element
            WebElement dialogBox = driver.findElement(By.cssSelector("your-dialog-box-selector"));

            // Perform the desired action, for example, closing the dialogue box
            dialogBox.findElement(By.className("overflow-hidden")).click(); // Assuming there's a close button in the dialogue

            // Optionally, you can wait for the dialogue to disappear

        } catch (NoSuchElementException e) {
            // Handle the case when the dialogue box is not present
            System.out.println("Dialogue box not found on the page.");
            // You can continue with your script or perform alternative actions here
        }





        /* try {
            // Switch to the alert
            Alert alert = driver.switchTo().alert();

            // Close the alert
            alert.dismiss(); // or alert.accept() if you want to accept the alert
        } catch (NoAlertPresentException e) {
            // Handle the case when no alert is present
            System.out.println("No alert present on the page.");
            // You can continue with your script or perform alternative actions here
        }*/

        //overflow-hidden
        Thread.sleep(10000);

        String buk =  driver.findElement(By.tagName("p")).getText();
        System.out.println(buk);


    }

}
