package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DesktopPage extends Utilities
{
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());

    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement desktopText;

    public void deskTopText()
    {
        String expectedMessage = "Desktops";
        String actualMessage = getTextFromElement(desktopText);
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("Get DesktopText : " + desktopText.toString() + "<br>");
    }

}
