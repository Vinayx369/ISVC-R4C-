Feature: R4C Quality Case Creation

@TestCaseWQCCNo1
@SanityWQCC
Scenario: Verify the Case creation for Service Type as Stock Rotation & Return Reason as Standard Stock Rotation with Freight type as CRF using PO Search(Without ULT)
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
   And Select Purchase/Sales Order button and Enter PO Number Through Excel
   And Select Start Date and End Date
   Then Click on the search button web
   #And Select All Line items
   #And Select All Line items with RM
   And Select First Item
   And Click on the Next button after All Line Items
   When Enter Quantity into All fields
   When Click On Warranty Entitlement Check
   And Click on next
   And Enter MRB into All fields through Excel
   And Clickon PO History check button
   And Click on next
   And Click On Credit price Validation
   And Click on the Save and Summary button
   And Click on submit button After Summary
   
@TestCaseWQCCNo2
@SanityWQCC
Scenario: Verify the Case creation for Service Type as Quality & Remedy as Credit & Return Reason as QAN/MRB using SO Search
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
   And Select Purchase/Sales Order button and Enter PO Number Through Excel
   #And Select Purchase/Sales Order button and Enter PO Number "4512168242"
   And Select Start Date and End Date
   Then Click on the search button web
   And Select First Item
   And Click on the Next button after All Line Items
   When Enter Quantity into All fields
   When Click On Warranty Entitlement Check
   And Click on next
   And Enter MRB into All fields through Excel
   And Clickon PO History check button
   And Click on next
   And Click On Credit price Validation
   And Click on the Save and Summary button
   And Click on submit button After Summary
   
   
 @TestCaseWQCCNo3
@SanityWQCC
Scenario: Verify the Case creation for Service Type as Quality & Remedy as Credit & Return Reason as QAN/MRB using MMCPN Bulk Upload
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
   And Upload Bulk File "" Quality Portal
   And Click On Validate Button
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Clickon PO History check button
   And Click on next
   And Click On Credit price Validation
   And Click on the Save and Summary button
   And Click on submit button After Summary
   
   
@TestCaseWQCCNo4
@SanityWQCC
Scenario: Verify the Case creation for Service Type as Quality & Remedy as NPR-Credit & Return Reason as QAN/MRB using ULT Bulk Upload
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   Then Select Service Type Quality and Click create button enter Sold through Excel file for portal
   And Select All other details
  # And Select Ship To contact
   Then Select Ship To contact second Option
   Then Select credit NPR
   And Click on next
   When Upload Bulk File "" NPR ULT Portal
   And Click On Validate Button
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check Web
   And Click on next
   And Clickon PO History check button
   Then Click Ok
   When Click on Next After PO history check
   And Click On Credit price Validation
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Close browser
   
@TestCaseWQCCNo5
@SanityWQCC
Scenario: Verify the Case creation for Service Type as Quality & Remedy as NPR-Credit & Return Reason as QAN/MRB using CPN Search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   Then Select Service Type Quality and Click create button enter Sold through Excel file for portal
   And Select All other details
   And Select Ship To contact
   Then Select credit NPR
   And Click on next
   And click on Product radio button
   And Select CPN Radio button
   And Enter CPN Number through Excel
   And click on search button
   And Select First Item
   And Click Next button after All Item selection
   And Enter ULTs from Excel
   When Click On Warranty Entitlement Check
   And Click on next
   And Enter MRB into All fields through Excel
   And Clickon PO History check button
   When Click on Next After PO history check
   And Click On Credit price Validation
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Close browser
   
@TestCaseWQCCNo6
@SanityWQCC
Scenario: Verify the Case creation for Service Type as Quality & Remedy as NPR-Credit & Return Reason as QAN/MRB using MM Search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   Then Select Service Type Quality and Click create button enter Sold through Excel file for portal
   And Select All other details
   And Select Ship To contact
   Then Select credit NPR
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
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Click I Agree Buttion 
   And Close browser
    
