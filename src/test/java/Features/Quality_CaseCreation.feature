Feature: Case Creation Workflow for Quality
Background:
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
@TestCaseQCCNo1
@SanityQCC
Scenario: Verify the Case creation for Service Type as Quality & Remedy as Credit & Return Reason as QAN/MRB using PO Search 
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
   And Select Purchase/Sales Order button and Enter PO Number Through Excel
   And Select Start Date and End Date
   Then Click on the search button
   And Select All Line items
   And Select All Line items with RM
    And Select First Item
   And Click on the Next button after All Line Items
   When Enter Quantity into All fields
    When Click On Warranty Entitlement Check
    And Click on next
    And Enter MRB into All fields through Excel
    And Clickon PO History check button
    And Click on next
    And Click On Credit price Validation
   #And Enter Credit price <100K
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Print Case No into Console SR
  
 @TestCaseQCCNo2
 @SanityQCC
 Scenario: Verify the Case creation for Service Type as Quality & Remedy as Credit & Return Reason as QAN/MRB using SO Search 
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select Remedy and reason
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Select Purchase/Sales Order button and Enter SO Number through Excel
   And Select Start Date and End Date
   Then Click on the search button
   And Select All Line items
   And Click on the Next button after All Line Items
    When Enter Quantity into All fields through excel
    When Click On Warranty Entitlement Check
    And Click on next
    And Enter MRB into All fields through Excel
    And Clickon PO History check button
    And Click on next
    And Click On Credit price Validation
    And Enter Credit price <25K
    And Click on the Save and Summary button
    And Click on submit button After Summary
   # And Check RMA status
   # And Print Case No into Console
    And Print Case No into Console SR
     
@TestCaseQCCNo3
@SanityQCC
 Scenario: Verify the Case creation for Service Type as Quality & Remedy as Credit & Return Reason as QAN/MRB using MMCPN Bulk Upload 
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select Remedy and reason
   And Select Ship To contact
   And Select Sold To Contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Upload Bulk File "" quality MMCPN
   And Click On Validate Button
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    And Click on next
    And Click On Credit price Validation
    And Enter Credit price <25K
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Check RMA status
    And Print Case No into Console SR
   
 @TestCaseQCCNo4
 @SanityQCC
 Scenario: Verify the Case creation for Service Type as Quality & Remedy as NPR-Credit & Return Reason as QAN/MRB using ULT Bulk Upload
  And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Click On create button and select remedy NPR credit and select reason
   And Select All other details
   And Select Sold To Contact
   #And Select Sold To Contact second option
   And Select Ship To contact
   And Select Ship To contact second Option
   And Click on the Next button After Sold To
   And Upload Bulk File "" NPR ULT Upload
   And Click On Validate Button
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Clickon PO History check button
   When Click on Next After PO history check
   And Click Ok
   And Click On Credit price Validation
  # And Enter Credit price <25K
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Close browser
   
 @TestCaseQCCNo5
 @SanityQCC
 Scenario: Verify the Case creation for Service Type as Quality & Remedy as NPR-Credit & Return Reason as QAN/MRB using CPN Search
 
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Click On create button and select remedy NPR credit and select reason
   And Select All other details
   And Select Sold To Contact
   #And Select Sold To Contact second option
   And Select Ship To contact
   #And Select Ship To contact second Option
    And Click on next
    And click on Product radio button
    And Select CPN Radio button
    And Enter CPN Number through Excel
    And click on search button
    And Select All Line items with RM
    #And Select First Item
    And Click Next button after All Item selection
    And Enter ULTs from Excel
    When Click On Warranty Entitlement Check
    And Click on next
    And Enter MRB into All fields through Excel
    And Clickon PO History check button
    And Click Ok
    When Click on Next After PO history check
   And Click On Credit price Validation
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Print Case No into Console SR
   And Close browser
   
 @TestCaseQCCNo6
 @SanityQCC
 Scenario: Verify the Case creation for Service Type as Quality & Remedy as NPR-Credit & Return Reason as QAN/MRB using MM Search
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Click On create button and select remedy NPR credit and select reason
   And Select All other details
   And Select Ship To contact
   And Select Sold To Contact
   And Click on next 
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   And Select All Line items with RM
   And Click Next button after All Item selection
    And Enter ULTs from Excel
   When Click On Warranty Entitlement Check
   And Click on next
   And Enter MRB into All fields through Excel
   And Clickon PO History check button
   When Click on Next After PO history check
   And Click Ok
   And Click On Credit price Validation
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Print Case No into Console SR
   And Close browser
    
    
@TestCaseQCCNo7
@SanityQCC
 Scenario: Verify the Case creation for Service Type as Quality & Remedy as Credit & Return Reason as QAN/MRB using OPN Search
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
   And click on Product radio button
   And Click on Order Part Number radio button
    When Enter OPN into search box through excel
   And click on search button
   And Select All Line items with RM
   And Select First Item
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Clickon PO History check button
   When Click on Next After PO history check
   When Enter Quantity into All fields through excel
   #When Enter Return Quantity
   And Click On Credit price Validation
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Print Case No into Console SR
   
