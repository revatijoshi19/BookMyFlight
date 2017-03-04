Feature: Booking a round trip flight

  Scenario: Verifying the home page should be Flights
    Given I open the goibibo url in my browser
    Then I verify that I should land on Flights page
    Then I verify that the flights icon in the header is highlighted

  Scenario: Verifying signup flow
    Given I am on the home page of goibibo
    Then I should be able to see and click on the Signup link
    Then I verify that on clicking the link I should be able to see Signup modal
    Then I verify following fields Mobile Number, Choose Password, Email
      #For the above validation I would try all the combinations like mobile number less than and greater than 10 digits
      #Password length less than 8 characters
      #already registered email id
      #A positive validation where all the information is correct and user lands on next screen/modal
    Then I verify that I should be able to see Login with Facebook and click to login options
    Then I verfiy that on populating details I should be able to click on Create Account button
    Then I verify that on clicking the Create Account button I land on next verify OTP modal
      #With the above validation , as part of the product flow, I will also check whether I receive OTP or not
    Then I verify once on OTP modal I should be able to populate the OTP
      #As part of end to end flow, email received after signing up can also be checked

  Scenario: Verifying Sign in flow
    Given I am on the home page of goibibo
    Then I should be able to click the Sign in link
    Then I validate the Sign modal and check for validate sign in credentials
      #For the above I will be checking combinations like wrong password and right email, vice versa, both correct, both incorrect
      #Also appropriate error messages should be checked
    Then I validate other options on the Sign modal like Login with Facebook and a link to redirect the user to Sign up modal

    #I would validate that with Signup flow and Login flow user should be able to book a round trip ticket, the cases for which are mentioned below

  Scenario: Verifying that user is able to book a flight without login or signup
    Given I am on the home page of goibibo
    When I want to book a round trip flight
    Then I click on Round trip
    Then I enter the source and verify that I should be able to choose from the dropdown successfully
      #For the above I would test various alpabetical combinations and also try filling in numbers or special characters
    Then I enter the destination and verify that I should be able to choose from the dropdown successfully
      #For the above I would test various alpabetical combinations and also try filling in numbers or special characters
    Then I select the start date and verify that I am able to select any date successfully
    Then I select the return date and verify that I am able to select any date successfully
    Then I verify the Travellers dropdown
      #For the above I will be checking the number of adults, children and infants
    Then I verify the class dropdown
      #For the above check that any class can be selected successfully
    And I verify that search flight button should take me to the next page
    Then I validate that I should be able to click on the Book button
    Then I should be able to populate my details and an option to Sign In should be present
      #For signed it users , I would like to validate that details are auto populated
      #I would also verify that if I don't populate even if one of the boxes, for example : title I should not be allowed to proceed
    Then I validate that I am able to click Make Payment button





