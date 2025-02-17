@activity5
Feature: Login Test
  I want to use this template for my feature file


  Scenario Outline: Testing Login without Examples
    Given the user is on the login page
    When the user enters "<Usernames>" and "<Passwords>"
    And clicks the submit button
    Then get the confirmation text and verify message as "<Message>"
    Examples:
   		|Usernames|Passwords|Message             |
    	|admin    |password |Welcome Back, Admin! |