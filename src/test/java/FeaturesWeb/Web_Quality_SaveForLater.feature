Feature: R4C Quality Save For Later Case


@TestCaseWQCCNo1
@SanityWQCC
Scenario:  Verify the Save for Later functionality in Request Header details
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   Then Select Service Type Quality and Click create button enter Sold through Excel file for portal
   And Select All other details
   And Select Ship To contact
   And Select Remedy and reason
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
    When Click on Save for later button
  When Print Case No into Console Web
   And Close browser
   
   
@TestCaseWQCCNo2
@SanityWQCC
Scenario:  Verify the Save for Later functionality Search/Upload Line item page
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   Then Select Service Type Quality and Click create button enter Sold through Excel file for portal
   And Select All other details
   And Select Ship To contact
   And Select Remedy and reason
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
    And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   #When Select ALL 
   And Select First Item     
   When Click on Save for later button
   When Print Case No into Console Web
   And Close browser
   
@TestCaseWQCCNo3
@SanityWQCC
Scenario:  Verify the Save for Later functionality Product Validation page
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   Then Select Service Type Quality and Click create button enter Sold through Excel file for portal
   And Select All other details
   And Select Ship To contact
   And Select Remedy and reason
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   And Select First Item
   And Click Next button after All Item selection
   And Enter ULTs from Excel
   When Click On Warranty Entitlement Check Web
   When Click on Save for later button
   When Print Case No into Console Web
   And Close browser
   
 @TestCaseWQCCNo4
@SanityWQCC
Scenario:  Verify the Save for Later functionality Credit Price Validation page
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   Then Select Service Type Quality and Click create button enter Sold through Excel file for portal
   And Select All other details
   And Select Ship To contact
   And Select Remedy and reason
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
    And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
    And Select First Item
   And Click Next button after All Item selection
   And Enter ULTs from Excel
   When Click On Warranty Entitlement Check Web
   And Click on next
   And Enter MRB into All fields through Excel
   And Clickon PO History check button
   Then Click Ok
   When Click on Next After PO history check
    When Click on Save for later button
   When Print Case No into Console Web
   And Close browser
   
@TestCaseWQCCNo5
@SanityWQCC
Scenario: Verify the Save for Later functionality Credit Price Validation page
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   Then Select Service Type Quality and Click create button enter Sold through Excel file for portal
   And Select All other details
   And Select Ship To contact
   And Select Remedy and reason
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   And Select First Item
   And Click Next button after All Item selection
   And Enter ULTs from Excel
   When Click On Warranty Entitlement Check Web
   And Click on next
   And Enter MRB into All fields through Excel
   And Clickon PO History check button
   Then Click Ok
   When Click on Next After PO history check
   And Click On Credit price Validation
   