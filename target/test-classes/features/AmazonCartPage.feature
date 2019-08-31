Feature: Amazon e-commerce Login Functionality

  Background:
    Given  As a not validated user
    When Browse to the url "https://www.amazon.com/"

Scenario: 2 Add to cart men shoes
  When Write "Athletic shoes men" as search box and submit
  And Click tesla men shoes
  And Click choice color
  And Click Select box
  And Drop Down for  shoes size and click
  Then Click Add to cart