Feature: Case Creation Workflow for Quality
Background:
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
@TestCaseNo-1

Scenario: Verify the Case creation for Service Type as Quality & Remedy as Credit & Return Reason as QAN/MRB using PO Search 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button
   And Enter SoldTo and select "6006683685" 
   And Select Remedy and reason
   And Select All other detils
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Select Purchase/Sales Order button and Enter PO Number "4512168242"
   And Select Start Date and End Date
   Then Click on the search button
   And Select All Line items
   And Click on the Next button after All Line Items
   When Enter Quantity into All fields
    When Click On Warranty Entitlement Check
    And Click on next
    And Enter MRB into All fields "MRB_99AFTV"
    And Clickon PO History check button
    And Click on next
    And Click On Credit price Validation
   # And Enter Credit price <100K
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Check RMA status
    And Print Case No into Console
  
 @TestCaseNo2
 Scenario: Verify the Case creation for Service Type as Quality & Remedy as Credit & Return Reason as QAN/MRB using SO Search 
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
   And Select Purchase/Sales Order button and Enter SO Number "0019141969"
   And Select Start Date and End Date
   Then Click on the search button
   And Select All Line items
   And Click on the Next button after All Line Items
   When Enter Quantity into All fields
    When Click On Warranty Entitlement Check
    And Click on next
    And Enter MRB into All fields "MRB_99C3X9"
    And Clickon PO History check button
    And Click on next
    And Click On Credit price Validation
    And Enter Credit price <25K
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Check RMA status
   And Print Case No into Console
     
@TestCaseNo3
 Scenario: Verify the Case creation for Service Type as Quality & Remedy as Credit & Return Reason as QAN/MRB using MMCPN Bulk Upload 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button
   And Enter SoldTo and select "6006683685" 
   And Select Remedy and reason
   And Select Ship To contact
   And Select Sold To Contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Upload Bulk File "C:\\Users\\oyadavx\\OneDrive - Intel Corporation\Desktop\\ULT Bulk Upload Sheet\\MMCPNQuality.csv" quality MMCPN
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
    And Print Case No into Console
   
 @TestCaseNo4
 Scenario: Verify the Case creation for Service Type as Quality & Remedy as NPR-Credit & Return Reason as QAN/MRB using ULT Bulk Upload
   And Enter text global and select "Amy Adamo"
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button
   And Enter SoldTo and select "0000024100" 
   And Click On create button and select remedy NPR credit and select reason
   And Select All other detils
   #And Select Sold To Contact
   And Select Sold To Contact second option
   And Select Ship To contact
   #And Select Ship To contact second Option
   And Click on the Next button After Sold To
   And Upload Bulk File "Path" NPR ULT Upload
   And Click On Validate Button
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Clickon PO History check button
   When Click on Next After PO history check
   And Click On Credit price Validation
  # And Enter Credit price <25K
   And Click on submit button After Summary
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Close browser
   
 @TestCaseNo5
 Scenario: Verify the Case creation for Service Type as Quality & Remedy as NPR-Credit & Return Reason as QAN/MRB using CPN Search
   And Enter text global and select "Amy Adamo"
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button
   And Enter SoldTo and select "0000024100" 
   And Click On create button and select remedy NPR credit and select reason
   And Select All other detils
   #And Select Sold To Contact
   And Select Sold To Contact second option
   And Select Ship To contact
   #And Select Ship To contact second Option
   And Click on the Next button After Sold To
   And click on Product radio button
    And Select CPN Radio button
    When Enter CPN Numbervalue "2U4782" 
    And click on search button 
    And Select All Line items with RM
    And Select First Item
    And Click Next button after All Item selection
    And Enter ULT Number "BTCC6520001J"  
    When Click On Warranty Entitlement Check
    And Click on next
    And Enter MRB into All fields "MRB_Test"
    And Clickon PO History check button
    When Click on Next After PO history check
   And Click On Credit price Validation
   And Click on submit button After Summary
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Print Case No into Console SR
   And Close browser
   
 @TestCaseNo6
 Scenario: Verify the Case creation for Service Type as Quality & Remedy as NPR-Credit & Return Reason as QAN/MRB using MM Search
   And Enter text global and select "Amy Adamo"
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button
   And Enter SoldTo and select "0000024100" 
   And Click On create button and select remedy NPR credit and select reason
   And Select All other detils
   And Select Ship To contact
   And Select Sold To Contact
   And Click on next 
   When Clickon Product radiobutton and enter MM Number "944721"
   And Click on search button after Entering MM Number 
   And Select All Line items with RM
   And Click Next button after All Item selection
    And Enter ULT Number "BTCC6520001J"  
   When Click On Warranty Entitlement Check
   And Click on next
   And Enter MRB into All fields "MRB_Test"
   And Clickon PO History check button
   When Click on Next After PO history check
   And Click On Credit price Validation
   And Click on submit button After Summary
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Print Case No into Console SR
   And Close browser
    
    
@TestCaseNo7
 Scenario: Verify the Case creation for Service Type as Quality & Remedy as Credit & Return Reason as QAN/MRB using OPN Search
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button
   And Enter SoldTo and select "6006683685" 
   And Select Remedy and reason
   And Select All other detils
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
   And Select All Line items with RM
   And Select First Item
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Clickon PO History check button
   When Click on Next After PO history check
   When Enter Return Quantity
   And Click On Credit price Validation
   And Click on the Save and Summary button
   And Click on submit button After Summary
   
