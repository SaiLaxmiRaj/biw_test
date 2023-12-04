package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps
{
    @Given("I am on homepage")
    public void iAmOnHomepage()
    {

    }

    @When("I click on login link")
    public void iClickOnLoginLink()
    {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully()
    {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals( actualMessage, expectedMessage,"Login page not displayed");
    }

    @When("I enter email {string}")
    public void iEnterEmail(String email)
    {
            new LoginPage().enterEmailId(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password)
    {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton()
    {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should login successfully")
    public void iShouldLoginSuccessfully()
    {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals( actualMessage, expectedMessage,"Login page not displayed");
    }

    @And("I click on logout Button")
    public void iClickOnLogoutButton()
    {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should logout successfully")
    public void iShouldLogoutSuccessfully()
    {
        Assert.assertTrue(new HomePage().isLogInLinkDisplay());
    }
}
