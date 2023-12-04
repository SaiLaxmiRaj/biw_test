package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class RegisterPage extends Utilities
{
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());


    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement registerText;

    @CacheLookup
    @FindBy(xpath = "//div[@id='gender']//label")
    List<WebElement> genderRadios;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDay;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement dateOfBirthMonth;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement dateOfBirthYear;

    @CacheLookup
    @FindBy(name = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(css = "#register-button")
    WebElement registerBtn;

    @CacheLookup
    @FindBy(css = ".button-1.register-continue-button")
    WebElement continueBtn;

    public void getRegisterText()
    {
        String expectedMessage = "Register";
        String actualMessage = getTextFromElement(registerText);
        Assert.assertEquals(expectedMessage,actualMessage);
        log.info("Get registerText : " + registerText.toString() + "<br>");
    }
    public void enterFirstName(String firstName)
   {
        sendTextToElement(firstNameField, getRandomString(8) );
        log.info("Enter Firstname : '" +  "' to firstName field" + "<br>");
    }
   public void enterLastName(String lastName)
    {
        sendTextToElement(lastNameField, getRandomString(8));
        log.info("Enter Lastname : '" + "' to lastName field" + "<br>");
    }

    public void selectDateOfBirth(String day, String month, String year)
    {
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);
        selectByVisibleTextFromDropDown(dateOfBirthMonth, month);
        selectByVisibleTextFromDropDown(dateOfBirthYear, year);
        log.info("Select day : '" + day + "', month : '" + month + "', year : '" + year + "'" + "<br>");
    }

    public void enterEmail(String email)
    {
        sendTextToElement(emailField, getRandomString(10) + "@"+getRandomString(3)+".com");
        log.info("Enter Email : '"  + "' to email field" + "<br>");
    }

    public void enterPassword(String password)
   {
        sendTextToElement(passwordField, password);
        log.info("Enter Password : '" + "' to password field" + "<br>");
    }

    public void enterConfirmPassword(String confPassword)
     {
        sendTextToElement(confirmPasswordField, confPassword);
        log.info("Enter Confirm password : '" + confPassword + "' to confirm password field" + "<br>");
    }

    public void clickOnRegisterButton()
    {
        log.info("Click on 'REGISTER' button" + "<br>");
        clickOnElement(registerBtn);
    }

    public void clickOnContinueButton()
    {
        log.info("Click on 'CONTINUE' button" + "<br>");
        clickOnElement(continueBtn);
    }
}
