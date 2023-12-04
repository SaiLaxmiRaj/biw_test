package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ComputerPage extends Utilities
{
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement computerText;

    public void computerText()
    {
        String expectedMessage = "Computers";
        String actualMessage = getTextFromElement(computerText);
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("Get computerText : " + computerText.toString() + "<br>");
    }
}
