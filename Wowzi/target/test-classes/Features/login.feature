Feature: Wowzi's Login Functionality

  @launchUrl
  Scenario: Validate that User can launch Wowzi login page with a valid url
    Given I enter a valid url
    Then User is redirected to the Wowzi login page

  @invalidEmailAddress
  Scenario: Validate that User cannot log in with an invalid email address
    Given I am on the Wowzi login page
    When I enter an invalid email address
    And I enter a valid password
    Then User is rejected from accessing the login page

  @invalidPassword
  Scenario: Validate that User cannot log in with an invalid password
    Given User is on the Wowzi login page
    When User enter a valid email address
    And User enter an invalid password
    Then I am rejected from accessing the login page

  @loginButton
  Scenario: Validate that User can click on the login button
    Given Amen is on the Wowzi login page
    When Amen enters a valid email address
    And Amen enters a valid password
    And Amen clicks on the login button
    Then Amen is redirected to the next page

  @SuccessfulLogin
  Scenario: Validate that User can access the User profile page
    Given Customer is on the Wowzi login page
    When Customer enters a valid email address
    And Customer enters a valid password
    And Customer clicks on the login button
    Then Customer is redirected to User profile page

  @closeBanner
  Scenario: Validate that User can close banner on the User profile page
    Given Cheryl is on the Wowzi login page
    When Cheryl enters a valid email address
    And Cheryl enters a valid password
    And Cheryl clicks on the login button
    Then Cheryl should be able to close the banner on the User profile page

  @logOut
  Scenario: Validate that User can logout of the Wowzi Application successfully
    Given Amy is on the Wowzi login page
    When Amy enters a valid email address
    And Amy enters a valid password
    And  Amy clicks on the login button
    Then Amy should be able to close the banner on the User profile page
    When Amy clicks on the settings icon
    And Amy clicks on the logout button
    Then Amy should be logged out of the Wowzi Application successfully
    
   
	