package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CheckOutPage extends Utilities {
    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());


    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Checkout')]")
    WebElement checkoutText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countrySelect;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement city;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address1")
    WebElement address;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postalCode;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumber;

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement billingContinueButton;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentContinueButton;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']")
    WebElement paymentInfoContinueButton;

    @CacheLookup
    @FindBy(css = "li[id='opc-shipping_method'] li:nth-child(1) div:nth-child(2)")
    WebElement groundShipping;

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement creditCard;

   @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumber;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement selectMonth;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement selectYear;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Credit Card']")
    WebElement paymentTypeMessage;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Next Day Air']")
    WebElement shippingMethodText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement totalPriceText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmButton;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement shippingMethodContinueButton;

    @CacheLookup
    @FindBy(css = ".section.order-completed")
    WebElement continueButtonOderNumber;

    public void billingContinueButton()
    {
        clickOnElement(billingContinueButton);
        log.info("Clicking on Continue Button : " + billingContinueButton.toString()+ "<br>");
    }

    public void shippingMethodContinueButton()
    {
        clickOnElement(shippingMethodContinueButton);
        log.info("Clicking on Continue Button : " + shippingMethodContinueButton.toString()+ "<br>");
    }

    public void continueButtonOderNumber()
    {
        clickOnElement(continueButtonOderNumber);
        log.info("Clicking on confirm Order Button : " + continueButtonOderNumber.toString()+ "<br>");
    }

    public void checkoutText()
    {
        String expectedMessage = "Checkout";
        String actualMessage = getTextFromElement(checkoutText);
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("Get CheckoutText : " + checkoutText.toString() + "<br>");
    }

    public void selectCountry(String country)
    {
        selectByVisibleTextFromDropDown(countrySelect,"United Kingdom");
        log.info("Select Country: '" + country  + "<br>");
    }

    public void enterCity()
    {
        sendTextToElement(city, getRandomString(8) );
        log.info("Enter City : '" + city +"' to city" + "<br>");
    }

    public void enterAddress()
    {
        sendTextToElement(address, getRandomString(8) );
        log.info("Enter Address : '" + address +"' to address1" + "<br>");
    }

    public void enterPostalCode()
    {
        sendTextToElement(postalCode, getRandomString(3) +" "+ getRandomString(3) );
        log.info("Enter PostalCode : '" + postalCode +"' to PostalCode" + "<br>");
    }

    public void enterPhoneNumber()
    {
        sendTextToElement(phoneNumber, getRandomString(10));
        log.info("Enter Phone Number : '" + phoneNumber +"' to Phone Number" + "<br>");
    }

    public void continueButton()
    {
        clickOnElement(continueButton);
        log.info("Clicking on Continue Button : " + continueButton.toString()+ "<br>");
    }

    public void selectGroundShipping()
    {
        log.info("Click Ground Shipping service : " + groundShipping.toString());
        clickOnElement(groundShipping);
    }

    public void clickOnCreditCard()  {
        log.info("Click on credit card payment option: " + creditCard.toString());
        clickOnElement(creditCard);
    }

    public void clickOnPaymentContinue() {
        log.info("Click on continue button : " + paymentContinueButton.toString());
        clickOnElement(paymentContinueButton);
    }

    public void enterCardHolderName(String value)  {
        log.info("Enter credit card holder name : " + cardHolderName.toString());
        sendTextToElement(cardHolderName, value);
    }

    public void enterCardNumber(String value)
    {
        log.info("Enter credit card number : " + cardNumber.toString());
        sendTextToElement(cardNumber, value);
    }

    public void selectExpirationDate(String month, String year)  {
        log.info("Enter expiry month : " + selectMonth.toString());
        selectByVisibleTextFromDropDown(selectMonth, month);
        log.info("Enter expiry year : " + selectYear.toString());
        selectByVisibleTextFromDropDown(selectYear, year);
    }

    public void enterCardCode(String value)  {

        log.info("Enter credit card code : " + cardCode.toString());
        sendTextToElement(cardCode, value);
    }

    public String getPaymentTypeText() {
        log.info("Verify payment type : " + paymentTypeMessage.toString());
        return getTextFromElement(paymentTypeMessage);
    }

    public String getShippingMethodText() {
        log.info("Verify shipping method : " + shippingMethodText.toString());
        return getTextFromElement(shippingMethodText);
    }

    public String getTotalPriceText()  {
        log.info("Verify total price : " + totalPriceText.toString());
        return getTextFromElement(totalPriceText);
    }

    public void clickOnConfirm() {
        log.info("Click on confirm button : " + confirmButton.toString());
        clickOnElement(confirmButton);
    }

    public void clickOnPaymentInfoContinue()  {
        log.info("Click on Payment confirm button : " + paymentInfoContinueButton.toString());
        clickOnElement(paymentInfoContinueButton);
    }

}
