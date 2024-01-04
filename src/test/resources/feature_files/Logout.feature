
@TutorialsNinjaLogout
Feature: Validating LoginLogout TutorialsNinja
  I want to validate the login and logout of tutorialsninja

  @Login
  Scenario: This is Login scenario of Tutorialsninja
    Given I open a Firefox Browser
    When I enter the URL for tutorialsninja
    Then I click on my account button
    And I click on login button
    And login page i enter username 
    And I enter user password
    Then I click on login option
    

  @Logout
  Scenario Outline: This is Logout scenario of Tutorialsninja
    Given I am inside the Inbox page
    And I validate the presence of the Logout link 
    When I click on the Logout button 
    Then I logged out of successfuly 

    