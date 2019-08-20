Feature: Understanding of tags
@Smoke @Sanity
Scenario: Login validation on Flipkart
    Given application is running
   Then user is able to login
   
   @Regression
   Scenario: User access to items in portal
   Given User is searching the product with code
   Then user able to add it to cart
   
   @Smoke
   Scenario: User access to remove from the cart
   Given User able to see the items count on cart
   Then user decides to remove an item
   
   @Sanity
   Scenario: User wanted to track the order
   Given user has active order
   Then user verifies the status of the order