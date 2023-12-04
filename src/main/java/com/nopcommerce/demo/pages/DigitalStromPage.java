package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DigitalStromPage extends Utilities
{
    private static final Logger log = LogManager.getLogger(DigitalStromPage.class.getName());

    public DigitalStromPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(linkText = "Digital Storm VANQUISH 3 Custom Performance PC")
    WebElement digitalStromProduct;

    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement digitalStromProductText;

    @CacheLookup
    @FindBy(css = "#add-to-cart-button-2")
    WebElement addToCartProduct;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCartLink;

    public void clickOndigitalStromProduct() {
        clickOnElement(digitalStromProduct);
        log.info("Clicking on Digital Storm VANQUISH 3 Custom Performance PC : " + digitalStromProduct.toString()+ "<br>");
    }

    public void clickOndigitalStromProductText()
    {
        String expectedMessage = "Digital Storm VANQUISH 3 Custom Performance PC";
        String actualMessage = getTextFromElement(digitalStromProductText);
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("Get Digital Storm VANQUISH 3 Custom Performance PC : " + digitalStromProductText.toString() + "<br>");
    }

    public void clickOnAddToCartProduct() {
        clickOnElement(addToCartProduct);
        log.info("Clicking on Add to cart Product : " + addToCartProduct.toString()+ "<br>");
    }


    public void clickOnShoppinCartLink() {
        clickOnElement(shoppingCartLink);
        log.info("Clicking on Shopping cart link : " + shoppingCartLink.toString()+ "<br>");
    }

}
