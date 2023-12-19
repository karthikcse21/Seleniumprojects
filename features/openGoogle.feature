
Feature: This is to test google search
@login @smoke @valid
  Scenario: Login flow validation
    Given user is entering instagram URL
    When user is typing correct username and password
    Then the user should able to login successfully
   
   
@logout @smoke @invalid
  Scenario: logout flow validation
    Given user click logout buttton
    Then user should be able to logout successfully
    
   @Homepage @smoke @valid
   Scenario: home page validation
   Given user enter login button
   Then user should be able to enter home page successfully
