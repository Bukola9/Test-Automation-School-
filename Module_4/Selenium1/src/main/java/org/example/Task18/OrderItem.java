package org.example.Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrderItem {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void testOrderItem() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        // Assuming there's a method to add items to cart after login
        // e.g., addItemsToCart();

        CartPage cartPage = new CartPage(driver);
        String cartQuantity = cartPage.getCartQuantity();

        Assert.assertEquals(cartQuantity, "2"); // Assuming 2 items are added to cart

        cartPage.clickCheckoutButton();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.inputUserData("John", "Doe", "12345");

        String cartItem = checkoutPage.getCartItem();

        // Assuming cartItem should match what was added to cart initially
        Assert.assertEquals(cartItem, "Item Name"); // Replace "Item Name" with actual item name

        checkoutPage.clickFinishButton();

        String successMessage = checkoutPage.getSuccessMessage();

        Assert.assertEquals(successMessage, "THANK YOU FOR YOUR ORDER");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
