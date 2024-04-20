package org.example.Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private WebDriver driver;

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "postal-code")
    private WebElement postalCodeInput;

    @FindBy(className = "cart_list")
    private WebElement cartList;

    @FindBy(className = "cart_item")
    private WebElement cartItem;

    @FindBy(className = "checkout_button")
    private WebElement continueButton;

    @FindBy(className = "finish_button")
    private WebElement finishButton;

    @FindBy(className = "complete-header")
    private WebElement successMessage;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void inputUserData(String firstName, String lastName, String postalCode) {
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        postalCodeInput.sendKeys(postalCode);
        continueButton.click();
    }

    public String getCartItem() {
        return cartItem.getText();
    }

    public void clickFinishButton() {
        finishButton.click();
    }

    public String getSuccessMessage() {
        return successMessage.getText();
    }
}
