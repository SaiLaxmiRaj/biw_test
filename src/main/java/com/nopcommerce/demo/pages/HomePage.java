package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utilities
{
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computersLink;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopsLink;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Thank you']")
    WebElement thankYouText;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
    WebElement welcomeStoreText;

    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement successfulText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
        log.info("Clicking on register link : " + registerLink.toString());
    }

    public void clickOnComputersMenu() {
        log.info("Clicking on ComputersMenu " + computersLink.toString());
        clickOnElement(computersLink);
    }

    public void clickOnDesktopsSubMenu() {
        log.info("Clicking on DesktopsSubMenu" + desktopsLink.toString());
        clickOnElement(desktopsLink);
    }

    public boolean isLogInLinkDisplay()
    {
        boolean b = loginLink.isDisplayed();
        log.info("Checking is loginLink displayed : " + loginLink.toString() + "<br>");
        Reporter.log("Checking is loginLink displayed : " + loginLink.getText() + "<br>");
        return b;
    }


    public String getThankYouText() {
        log.info("Verify Thank you message : " + thankYouText.toString());
        return getTextFromElement(thankYouText);
    }

    public String getSuccessfulText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Verify successful message : " + successfulText.toString());
        return getTextFromElement(successfulText);
    }

    public String getWelcomeStoreText() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Verify Welcome to Store message : " + welcomeStoreText.toString());
        return getTextFromElement(welcomeStoreText);
    }

    public void clickOnContinue() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Click on continue button : " + continueButton.toString());
        clickOnElement(continueButton);
    }
}
