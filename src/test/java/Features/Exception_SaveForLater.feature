Feature: Exception Case Creation
#Background:
   #Given User Launch Chrome browser
   #When User open URL 
   #Then User Enter Email Address and pass PassWord
   #And Click on login
@TestCaseESFLNo1
@SanityESFL
Scenario: Verify the Save for Later functionality in Request Header details
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Exception and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Exception Return Reason
   #Then Select Exception Return Reason and click ok
   Then Enter Justification
   And Enter CIRS Through Excel
  #Then Select RCA address first and click ok
  And Select RCA address first
   #And Select Fright Type IMF
   Then Select Fright Type IMF without cancel
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
  And Close browser
   
 @TestCaseESFLNo2
 @SanityESFL
Scenario: Verify the Save for Later functionality Search/Upload Line item page
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Exception and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit
    And Select GRL Exception Reason
   Then Enter Justification
   And Select RCA address first
   #And Select Fright Type IMF
   Then Select Fright Type IMF without cancel
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Select Purchase/Sales Order button and Enter PO Number Through Excel
   Then Click on the search button
   Then Select All Line items
  # Then Click on the Next button after All Line Items
   When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
   And Close browser
   

   
@TestCaseESFLNo3
@SanityESFL
Scenario: Verify the Save for Later functionality Warranty Entitlement check page
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Exception and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit NPR
   #And Select GRL Exception Reason
   Then Enter Justification
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
 And Select All Line items with RM
 And Click on the Next button after All Line Items
 When Enter Quantity into All fields
 When Click On Warranty Entitlement Check
 When Click on Save for later button
 And Check Status Open Unsubmitted
 And Print Case No into Console SR
And Close browser
  
  
    @TestCaseESFLNo4
   @SanityESFL
Scenario: Verify the Save for Later functionality Product Validation/PO History page
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Exception and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit NPR
    #And Select GRL Exception Reason
   Then Enter Justification
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
 And Select All Line items with RM
 And Click on the Next button after All Line Items
 When Enter Quantity into All fields
 When Click On Warranty Entitlement Check
 And Click on next
 And Clickon PO History check button
  When Click on Save for later button
   And Check Status Open Unsubmitted
  And Print Case No into Console SR
  And Close browser
   
     @TestCaseESFLNo5
   @SanityESFL
Scenario: Verify the Save for Later functionality Credit Price Validation page
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Exception and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit NPR
    #And Select GRL Exception Reason
   Then Enter Justification
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
 And Select All Line items with RM
 And Click on the Next button after All Line Items
 When Enter Quantity into All fields
 When Click On Warranty Entitlement Check
 And Click on next
 And Clickon PO History check button
 And Click on next
 And Click On Credit price Validation
# When Click on Save for later button
  # And Check Status Open Unsubmitted
  #And Print Case No into Console SR
 And Close browser
   
   