@TestCaseNo8
 Scenario: Verify the Case creation for Service Type as Quality with ULT is mandatory
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button
   And Enter SoldTo and select "6006683685" 
   And Select Remedy and reason
   And Select All other detils
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99C6A3"
   And Click on search button after Entering MM Number
   And Select All Line items with RM
   And Click Next button after All Item selection
   And Enter ULT Number "G6AY123002WE" 
   When Click On Warranty Entitlement Check
   And Click on next
   And Clickon PO History check button
   When Click on Next After PO history check
   When Enter Return Quantity
   And Click On Credit price Validation
   And Enter Credit price <25K
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Print Case No into Console SR
   
@TestCaseNo9
 Scenario: Verify the Case creation for Service Type as Quality with ULT is not mandatory
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button
   And Enter SoldTo and select "6006683685" 
   And Select Remedy and reason
   And Select All other detils
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99C6A3"
   And Click on search button after Entering MM Number
   And Select All Line items with RM
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Enter MRB into All fields "MRB_99C6A3"
   When Enter Return Quantity
   And Clickon PO History check button
   When Click on Next After PO history check
   And Click On Credit price Validation
   And Enter Credit price <25K
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Print Case No into Console SR
  
@TestCaseNo-12
Scenario: Verify the PO Search functionality 
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
   And Select Purchase/Sales Order button and Enter PO Number "4512168242"
   And Select Start Date and End Date
   Then Click on the search button
   
   
 @TestCaseNo13
 Scenario: Verify the SO Search functionality
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
   And Select Purchase/Sales Order button and Enter SO Number "0019141969"
   And Select Start Date and End Date
   Then Click on the search button


 @TestCaseNo15
 Scenario: Verify the CPN Search functionality
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
   And Select CPN Radio button
   When Enter CPN number "46303268"
   And click on search button 
   And Close browser
   

@TestCaseNo14
Scenario: Verify the MM Search functionality
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
   When Clickon Product radiobutton and enter MM Number "99C6A3"
   And Click on search button after Entering MM Number

@TestCaseNo16
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
   
@TestCaseNo17
Scenario: Verify the MMCPN Bulk Upload functionality
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button
   And Enter SoldTo and select "83685" 
   And Select Remedy and reason
   And Select Ship To contact
   And Select Sold To Contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Upload Bulk File "C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1).csv""
   And Click On Validate Button
   And Close browser
   
 
@TestCaseNo18
Scenario: Verify the ULT Bulk Upload functionality
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button
   And Enter SoldTo and select "83685" 
   And Click On create button and select remedy NPR credit and select reason
   And Select Ship To contact
   And Select Sold To Contact
   And Click on next
   #When User Click on Download ULT Template
   And Upload Bulk File "C:\\Users\\oyadavx\\OneDrive - Intel Corporation\\Desktop\\ULT Bulk Upload Sheet\\ULT_BulkUpload.csv" ULT
   And Click On Validate Button


@TestCaseNo19
Scenario: Verify the PO History functionality
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button
   And Enter SoldTo and select "6006683685" 
   And Select Remedy and reason
   And Select Ship To contact
   And Select Sold To Contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99C6A3"
   And Click on search button after Entering MM Number 
   And Select All Line items with RM
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
    When Enter Quantity into All fields
   And Enter MRB into All fields "MRB_99C6A3"
   And Clickon PO History check button
   When Click on Next After PO history check


@TestCaseNo20
Scenario: Verify the Warranty Entitlement Check functionality without ULT
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button
   And Enter SoldTo and select "6006683685" 
   And Select Remedy and reason
   And Select Ship To contact
   And Select Sold To Contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99C6A3"
   And Click on search button after Entering MM Number 
   And Select All Line items with RM
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   
 @TestCaseNo21
   Scenario: Verify the Warranty Entitlement Check functionality with ULT
   
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button
   And Enter SoldTo and select "83685" 
   And Select Remedy and reason
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99A7AH"
   And Click on search button after Entering MM Number 
   And Select All Line items with RM
   And Click Next button after All Item selection
   And Enter ULT Number "BTTN22900LW9"  
   When Click On Warranty Entitlement Check
   And Click on next
   
 
 @TestCaseNo22<=25
 Scenario: Verify the Price Override functionality with <=25K 
   
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
   When Clickon Product radiobutton and enter MM Number "99C6A3"
   And Click on search button after Entering MM Number 
   And Select All Line items with RM
   And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
   And Click on next
   When Enter Quantity into All fields
   And Enter MRB into All fields "MRB_99C6A3"
   And Clickon PO History check button
   When Click on Next After PO history check
   And Click On Credit price Validation
   And Enter Credit price <25K
   And Click on submit button After Summary
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Close browser
   

 @TestCaseNo23>=25
 Scenario: Verify the Price Override functionality with >=25K 
   
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
   When Clickon Product radiobutton and enter MM Number "99C6A3"
   And Click on search button after Entering MM Number 
   And Select All Line items with RM
   And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
   And Click on next
   When Enter Quantity into All fields
   And Enter MRB into All fields "MRB_99C6A3"
   And Clickon PO History check button
   When Click on Next After PO history check
   And Click On Credit price Validation
   And Enter Credit price >25K
   And Click on the Save and Summary button
   And Click on submit button After Summary
   When User Slect L3 Agent Selection
   And Click on Select Button
   And Close browser
   
   
 
 @TestCaseNo24>=100
 Scenario: Verify the Pending Approval Case creation with >=100K 
  
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
   When Clickon Product radiobutton and enter MM Number "99C6A3"
   And Click on search button after Entering MM Number 
   And Select All Line items with RM
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
    When Enter Quantity into All fields
   And Enter MRB into All fields "MRB_99C6A3"
   And Clickon PO History check button
   When Click on Next After PO history check
   And Click On Credit price Validation
   And Enter Credit price <100K
   And Click on the Save and Summary button
   And Click on submit button After Summary
   When User Slect L3 Agent Selection
   And Click on Select Button
   And Close browser





  