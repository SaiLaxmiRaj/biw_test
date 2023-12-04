package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductStep
{
    @When("I click on Computer link")
    public void iClickOnComputerLink()
    {
        new HomePage().clickOnComputersMenu();
    }


    @Then("I should navigate to Computer page successfully")
    public void iShouldNavigateToComputerPageSuccessfully()
    {
        new ComputerPage().computerText();
    }

    @And("I click on desktops link")
    public void iClickOnDesktopsLink()
    {
                new HomePage().clickOnDesktopsSubMenu();
    }

    @And("I should navigate to Desktop page successfully")
    public void iShouldNavigateToDesktopPageSuccessfully()
    {
        new DesktopPage().deskTopText();
    }


    @Then("I click on Digital Storm VANQUISH PC product")
    public void iClickOnDigitalStormVANQUISHPCProduct()
    {
        new DigitalStromPage().clickOndigitalStromProduct();
    }

    @And("I should navigate to Digital Storm VANQUISH PC page successfully")
    public void iShouldNavigateToDigitalStormVANQUISHPCPageSuccessfully()
    {
        new DigitalStromPage().clickOndigitalStromProductText();
    }

    @And("I click on Add to cart product")
    public void iClickOnAddToCartProduct()
    {
        new DigitalStromPage().clickOnAddToCartProduct();
    }


     @Then("I click on shoppingCart Link")
    public void iClickOnShoppingCartLink()
     {
        new DigitalStromPage().clickOnShoppinCartLink();
    }

    @And("I should navigate to Shopping Cart Page")
    public void iShouldNavigateToShoppingCartPage()
    {
        new ShoppingCartPage().shoppingCartText();
    }

    @And("I should select agree button box to go checkout")
    public void iShouldSelectAgreeButtonBoxToGoCheckout()
    {
        new ShoppingCartPage().clickOnAgreeButtonBox();
    }

    @And("I should click checkout button")
    public void iShouldClickCheckoutButton()
    {
        new ShoppingCartPage().clickOnCheckout();
    }

    @Then("I should navigate checkoutpage")
    public void iShouldNavigateCheckoutpage()
    {
        new ShoppingCartPage().checkoutPageVerificationText();
    }

    @Then("I navigate to Checkout Page")
    public void iNavigateToCheckoutPage()
    {
        new CheckOutPage().checkoutText();
    }

    @And("I select Country")
    public void iSelectCountry()
    {
        new CheckOutPage().selectCountry("United Kingdom");
    }

    @And("I enter City")
    public void iEnterCity()
    {
        new CheckOutPage().enterCity();
    }

    @And("I enter Address")
    public void iEnterAddress()
    {
        new CheckOutPage().enterAddress();
    }

    @And("I enter Postal Code")
    public void iEnterPostalCode()
    {
        new CheckOutPage().enterPostalCode();
    }

    @And("I enter Phone Number")
    public void iEnterPhoneNumber()
    {
        new CheckOutPage().enterPhoneNumber();
    }

    @And("I click on continue")
    public void iClickOnContinue()
    {
        new CheckOutPage().continueButton();
    }

    @Then("I click on billing address button")
    public void iClickOnBillingAddressButton() {
        new CheckOutPage().billingContinueButton();
    }

    @And("I click on Shipping Method button")
    public void iClickOnShippingMethodButton() {
        new CheckOutPage().shippingMethodContinueButton();
    }

    @And("I click on continue order number")
    public void iClickOnContinueOrderNumber()
    {
        new CheckOutPage().continueButtonOderNumber();

    }

    @And("^I click on next day air service$")
    public void iClickOnNextDayAirService() throws InterruptedException {
        new CheckOutPage().selectGroundShipping();
    }

    @And("^I click on credit cart payment option$")
    public void iClickOnCreditCartPaymentOption() throws InterruptedException {
        new CheckOutPage().clickOnCreditCard();
        new CheckOutPage().clickOnPaymentContinue();
    }

    @And("^I fill card details$")
    public void iFillCardDetails() throws InterruptedException {
        new CheckOutPage().enterCardHolderName("Abcd Xyz");
        new CheckOutPage().enterCardNumber("5573615091331588");
        new CheckOutPage().selectExpirationDate("05", "2025");
        new CheckOutPage().enterCardCode("123");

    }

    @And("^I click on payment continue button$")
    public void iClickOnPaymentContinueButton() throws InterruptedException {
        new CheckOutPage().clickOnPaymentInfoContinue();
    }

    @Then("^I verify the credit card as payment method$")
    public void iVerifyTheCreditCardAsPaymentMethod() throws InterruptedException {
        String expectedMessage = "Credit Card";
        String actualMessage =  new CheckOutPage().getPaymentTypeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
    }

    @Then("^I verify the next day air as delivery method$")
    public void iVerifyTheNextDayAirAsDeliveryMethod() throws InterruptedException {
        String expectedMessage = "Next Day Air";
        String actualMessage = new CheckOutPage().getShippingMethodText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
    }

    @Then("^I verify the total price as \\$(\\d+),(\\d+)\\.(\\d+)$")
    public void iVerifyTheTotalPriceAs$(int arg0, int arg1, int arg2) throws InterruptedException {
        String expectedMessage = "$2,950.00";
        String actualMessage = new CheckOutPage().getTotalPriceText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
    }

    @And("^I click on confirm button$")
    public void iClickOnConfirmButton() throws InterruptedException {
        new CheckOutPage().clickOnConfirm();
    }

    @Then("^I verify the Thank you message$")
    public void iVerifyTheThankYouMessage() throws InterruptedException {
        String expectedMessage = "Thank you";
        String actualMessage = new HomePage().getThankYouText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
    }

    @Then("^I verify the order has been successfully processed$")
    public void iVerifyTheOrderHasBeenSuccessfullyProcessed() throws InterruptedException {
        String expectedMessage = "Your order has been successfully processed!";
        String actualMessage = new HomePage().getSuccessfulText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
    }

    @Then("^I navigate to home page$")
    public void iNavigateToHomePage() throws InterruptedException {
        new HomePage().clickOnContinue();
        String expectedMessage = "Welcome to our store";
        String actualMessage = new HomePage().getWelcomeStoreText();
        Assert.assertEquals(expectedMessage, actualMessage, "Unable to checkout");
    }
}
