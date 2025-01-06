Feature: R4C Case Creation

@TestCaseSRCCNo1
@SanitySRCC
@Regression
 Scenario: Verify the Case creation for Service Type as Stock Rotation & Return Reason as Standard Stock Rotation with Freight type as CRF using PO Search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   #And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select Service Type SR and Click create button enter Sold through Excel file for portal
    And Select All other details
   And Select Ship To contact
   And Select credit
   And Select return Reason Standard stock rotation
   And Select RCA address first web
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
    And Select Purchase/Sales Order button and Enter PO Number Through Excel
   #And Select Purchase/Sales Order button and Enter PO Number "4511948508"
    Then Click on the search button
    When Select ALL Web
    #And Select All Line items
    #And Select First Item
    And Click on the Next button after All Line Items
    And Click on Product Validation and Next button
    #When Enter Return Quantity
    When Enter Quantity into All fields through excel
    And Click on the Get credit price
    And Click on the Next button After credit Price
    And Enter Credit price All fields
    And Click on the Next button After Credit
    And Click on the Validate Allowance
    And Click on the Save and Summary button
    And Click on submit button After Summary
  # When Print Case No into Console SR Web
    Then User can view Case creation Popup message
    And Click on the Submit button
    Then User can view Successful message
   And Close browser
   
   
   
 @TestCaseSRCCNo2
@Regression
 Scenario: Verify the Case creation for Stock Rotation & Return Reason as Standard Stock Rotation with Freight type as IMF using SO Search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   #Then User Enter Email Address and pass PassWord
   And Click on login
   And Click Create Case button
   And Select Service Type SR and Click create button enter Sold through Excel file for portal
    And Select All other details
   And Select Ship To contact
   And Select credit
   #When Select Return Reason FCF
    And Select return Reason Standard stock rotation
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
    And Select Purchase/Sales Order button and Enter SO Number through Excel
    #And Select Purchase/Sales Order button and Enter PO Number "4511948508"
    Then Click on the search button
    And Select First Item
    #When Select ALL
    #And Select All Line items
    #And Select First Item
    And Click on the Next button after All Line Items
    And Click on Product Validation and Next button
    #When Enter Return Quantity
    When Enter Quantity into All fields through excel
    #When Enter Quantity into All fields
    And Click on the Get credit price
    And Click on the Next button After credit Price
    #And Enter Credit price
    And Enter Credit price All fields
    And Click on the Next button After Credit
    And Click on the Validate Allowance
    And Click on the Save and Summary button
    And Click on submit button After Summary
    #And Print Case No into Console SR
    #And Check RMA status
   #And Print Case No into Console SR
    Then User can view Case creation Popup message
    And Click on the Submit button
    Then User can view Successful message
    And Close browser
   
@TestCaseSRCCNo3
@Sanity
@Regression
 Scenario: Verify the Case creation for Stock Rotation & Return Reason as Promotional Stock Rotation with Freight type as CRF using MM Search
   Given User Launch Chrome browser
   When User open URL Web 
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login 
   And Click Create Case button
   And Select Service Type SR and Click create button enter Sold through Excel file for portal
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
   And Select RCA address first web
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   #When Select ALL 
   And Select First Item     
   And Clickon PO History 
   And Click on Product Validation and Next button
   When Enter Quantity into All fields through excel
   #When Enter Return Quantity
   And Click on the Get credit price
   And Click on the Next button After credit Price        
   And Click on the Next button After Credit
   And Click on the Validate Allowance
   And Click on the Save and Summary button
   And Click on submit button After Summary
   #And Check RMA status
   #And Print Case No into Console SR
   Then User can view Case creation Popup message
   And Click on the Submit button
   Then User can view Successful message
   And Close browser
   
   
   @TestCaseSRCCNo4
@Sanity
@Regression
 Scenario: Verify the Case creation for Stock Rotation & Return Reason as Promotional Stock Rotation with Freight type as IMF using Bulk Upload
   Given User Launch Chrome browser
   When User open URL Web 
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login 
   And Click Create Case button
   And Select Service Type SR and Click create button enter Sold through Excel file for portal
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
   And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
    And Click On Bulk upload SR MMCPN ""
    And Click On Validate Button
    And Clickon PO History 
    And Click on Product Validation and Next button
    When Enter Quantity into All fields through excel
    And Click on the Get credit price
    And Click on the Next button After credit Price        
    And Click on the Next button After Credit
    And Click on the Validate Allowance
    And Click on the Save and Summary button
    And Click on submit button After Summary
    #And Check RMA status
    #And Print Case No into Console SR
    Then User can view Case creation Popup message
    And Click on the Submit button
    Then User can view Successful message
    And Close browser
   
