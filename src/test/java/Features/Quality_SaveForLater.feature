Feature: Case Save For Later
Background:
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   
@TestCaseQSFLNo1
@SanityQSFL
Scenario: Verify the Save for Later functionality in Request Header details
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select Remedy and reason
   And Select All other details
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
   And Close browser
   
   
@TestCaseQSFLNo2
@SanityQSFL
Scenario: Verify the Save for Later functionality Search/Upload Line item page
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select Remedy and reason
   And Select All other details
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   When Select ALL
   When Click on Save for later button
   And Check Status Open Unsubmitted
  And Print Case No into Console SR
   And Close browser
   
@TestCaseQSFLNo3
@SanityQSFL
Scenario: Verify the Save for Later functionality Warranty Entitlement check page
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select Remedy and reason
   And Select All other details
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   When Select ALL
  # And Select All Line items with RM
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   When Click on Save for later button
   And Check Status Open Unsubmitted
  And Print Case No into Console SR
   And Close browser
   
   
@TestCaseQSFLNo4
@SanityQSFL
Scenario: Verify the Save for Later functionality Product Validation/PO History page
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select Remedy and reason
   And Select All other details
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   When Select ALL
  # And Select All Line items with RM
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Enter MRB into All fields through Excel
   And Clickon PO History check button
   When Click on Save for later button
   And Check Status Open Unsubmitted
 And Print Case No into Console SR
   And Close browser
   
   
 @TestCaseQSFLNo5
 @SanityQSFL
Scenario: Verify the Save for Later functionality Credit Price Validation page
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select Remedy and reason
   And Select All other details
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   When Select ALL
   #And Select All Line items with RM
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Enter MRB into All fields through Excel
   And Clickon PO History check button
   When Click on Next After PO history check
   When Enter Return Quantity
   And Click On Credit price Validation
   #When Click on Save for later button
  #And Check Status Open Unsubmitted
   #And Print Case No into Console SR
  And Close browser
      
   