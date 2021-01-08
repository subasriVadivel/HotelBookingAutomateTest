@HotelBookingFormFeature
Feature: Hotel Booking Application Form
  
  Scenario: check error message by clicking Confirm Booking without providing First Name and enter First Name
    Given User is on Hotel Booking Form Page
    When User clicking on Confirm Booking without providing First Name
    Then Please fill the First Name alert message should populate
    And Enter First Name as "Subasri"

  Scenario: check error message by clicking Confirm Booking without providing Last Name and enter Last Name
    Given User is on Hotel Booking Form Page
    When User clicking on Confirm Booking without providing Last Name
    Then Please fill the Last Name alert message should populate
    And Enter Last Name as "Vadivel"
    
    Scenario: check error message by clicking Confirm Booking with wrong Email and enter Email
    Given User is on Hotel Booking Form Page
    When User clicking on Confirm Booking with wrong email format as "subasri.vadivel"
    Then Please fill the Email alert message should populate
    And Enter Email as "Subasri.Vadivel@gmail.com"
    
    Scenario: check error message by clicking Confirm Booking without providing Mobile no
    Given User is on Hotel Booking Form Page
    When User clicking on Confirm Booking without providing Mobile no
    Then Please fill the Mobile no alert message should populate
    
    Scenario: check error message by clicking Confirm Booking with providing Mobile no doesnot start with either 7,8 or 9 and doesnot have 10 digits
    Given User is on Hotel Booking Form Page
    When User clicking on Confirm Booking with providing Mobile no doesnot start with either 7,8 or 9 and doesnot have 10 digits
    Then Please fill the Contact no alert message should populate
    And Enter Mobile No as "9574326757"
    
    Scenario: Validate Address details
    Given User is on Hotel Booking Form Page
    When User enter address details as "MG Road,Bangalore Karnataka"
    Then validate Address details

    Scenario: check error message by clicking Confirm Booking without selecting City and select City
    Given User is on Hotel Booking Form Page
    When User clicking on Confirm Booking without selecting city
    Then Please select City alert message should populate
    And Select City using static dropdown
    
    Scenario: check error message by clicking Confirm Booking without selecting state and select State
    Given User is on Hotel Booking Form Page
    When User clicking on Confirm Booking without selecting State
    Then Please select State alert message should populate
    And Select State using static dropdown
    
    Scenario: Select Number of people staying at the hotel
    Given User is on Hotel Booking Form Page
    When User select Number of guest staying using static dropdown
    Then Number of guest staying selected successfully
    
    Scenario: check error message by clicking Confirm Booking without providing Card Holder Name and enter Card Holder Name
    Given User is on Hotel Booking Form Page
    When User clicking on Confirm Booking without providing Card Holder Name
    Then Please fill the Card Holder Name alert message should populate
    And Enter Card Holder Name as "Subasri V"
    
    Scenario: check error message by clicking Confirm Booking without providing Debit Card Number and enter Debit Card Number
    Given User is on Hotel Booking Form Page
    When User clicking on Confirm Booking without providing Debit Card Number
    Then Please fill the Debit Card Number alert message should populate
    And Enter Debit Card Number as "468579578"
    
    Scenario: check error message by clicking Confirm Booking without providing CVV and enter CVV
    Given User is on Hotel Booking Form Page
    When User clicking on Confirm Booking without providing CVV
    Then Please fill the CVV alert message should populate
    And Enter CVV as "478"
    
    Scenario: check error message by clicking Confirm Booking without providing Expiration Month and enter Expiration Month
    Given User is on Hotel Booking Form Page
    When User clicking on Confirm Booking without providing Expiration Month
    Then Please fill the Expiration Month alert message should populate
    And Enter Expiration Month as "12/12/2026"
    
    Scenario: check error message by clicking Confirm Booking without providing Expiration Year and enter Expiration Year
    Given User is on Hotel Booking Form Page
    When User clicking on Confirm Booking without providing Expiration Year
    Then Please fill the Expiration Year alert message should populate
    And Enter Expiration Month as "2026"
    
    Scenario: Clicking on Confirm Booking button and navigates to success page
    Given User is on Hotel Booking Form Page
    When User clicking on Confirm Booking
    Then User navigates to success page and capture success message
    And Close the window