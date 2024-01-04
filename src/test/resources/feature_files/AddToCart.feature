@TutorialsNinjaAddToCart
Feature: AddToCart functionality of TutorialsNinja
Background: Trying to remove the repitive step present in all scenario
 
 
  @ProductAddToCart
  Scenario: Add valid product to Shopping Cart
    Given User opens the application
    When User adds a valid  product 'hp'
    And User clicks on the search button
    Then User gets valid product info display in SearchPage
    
    Then Click on addToCart button
    

  @ShoppingCartWithItemQuantity
  Scenario: Items in the shopping cart 
    
    And User add product in cart button
    
    And click on view cart button
    Then It is open new page 

