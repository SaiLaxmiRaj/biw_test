package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps
{
    @Given("I am on home page")
    public void iAmOnHomePage()
    {

    }

    @When("I click on register link")
    public void iClickOnRegisterLink()
    {
        new HomePage().clickOnRegisterLink();
    }

    @Then("I should navigate to register page successfully")
    public void iShouldNavigateToRegisterPageSuccessfully()
    {
        new RegisterPage().getRegisterText();
    }

    @When("I enter first name {string} field")
    public void iEnterFirstNameField(String firstName)
    {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("I enter last name {string} field")
    public void iEnterLastNameField(String lastName)
    {
        new RegisterPage().enterLastName(lastName);
    }

    @And("I select day {string},month {string}, year {string}")
    public void iSelectDayMonthYear(String day, String month, String year)
    {
        new RegisterPage().selectDateOfBirth(day,month,year);
    }

    @And("I enter email {string} field")
    public void iEnterEmailField(String email)
    {
        new RegisterPage().enterEmail(email);
    }

    @And("I enter password {string}  field")
    public void iEnterPasswordField(String password)
    {
        new RegisterPage().enterPassword(password);
    }

    @And("I enter confirm password {string} field")
    public void iEnterConfirmPasswordField(String confPassword)
    {
        new RegisterPage().enterConfirmPassword(confPassword);
    }

    @And("I click on register button")
    public void iClickOnRegisterButton()
    {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should create account successfully")
    public void iShouldCreateAccountSuccessfully()
    {
        new RegisterPage().getRegisterText();
    }

    @And("I click on continue button")
    public void iClickOnContinueButton()
    {
        new RegisterPage().clickOnContinueButton();
    }
}
