Feature: Case Creation Workflow for Miscellaneous save for later

@TestCaseMSFLNo1 
@SanityMSFL
Scenario: Verify the Save for Later functionality in Request Header details
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
    And Check Status Open Unsubmitted
    And Print Case No into Console SR
    And Close browser
       
@TestCaseMSFLNo2
@SanityMSFL
Scenario: Verify the Save for Later functionality Product Validation/PO History page
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
And Click on next
And Enter MMIDs By using Excel Sheet
And Click on search button after Entering MM Number
When Select ALL
#And Select All Line items with RM
When Clickon PO History only
When Click on Save for later button
 And Check Status Open Unsubmitted
 And Print Case No into Console SR
 And Close browser
 
 @TestCaseMSFLNo3
@SanityMSFL
Scenario: Verify the Save for Later functionality Credit Price Validation page
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
And Click on next
And Enter MMIDs By using Excel Sheet
And Click on search button after Entering MM Number
When Select ALL
#And Select All Line items with RM
And Clickon PO History
When Enter Quantity into All fields
When Click on the Get credit price button
When Click Cancel
Then Click Ok
 
 @TestCaseMSFLNo4
@SanityMSFL
Scenario: Verify the Save for Later functionality in Request Header details
Given User Launch Chrome browser
When User open URL
Then User Enter Email Address and pass PassWord
And Click on login
#And Enter text global excel
#And Click on the New R4C case creation button
#And Select Service Type Miscellaneous and Click on Create buttons and enter sold to 
And Select Internal Case Creation Option
And Select Return Only
And Select Reason FOCS
# And Select Ship To contact
#And Select Sold To Contact
And Select RCA address first
And Select Return customer contact first
And Select CA Address first
When select Collection Contact first
When Click on Save for later button
 And Check Status Open Unsubmitted
 And Print Case No into Console SR
 And Close browser
    
    
@TestCaseMSFLNo5
@SanityMSFL
Scenario: Verify the Save for Later functionality Product Validation
Given User Launch Chrome browser
When User open URL
Then User Enter Email Address and pass PassWord
And Click on login
#And Enter text global excel
#And Click on the New R4C case creation button
#And Select Service Type Miscellaneous and Click on Create buttons and enter sold to 
And Select Internal Case Creation Option
And Select Return Only
And Select Reason FOCS
# And Select Ship To contact
#And Select Sold To Contact
And Select RCA address first
And Select Return customer contact first
And Select CA Address first
When select Collection Contact first
And Click on next
And Enter MMIDs By using Excel Sheet
And Click on search button after Entering MM Number
When Select ALL
#And Select All Line items with RM
When Click on next after selection 
#And Clickon PO History
When Enter Quantity into All fields
When Select BoxCondition
And Click Product Validate
When Click Cancel
Then Click Ok
 And Close browser



@TestCaseMSFLNo6
@SanityMSFL
Scenario: Verify the Save for Later functionality in Request Header details
Given User Launch Chrome browser
When User open URL
Then User Enter Email Address and pass PassWord
And Click on login
#And Enter text global excel
#And Click on the New R4C case creation button
#And Select Service Type Miscellaneous and Click on Create buttons and enter sold to 
And Select Internal Case Creation Option
And Select Return Only
And Select Reason Internal return
# And Select Ship To contact
#And Select Sold To Contact
And Select RCA address first
And Select Return customer contact first
And Select CA Address first
When select Collection Contact first
When Click on Save for later button
 And Check Status Open Unsubmitted
 And Print Case No into Console SR
 And Close browser
 


@TestCaseMSFLNo7
@SanityMSFL
Scenario: Verify the Save for Later functionality Product Validation
Given User Launch Chrome browser
When User open URL
Then User Enter Email Address and pass PassWord
And Click on login
#And Enter text global excel
#And Click on the New R4C case creation button
#And Select Service Type Miscellaneous and Click on Create buttons and enter sold to 
And Select Internal Case Creation Option
And Select Return Only
And Select Reason Internal return
Then Click Ok
# And Select Ship To contact
#And Select Sold To Contact
And Select RCA address first
And Select Return customer contact first
And Select CA Address first
When select Collection Contact first
And Click on next
And Enter MMIDs By using Excel Sheet
And Click on search button after Entering MM Number
When Select ALL
#And Select All Line items with RM
When Click on next after selection 
#And Clickon PO History
When Enter Quantity into All fields
When Select BoxCondition
And Click Product Validate
When Click Cancel
Then Click Ok
 