@TestCaseSRCCNo5
@SanitySRCC
@Regression
 Scenario: Verify the PO Search functionality
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   #Then User Enter Email Address and pass PassWord
   And Click on login
   And Click Create Case button
   #And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select Service Type SR and Click create button enter Sold through Excel file for portal
    And Select All other details
   And Select Ship To contact
   And Select credit
 #When Select Return Reason FCF
And Select return Reason Standard stock rotation
   And Select RCA address first web
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
   And Click on next
    And Select Purchase/Sales Order button and Enter PO Number Through Excel
   # And Select Purchase/Sales Order button and Enter PO Number "4511948508"
    Then Click on the search button
    And Close browser
   
   
   
@TestCaseSRCCNo6
@SanitySRCC
 Scenario: Verify the SO Search functionality
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   #And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select Service Type SR and Click create button enter Sold through Excel file for portal
   And Select All other details
   And Select Ship To contact
   And Select credit
   #When Select Return Reason FCF
   And Select return Reason Standard stock rotation
   And Select RCA address first web
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
   And Click on next
    And Select Purchase/Sales Order button and Enter SO Number through Excel
    #And Select Purchase/Sales Order button and Enter PO Number "4511948508"
    Then Click on the search button
    And Close browser
  
@TestCaseSRCCNo7
@Sanity
 Scenario: Verify the MM Search functionality
   Given User Launch Chrome browser
   When User open URL Web 
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login 
   And Click Create Case button
   And Select Service Type SR and Click create button enter Sold through Excel file for portal
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
   And Select RCA address first web
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   
@TestCaseSRCCNo8
@Sanity
 Scenario: Verify the CPN Search functionality
   Given User Launch Chrome browser
   When User open URL Web 
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login 
   And Click Create Case button
   And Select Service Type SR and Click create button enter Sold through Excel file for portal
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
  And Select RCA address first web
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
   And Click on next
   And click on Product radio button
   And Select CPN Radio button
  Then Enter CPN Number through Excel
   And click on search button 
   And Close browser
   
   @TestCaseSRCCNo9
@Sanity
 Scenario: Verify the OPN Search functionality
   Given User Launch Chrome browser
   When User open URL Web 
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login 
   And Click Create Case button
   And Select Service Type SR and Click create button enter Sold through Excel file for portal
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
   And Select RCA address first web
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
   And Click on next
   And click on Product radio button
   And Click on Order Part Number radio button
   When Enter OPN into search box through excel
   And click on search button 
   And Close browser
   
 @TestCaseSRCCNo10
@Sanity
 Scenario: 	Verify the Bulk Upload functionality
   Given User Launch Chrome browser
   When User open URL Web 
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login 
   And Click Create Case button
   And Select Service Type SR and Click create button enter Sold through Excel file for portal
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
   And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
   And Click on next
    And Click On Bulk upload SR MMCPN ""
    And Click On Validate Button
    And Close browser
    
    @TestCaseSRCCNo11
@Sanity
 Scenario: Verify the PO History functionality
   Given User Launch Chrome browser
   When User open URL Web 
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login 
   And Click Create Case button
   And Select Service Type SR and Click create button enter Sold through Excel file for portal
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
   And Select RCA address first web
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
  # When Select ALL 
   And Select First Item     
   And Clickon PO History 
   And Close browser
   
@TestCaseSRCCNo12
@Sanity
 Scenario: Verify the Price Override functionality 
   Given User Launch Chrome browser
   When User open URL Web 
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login 
   And Click Create Case button
   And Select Service Type SR and Click create button enter Sold through Excel file for portal
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
   And Select RCA address first web
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
   And Click on next
    And Select Purchase/Sales Order button and Enter SO Number through Excel
   Then Click on the search button
  # When Select ALL
    And Select First Item 
    And Click on the Next button after All Line Items
    And Click on Product Validation and Next button
    When Enter Quantity into All fields through excel
    And Click on the Get credit price
    And Click on the Next button After credit Price
   # And Enter Credit price <25K
    And Click on the Next button After Credit
    And Click on the Validate Allowance
    And Click on the Save and Summary button
    And Click on submit button After Summary
   #And Check RMA status
   #And Print Case No into Console SR
    Then User can view Case creation Popup message
    And Click on the Submit button
    Then User can view Successful message
    And Close browser