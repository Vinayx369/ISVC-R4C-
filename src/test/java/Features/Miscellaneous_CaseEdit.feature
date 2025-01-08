
Feature: Admin Case Edit

@TestCaseMCENo1
Scenario: IMF
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type Miscellaneous and Click on Create buttons and enter sold to 
    And Select credit
    And Select Ship To contact
   And Select Sold To Contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
        When Click on Save for later button
   And Click On Edit Option
   And click accelept
   And Click On Next after edit
   And Click On Next Accept Edit
   And Select Purchase/Sales Order button and Enter PO Number Through Excel
    Then Click on the search button
    When Select ALL
    And Click on the Next button after All Line Items
    When Enter Return Quantity
    And Click on the Get credit price button
    And Enter Credit price All fields 
    And Click on the Save and Summary button
    And Click on submit button After Summary
    #And Print Case No into Console SR
    And Close browser

@TestCaseMCENo2
Scenario: CMF
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type Miscellaneous and Click on Create buttons and enter sold to 
    And Select credit
    And Select Ship To contact
   And Select Sold To Contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
        When Click on Save for later button
   And Click On Edit Option
   And click accelept
   And Click On Next after edit
   And Click On Next Accept Edit
   And Select Purchase/Sales Order button and Enter PO Number Through Excel
   Then Click on the search button
    When Select ALL
    And Click on the Next button after All Line Items
    When Enter Return Quantity
    And Click on the Get credit price button
    And Enter Credit price All fields 
    And Click on the Save and Summary button
    And Click on submit button After Summary
    #And Print Case No into Console SR
    And Close browser
    
@TestCaseMCENo4
@SanityQCE
Scenario: Open Submitted
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global excel
   And Click on Related option
   When Click on View All cases option
   And Click On FilterIcon
   When Enter Case No into text field through excel
   And Click On Apply button
   And Select searched case
   And Click On Edit Option
   And click accelept
   #And click accelept
   #And Click On Edit Option
  And Click on submit button After Summary
  And Click on submit button After Summary
  And Print Case No into Console SR
  And Close browser
  
@TestCaseMCENo3
@SanityQCE
 Scenario: Global Search Case For Edit (Pending Action)
 Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Select Contact from list and enter Case no into search field "06375586"
   And click accelept
   And Click On Edit Option
  And click accelept
   And Click On Next after edit
   And Click On Next Accept Edit
   And Select Purchase/Sales Order button and Enter PO Number Through Excel
   Then Click on the search button
    When Select ALL
    And Click on the Next button after All Line Items
    When Enter Return Quantity
    And Click on the Get credit price button
    And Enter Credit price All fields 
    And Click on the Save and Summary button
    And Click on submit button After Summary
    #And Print Case No into Console SR
    And Close browser