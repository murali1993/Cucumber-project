Feature: Login Feature
  Verify if user is able to Login in to the site
@Login
  Scenario: Login as a authenticated user
    Given user is  on homepage
    When user navigates to Login Page 
    And user enters username and Password
    Then user successfully logged out