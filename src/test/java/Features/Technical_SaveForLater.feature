Feature: R4C  Save For Later 
Background:
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
@TestCaseTSFLNo1
@SanityTSFL
 Scenario: Verify the Save for Later functionality in Request Header details
   
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold To "6006683685"
   And Select Remedy credit and reason
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
   And Close browser
   
   @TestCaseTSFLNo2
   @SanityTSFL 
   Scenario: Verify the Save for Later functionality Warranty Entitlement check page
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold To "83685"
   And Select Remedy credit and reason Tech Simple
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99APD4"
   And Click on search button after Entering MM Number 
   When Select ALL
    #And Select All Line items
   #And Click Next button after All Item selection
   When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
   And Close browser
   
   
   @TestCaseTSFLNo3
   @SanityTSFL
   Scenario: Verify the Save for Later functionality Warranty Entitlement check page
   
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold To "83685"
   And Select Remedy credit and reason Tech Simple
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99APD4"
   And Click on search button after Entering MM Number
   When Select ALL 
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
   And Close browser
   
   
   
   @TestCaseTSFLNo4
   @SanityTSFL
   Scenario: Verify the Save for Later functionality Product Validation/PO History page
   
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold To "83685"
   And Select Remedy credit and reason Tech Simple
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99APD4"
   And Click on search button after Entering MM Number 
   When Select ALL
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Clickon PO History check button
   When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
   And Close browser
   
   
   @TestCaseTSFLNo5
   @SanityTSFL
   Scenario: Verify the Save for Later functionality Credit Price Validation page
   
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold To "83685"
   And Select Remedy credit and reason Tech Simple
   And Select Ship To contact
  And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99APD4"
   And Click on search button after Entering MM Number
   When Select ALL 
  And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Clickon PO History check button
   When Enter Return Quantity
   And Click on next
   And Click On Credit price Validation
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Print Case No into Console SR
    And Close browser
   
   
   