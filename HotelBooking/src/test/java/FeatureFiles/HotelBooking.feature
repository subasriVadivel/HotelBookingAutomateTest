@HotelBookingFeature
Feature: Hotel Booking Application Login
  
  Scenario: Invalid login to check error message for username
    Given Initialize the browser with chrome
    And Navigate to hotel booking login page "file:///E:/Selenium/login.html"
    And Verify the login page heading as Hotel Booking Application
    When User login into application without providing username as "admin"
    Then Please enter Username error message should populate

  Scenario: Invalid login to check error message for password
    Given User is on hotel booking login page
    When User login into application without providing password as "admin"
    Then Please enter Passowrd error message should populate

    Scenario: Valid login with username and password
    Given User is on hotel booking login page
    When User login into application with Username as "admin" and Password as "admin"
    Then Hotel Booking page should populate and verify page heading