@TestCaseWQCCNo8
@SanityWQCC
Scenario: Verify the Case creation for Service Type as Quality with ULT is mandatory
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   Then Select Service Type Quality and Click create button enter Sold through Excel file for portal
   And Select All other details
   And Select Ship To contact
   Then Select credit NPR
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   When Select ALL Web
   And Click Next button after All Item selection
   And Enter ULTs from Excel
   When Click On Warranty Entitlement Check Web
   And Click on next
   And Enter MRB into All fields through Excel
   And Clickon PO History check button
   Then Click Ok
   When Click on Next After PO history check
   And Click On Credit price Validation
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Click I Agree Buttion 
   And Close browser
   
   
@TestCaseWQCCNo9
@SanityWQCC
Scenario: Verify the Case creation for Service Type as Quality with ULT is not mandatory
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
   When Select ALL Web
   And Click Next button after All Item selection
   And Enter ULTs from Excel
   When Click On Warranty Entitlement Check
   And Click on next
   And Enter MRB into All fields through Excel
   And Clickon PO History check button
   When Click on Next After PO history check
   And Click On Credit price Validation
   And Click on the Save and Summary button
   And Click on submit button After Summary
   
   
   @TestCaseWQCCNo10
@SanityWQCC
Scenario: Verify the PO Search functionality
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
   And Select Purchase/Sales Order button and Enter PO Number Through Excel
   And Select Start Date and End Date
    Then Click on the search button web
   
@TestCaseWQCCNo11
@SanityWQCC
Scenario: Verify the SO Search functionality
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
   And Select Purchase/Sales Order button and Enter SO Number through Excel
   #And Select Purchase/Sales Order button and Enter SO Number "0019141969"
   And Select Start Date and End Date
    Then Click on the search button web
   
@TestCaseWQCCNo12
@SanityWQCC
Scenario: Verify the MM Search functionality
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
   
@TestCaseWQCCNo13
@SanityWQCC
Scenario: Verify the OPN Search functionality
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
   And click on Product radio button
   And Click on Order Part Number radio button
   When Enter OPN into search box "6576567"
   And click on search button 
   And Close browser
   
@TestCaseWQCCNo14
@SanityWQCC
Scenario: Verify the CPN Search functionality
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
   And click on Product radio button
   And Select CPN Radio button
   And Enter CPN Number through Excel
   And click on search button 
   And Close browser
   
@TestCaseWQCCNo15
@SanityWQCC
Scenario: Verify the MMCPN Bulk Upload functionality
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
   And Upload Bulk File "" Quality Portal
   And Click On Validate Button

   
@TestCaseWQCCNo16
@SanityWQCC
Scenario: Verify the ULT Bulk Upload functionality
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
   And Upload Bulk File "" NPR ULT Portal
   And Click On Validate Button
   
   @TestCaseWQCCNo17
@SanityWQCC
Scenario: Verify the PO History functionality
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
   When Click On Warranty Entitlement Check
   And Click on next
   And Enter MRB into All fields through Excel
   And Clickon PO History check button
   When Click on Next After PO history check
   
@TestCaseWQCCNo18
@SanityWQCC
Scenario: Verify the Warranty Entitlement Check functionality without ULT
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
   When Click On Warranty Entitlement Check
   And Click on next
   
   @TestCaseWQCCNo19
@SanityWQCC
Scenario: Verify the Warranty Entitlement Check functionality with ULT
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
   When Click On Warranty Entitlement Check
   And Click on next
   
@TestCaseWQCCNo20
@SanityWQCC
Scenario: Verify the Price Override functionality 
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
   When Click On Warranty Entitlement Check
   And Click on next
   And Enter MRB into All fields through Excel
   And Clickon PO History check button
   When Click on Next After PO history check
   And Click On Credit price Validation
   And Click on the Save and Summary button
   And Click on submit button After Summary
   
@TestCaseWQCCNo21
@SanityWQCC
Scenario: Verify the Pending Approval Case creation with >=100K 
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
   And Select Purchase/Sales Order button and Enter PO Number Through Excel
   And Select Start Date and End Date
   Then Click on the search button web
   And Select First Item
   And Click on the Next button after All Line Items
   When Enter Quantity into All fields through excel
   When Click On Warranty Entitlement Check
   And Click on next
   And Enter MRB into All fields through Excel
   And Clickon PO History check button
   And Click on next
   And Click On Credit price Validation
   And Click on the Save and Summary button
   And Click on submit button After Summary