Feature: Testing different requests on the eccomerce application
         
   @SMOKE1
Scenario: Verify the response of api
When User send a GET request to the api
Given User is on application page and click on create Account link
And User enters all the input fields for registeration
And User click on Create an Account Button
And Verify user is on home page
And User selects the product and click on add to cart
And User enters the address details and click on next
And User click On place order Button
Then Verify the order is successfully placed