@TestCaseQCCNo8
@SanityQCC
 Scenario: Verify the Case creation for Service Type as Quality with ULT is mandatory(MM Id with ULT)
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
   And Click Next button after All Item selection
   And Enter ULTs from Excel
   When Click On Warranty Entitlement Check
   And Click on next
   And Enter MRB into All fields through Excel
   And Clickon PO History check button
   When Click on Next After PO history check
   #When Enter Quantity into All fields through excel
   And Click On Credit price Validation
   And Enter Credit price <25K
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Print Case No into Console SR
   
@TestCaseQCCNo9
@SanityQCC
 Scenario: Verify the Case creation for Service Type as Quality with ULT is not mandatory
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
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Enter MRB into All fields through Excel
   When Enter Quantity into All fields through excel
   And Clickon PO History check button
   When Click on Next After PO history check
   And Click On Credit price Validation
   And Enter Credit price <25K
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Print Case No into Console SR
  
@TestCaseQCCNo10
@SanityQCC
Scenario: Verify the PO Search functionality 
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select Remedy and reason
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
  And Select Purchase/Sales Order button and Enter PO Number Through Excel
   And Select Start Date and End Date
   Then Click on the search button
   
   
 @TestCaseQCCNo11
 Scenario: Verify the SO Search functionality
  And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select Remedy and reason
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Select Purchase/Sales Order button and Enter SO Number through Excel
   And Select Start Date and End Date
   Then Click on the search button


 @TestCaseQCCNo12
 @SanityQCC
 Scenario: Verify the CPN Search functionality
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select Remedy and reason
   And Select Ship To contact
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
   

@TestCaseQCCNo13
@SanityQCC
Scenario: Verify the MM Search functionality
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

@TestCaseQCCNo14
@SanityQCC
Scenario: Verify the OPN Search functionality

   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button
   And Enter SoldTo and select "6006683685" 
   And Select Remedy and reason
   And Select Ship To contact
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
   
@TestCaseQCCNo15
@SanityQCC
Scenario: Verify the MMCPN Bulk Upload functionality
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select Remedy and reason
   And Select Ship To contact
   And Select Sold To Contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Upload Bulk File """
   And Click On Validate Button
   And Close browser
   
  
@TestCaseQCCNo16
@SanityQCC
Scenario: Verify the ULT Bulk Upload functionality
  And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Click On create button and select remedy NPR credit and select reason
   And Select Ship To contact
   And Select Sold To Contact
   And Click on next
   #When User Click on Download ULT Template
   And Upload Bulk File "" ULT
   And Click On Validate Button
      And Close browser

@TestCaseQCCNo17
@SanityQCC
Scenario: Verify the PO History functionality
And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select Remedy and reason
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
   And Click Next button after All Item selection
   And Enter ULTs from Excel
   When Click On Warranty Entitlement Check
   And Click on next
   When Enter Quantity into All fields
   And Enter MRB into All fields through Excel
   And Clickon PO History check button
   When Click on Next After PO history check
      And Close browser


@TestCaseQCCNo18
@SanityQCC
Scenario: Verify the Warranty Entitlement Check functionality without ULT
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select Remedy and reason
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
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
      And Close browser
   
 @TestCaseQCCNo19
 @SanityQCC
   Scenario: Verify the Warranty Entitlement Check functionality with ULT
   
  And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select Remedy and reason
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
   And Click Next button after All Item selection
   And Enter ULTs from Excel
   When Click On Warranty Entitlement Check
   And Close browser
   
 
 @TestCaseQCCNo20
 @SanityQCC
 Scenario: Verify the Price Override functionality with <=25K 
   
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select Remedy and reason
   And Select Ship To contact
   And Select Sold To Contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number 
   #And Select All Line items with RM
   #When Select First Item
   When Select ALL
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   When Enter Quantity into All fields through excel
   And Enter MRB into All fields through Excel
   And Clickon PO History check button
   When Click on Next After PO history check
   And Click On Credit price Validation
   And Enter Credit price <25K
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Close browser
   

 @TestCaseQCCNo21
 @SanityQCC
 Scenario: Verify the Price Override functionality with >=25K 
   
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select Remedy and reason
   And Select Ship To contact
   And Select Sold To Contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number 
   #And Select All Line items with RM
   #When Select First Item
   When Select ALL
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   When Enter Quantity into All fields through excel
   And Enter MRB into All fields through Excel
   And Clickon PO History check button
   When Click on Next After PO history check
   And Click On Credit price Validation
   And Enter Credit price >25K
   And Click on the Save and Summary button
   And Click on submit button After Summary
   When User Slect L3 Agent Selection
   And Click on Select Button
    And Print Case No into Console SR
   And Close browser
   
   
 
 @TestCaseQCCNo22
 @SanityQCC
 Scenario: Verify the Pending Approval Case creation with >=100K 
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select Remedy and reason
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number 
   When Select ALL
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   When Enter Quantity into All fields through excel
    And Enter MRB into All fields through Excel
   And Clickon PO History check button
   When Click on Next After PO history check
   And Click On Credit price Validation
   And Enter Credit price <100K
   And Click on the Save and Summary button
   And Click on submit button After Summary
   When User Slect L3 Agent Selection
   And Click on Select Button
   And Close browser





  