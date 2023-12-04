Feature: Product Page Feature
  In Order to perform successful Checkout
  As user
  I should add products on cart and checkout successfully


  Background:       User should navigate to register page successfully
    Given           I am on home page
    When            I click on register link
    Then            I should navigate to register page successfully

  Scenario Outline: User should create account successfully
    When            I enter first name "<firstname>" field
    And             I enter last name "<lastname>" field
    And             I select day "<day>",month "<month>", year "<year>"
    And             I enter email "<email>" field
    And             I enter password "<password>"  field
    And             I enter confirm password "<confirm password>" field
    And             I click on register button
    Then            I should create account successfully
    And             I click on continue button
    When            I click on Computer link
    And             I should navigate to Computer page successfully
    And             I click on desktops link
    And             I should navigate to Desktop page successfully
    Then            I click on Digital Storm VANQUISH PC product
    And             I should navigate to Digital Storm VANQUISH PC page successfully
    And             I click on Add to cart product
    Then            I click on shoppingCart Link
    And             I should navigate to Shopping Cart Page
    And             I should select agree button box to go checkout
    And             I should click checkout button
    Then            I should navigate checkoutpage
    And             I enter email "dfxbgfg@fty.com"
    And             I enter password "Xaybzc."
    And             I click on login button
    And             I should navigate to Shopping Cart Page
    And             I should select agree button box to go checkout
    And             I should click checkout button
    Then            I navigate to Checkout Page
#    And             I select Country
#    And             I enter City
#    And             I enter Address
#    And             I enter Postal Code
#    And             I enter Phone Number
#    And             I click on continue
    Then            I click on billing address button
    And             I click on next day air service
    And             I click on Shipping Method button
    And             I click on credit cart payment option
    And             I fill card details
    And             I click on payment continue button
    Then            I verify the credit card as payment method
    And             I click on confirm button
    Then            I verify the Thank you message
    Then            I verify the order has been successfully processed
    And             I click on continue order number


     Examples:
      |firstname    |lastname   |day|month    |year  |email          |password |confirm password|
      |             |           | 1 |March    | 2014 |xyzab@gmail.com|Xaybzc.  |Xaybzc.         |




