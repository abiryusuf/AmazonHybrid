Feature: Amazon e-commerce Login Functionality

  Background:
    Given  As a not validated user
    When Browse to the url "https://www.amazon.com/"
    Then User click login button

  Scenario: 3. Valid user valid password
    And Enter "yusuf_ctg@yahoo.com" as email address
    And Click Continue
    And Enter "ja135786" as password
    And Click login
    Then Verify my account
  #Nagetive test
  #Scenario: 1. InValid user valid password
   # And Enter "yusuf_ctg@yahoo.co" as email address
    #And Click Continue
   # Then Error message should  display

  Scenario Outline: 1. Valid user valid password
    * Enter "<emailaddress>" as email address
    * Click Continue
    * Enter "<password>" as password
    * Click login
    * Verify my account "<username>"
    Examples:
      |emailaddress            |password
      |yusuf_ctg@yahoo.com     | ABC







