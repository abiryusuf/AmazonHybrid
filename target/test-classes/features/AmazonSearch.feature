Feature: Amazon e-commerce Login Functionality

  Background:
    Given  As a not validated user
    When Browse to the url "https://www.amazon.com/"

    Scenario: 1. Go to Search Box
      And Write "shoes" as in search box
      And Drop and Down for shoes for men
      Then Click shoes for men



