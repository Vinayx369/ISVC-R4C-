Feature: R4C Technical Case Creation

@TestCaseWTSFLNo1
@SanitySRCC
 Scenario: Verify the Save for Later functionality in Request Header details
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select Remedy credit and reason
   And Select RCA address first 
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   When Click on Save for later button
   When Print Case No into Console Web
   When Check Status open unsubmited
  # And Close browser
   
   
@TestCaseWTSFLNo2
@SanitySRCC
 Scenario: Verify the Save for Later functionality Search/Upload Line item page
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select Remedy credit and reason
   And Select RCA address first 
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   When Select ALL Web 
   When Click on Save for later button
   When Print Case No into Console Web
   And Close browser
   
@TestCaseWTSFLNo3
@SanitySRCC
 Scenario: Verify the Save for Later functionality Warranty Entitlement check page
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select Remedy credit and reason
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
    When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   When Select ALL Web
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   When Click on Save for later button
   And Check Status Open Unsubmitted
   And Close browser
   
@TestCaseWTSFLNo4
@SanitySRCC
 Scenario: Verify the Save for Later functionality Product Validation/PO History page
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select Remedy credit and reason
   And Select RCA address first web
   And Select Return customer contact first
   And Select CA Address first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   When Select ALL 
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Clickon PO History check button
   When Click on Save for later button
   #And Check Status Open Unsubmitted
   And Close browser
   
@TestCaseWTSFLNo5
@SanitySRCC
 Scenario: Verify the Save for Later functionality Product Validation/PO History page
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select Remedy credit and reason
   And Select RCA address first web
   And Select Return customer contact first
   And Select CA Address first
    And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   When Select ALL 
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Clickon PO History check button
   And Click on next
   And Click On Credit price Validation
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Close browser
   