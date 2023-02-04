

Feature: Application login


  @tag1
  Scenario: Home Page default login
    Given User is on NetBanking landing page
    When User login into appication with username and password
    Then Home page is populated
    And cards are displayed
   

      
      
