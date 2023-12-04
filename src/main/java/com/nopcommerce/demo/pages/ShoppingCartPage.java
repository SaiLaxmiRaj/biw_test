package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ShoppingCartPage extends Utilities
{
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement agreeButtonBox;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckout;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement checkoutPageVerification;

    public void shoppingCartText()
    {
        String expectedMessage = "Shopping cart";
        String actualMessage = getTextFromElement(shoppingCartText);
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("Get Shopping cart Text : " + shoppingCartText.toString() + "<br>");
    }

    public void clickOnAgreeButtonBox() {
        clickOnElement(agreeButtonBox);
        log.info("Clicking on agree button box : " + agreeButtonBox.toString()+ "<br>");
    }

    public void clickOnCheckout() {
        clickOnElement(clickOnCheckout);
        log.info("Clicking on Checkout : " + clickOnCheckout.toString()+ "<br>");
    }

    public void checkoutPageVerificationText()
    {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = getTextFromElement(checkoutPageVerification);
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("GetCheckout Page Text Welcome, Please Sign In!: " + checkoutPageVerification.toString() + "<br>");
    }
}
