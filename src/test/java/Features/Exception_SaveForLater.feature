Feature: Exception Case Creation
#Background:
   #Given User Launch Chrome browser
   #When User open URL 
   #Then User Enter Email Address and pass PassWord
   #And Click on login
@TestCaseNo1
@Sanity
Scenario: Verify the Case creation for Service Type as Exception & Remedy as Credit & Return Reason as Exception Return using PO Search
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Exception and Click create button enter Sold through Excel file
   And Select All other detils
   And Select Ship To contact
   And Select credit
    And Select Exception Return Reason
   Then Enter Justification
   And Enter CIRS Through Excel
   And Select RCA address first
   And Select Fright Type IMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
   And Close browser
   
 @TestCaseNo2
 @Sanity
Scenario: Verify the MM Search functionality
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Exception and Click create button enter Sold through Excel file
   And Select All other detils
   And Select Ship To contact
   And Select credit
    And Select GRL Exception Reason
   Then Enter Justification
   And Select RCA address first
   And Select Fright Type IMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   And Clickon PO History check button
   When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
   And Close browser
   
@TestCaseNo3
@Sanity
Scenario: Verify the PO History functionality for Remedy as NPR-Credit
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Exception and Click create button enter Sold through Excel file
   And Select All other detils
   And Select Ship To contact
   And Select credit NPR
    #And Select GRL Exception Reason
   Then Enter Justification
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   And Clickon PO History check button
 And Select All Line items with RM
 And Click on the Next button after All Line Items
 When Enter Quantity into All fields
 When Click On Warranty Entitlement Check
  When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
  # And Close browser
   
    @TestCaseNo4
   @Sanity
Scenario: Verify the PO History functionality for Remedy as NPR-Credit
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Exception and Click create button enter Sold through Excel file
   And Select All other detils
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
 And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
 And Clickon PO History check button
    When Click on Save for later button
   And Check Status Open Unsubmitted
  And Print Case No into Console SR
   And Close browser