Feature: Case Creation Workflow for Technical Service Type with Credit Remedy and Specific Return Reason Using PO Search use

@TestCaseTCCNo1q
@SanityTCC
Scenario: Verify the Case creation for Service Type as Technical & Remedy as Credit & Return Reason as Failed at Customer Factory Site using PO Search
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select Remedy credit and reason Fail Customer End
    And Select All other details
    And Select Ship To contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
    And Select Purchase/Sales Order button and Enter PO Number Through Excel
    Then Click on the search button
    And Select All Line items
    And Click on the Next button after All Line Items
    When Enter ULT IDs
    When Click On Warranty Entitlement Check
     And Click on PO Change popup Ok button
    And Click on next
    And Clickon PO History check button
    And Click on PO Change popup Ok button
    When Click on Next After PO history check
   When Enter Quantity into All fields through excel
   And Click On Credit price Validation
   When Select ALL
   #And Select All Line items check box
   #And Select First Check box
   And Enter Credit price All fields
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Check RMA status
    And Print Case No into Console SR
    And Close browser
    
    
@ScenarioNo
@Regression-P1
Scenario: Verify the Case creation for Service Type as Technical & Remedy as Credit & Return Reason as Failed at Customer Factory Site using PO Search
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold To "83685"
   And Select Remedy credit and reason Fail Customer End 
   And Select All other details
   And Select Ship To contact
  And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
   And Select Purchase/Sales Order button and Enter PO Number "4511704998"
   Then Click on the search button
    And Select All Line items
    And Click on the Next button after All Line Items
    And Enter ProductUniqueID "ULT_Tech_"
    When Click On Warranty Entitlement Check 
    And Click on next
    And Clickon PO History check button
   # And Click on PO Change popup Ok button
    When Click on Next After PO history check
    And Click On Credit price Validation
    And Select All Line items check box
    #And Select First Check box
    And Enter Credit price All fields
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Check RMA status
    And Print Case No into Console SR
    And Close browser
    
    
    
 @TestCaseTCCNo1.1 
 @SanityTCC
  Scenario: Verify the Case creation for Service Type as Technical & Remedy as Credit & Return Reason as Failed at Customer Factory Site using PO Search
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click on Create buttons and Enter Sold To "83685"
    And Select Remedy credit and reason Fail Customer End
    And Select All other details
    And Select Ship To contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
   When select Collection Contact first
    And Click on next
    And Select Purchase/Sales Order button and Enter PO Number "4511704998"
    Then Click on the search button
    And Select All Line items
    And Click on the Next button after All Line Items
    And Enter ProductUniqueID "ULT_Tech_"
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    And Click on PO Change popup Ok button
    When Click on Next After PO history check
    And Click On Credit price Validation
    And Select All Line items check box
    #And Select First Check box
    And Enter Credit price All fields
    And Click on the Save and Summary button
    And Click on submit button After Summary
    #And Check RMA status
    And Print Case No into Console SR
    And Close browser
    

  @TestCaseTCCNo2
   @SanityTCC
  Scenario: Verify the Case creation for Service Type as Technical & Remedy as Credit & Return Reason as Failed at End Customer using SO Search
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
   # And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
   # And Select Service Type Technical and Click on Create buttons and Enter Sold To "83685"
    And Select Remedy credit and reason Fail Customer End
    And Select Ship To contact
    And Select RCA CMF Type address
    And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first   
    And Click on next
    And Select Purchase/Sales Order button and Enter SO Number through Excel
   # And Select Purchase/Sales Order button and Enter SO Number "0019141969"
    Then Click on the search button
    And Select All Line items
    And Click on the Next button after All Line Items
    When Enter ULT IDs
  #  And Enter ProductUniqueID "ULT_TECH"
    When Click On Warranty Entitlement Check
    And Click on PO Change popup Ok button
    And Click on next
    And Clickon PO History check button
    And Click on PO Change popup Ok button
    When Click on Next After PO history check
    And Click On Credit price Validation
   And Enter Credit price
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Check RMA status
    And Print Case No into Console SR
    And Close browser
    
    @TestCaseTCCNo2.1
   @SanityTCC
  Scenario: Verify the Case creation for Service Type as Technical & Remedy as Credit & Return Reason as Failed at End Customer using SO Search
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click on Create buttons and Enter Sold To "83685"
    And Select Remedy credit and reason Fail Customer End
    And Select Ship To contact
    And Select RCA CMF Type address
    And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first   
    And Click on next
    And Select Purchase/Sales Order button and Enter SO Number "0019141969"
    Then Click on the search button
    And Select All Line items
    And Click on the Next button after All Line Items
    And Enter ProductUniqueID "ULT_TECH"
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    And Click On Credit price Validation
    And Enter Credit price
    And Click on the Save and Summary button
    And Click on submit button After Summary
    #And Check RMA status
    And Print Case No into Console SR
    And Close browser
    
    @ScenarioNo-MMSearch
  Scenario: Create Case with help of MM IDs
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
  #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select Remedy credit and reason Fail Customer End
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
    # When Enter ULT IDs
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
     When Enter Quantity into All fields through excel
    And Click On Credit price Validation
     And Enter Credit price
     And Click on the Save and Summary button
    And Click on submit button After Summary
    And Print Case No into Console SR
    And Close browser
    
    

  @TestCaseTCCNo3
  @SanityTCC
  Scenario: Verify the SO Search functionality
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select Remedy credit and reason
    And Select Ship To contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
    And Select Purchase/Sales Order button and Enter SO Number through Excel
    Then Click on the search button
    And Close browser

  @TestCaseTCCNo4
  @SanityTCC
  Scenario: Verify the PO Search functionality
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
   #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    #And Select Service Type Technical and Click on Create buttons and Enter Sold To "83685"
    And Select Remedy credit and reason
    And Select Ship To contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
    And Select Purchase/Sales Order button and Enter PO Number Through Excel
    #And Select Purchase/Sales Order button and Enter PO Number "4511274812"
    Then Click on the search button
    And Close browser

  @TestCaseTCCNo5
  @SanityTCC
  Scenario: Verify the MM Search functionality
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select Remedy credit and reason Fail Customer End
    And Select Ship To contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
    And Enter MMIDs By using Excel Sheet
    And Click on search button after Entering MM Number
    And Close browser

  @TestCaseTCCNo6
  @SanityTCC
  Scenario: Verify the CPN Search functionality
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select Remedy credit and reason Fail Customer End
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

  @TestCaseTCCNo7
  @SanityTCC
  Scenario: Verify the OPN Search functionality
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click on Create buttons and Enter Sold To "83685"
    And Select Remedy credit and reason Fail Customer End
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

  @TestCaseTCCNo8
  @SanityTCC
  Scenario: Verify the MMCPN Bulk Upload functionality
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select Remedy credit and reason Tech Simple
    And Select Ship To contact
    And Select RCA address
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
    And Upload Bulk File Technical MMCPN Bulk Upload ""
    And Click On Validate Button
   # And Close browser
   And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    #And Select All Line items with RM
    When Select ALL
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    And Click On Credit price Validation
    And Enter Credit price All fields
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Print Case No into Console SR
    
    
@TestCaseTCCNo8.1
  @SanityTCC
  Scenario: Save Later With Bulk upload
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select Remedy credit and reason Tech Simple
    And Select Ship To contact
    And Select RCA address
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
    And Upload Bulk File Technical MMCPN Bulk Upload ""
    And Click On Validate Button
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    #And Select All Line items with RM
    When Select ALL
   When Click On Warranty Entitlement Check
   When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR

  @TestCaseTCCNo9
  @SanityTCC
  Scenario: Verify the PO History functionality
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select Remedy credit and reason Tech Simple
    And Select Ship To contact
    And Select RCA address
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
    And Enter MMIDs By using Excel Sheet
    #When Clickon Product radiobutton and enter MM Number "99C6A3"
    And Click on search button after Entering MM Number
    When Select ALL      
    #And Select All Line items with RM
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    And Close browser
    
  @TestCaseTCCNo10
   @SanityTCC
  Scenario: Verify the Price Override functionality with >=25K
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select Remedy credit
    And Select Ship To contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
    And Enter MMIDs By using Excel Sheet
    And Click on search button after Entering MM Number
    #And Select All Line items with RM
    #And Select First Item
    When Select ALL
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    When Enter Quantity into All fields through excel
    #When Enter Return Quantity
    And Click On Credit price Validation
    And Enter Credit price >25K
    And Click on the Save and Summary button
    And Click on submit button After Summary
    #And Check RMA status
    When User Slect L3 Agent Selection
    And Click on Select Button
    And Print Case No into Console SR
    And Close browser

  @TestCaseTCCNo11
  @SanityTCC
  Scenario: Verify the Price Override functionality with <=25K Tech
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select Remedy credit
    And Select Ship To contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
    And Enter MMIDs By using Excel Sheet
    And Click on search button after Entering MM Number
    #And Select All Line items with RM
    #And Select First Item
    When Select ALL
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    When Enter Quantity into All fields through excel
    #When Enter Return Quantity
    And Click On Credit price Validation
    And Enter Credit price <25K
    And Click on the Save and Summary button
    And Click on submit button After Summary
    # And Check RMA status
    And Print Case No into Console SR
    And Close browser

  @TestCaseTCCNo12
  @SanityTCC
  Scenario: Verify the Price Override functionality with >=100K Tech
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select Remedy credit
    And Select Ship To contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
    And Enter MMIDs By using Excel Sheet
    And Click on search button after Entering MM Number
    #And Select All Line items with RM
    #And Select First Item
     When Select ALL
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    When Enter Quantity into All fields through excel
    #When Enter Return Quantity
    And Click On Credit price Validation
    And Enter Credit price <100K
    And Click on the Save and Summary button
    And Click on submit button After Summary
    When User Slect L3 Agent Selection
    And Click on Select Button
    And Print Case No into Console SR
    And Close browser

  @TestCaseTCCNo13
  @SanityTCC
  Scenario: Verify the Case creation for Service Type as Technical & Remedy as NPR-Credit & Return Reason as Failed at Customer Factory Site using ULT Bulk Upload
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select All other details
    And Select Ship To contact
    And Select Sold To Contact
    And Click on the Next button After Sold To
    And Upload Bulk File "" NPR-Credit
    And Click On Validate Button
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    And Click On Credit price Validation
    # And Enter Credit price <100K
    And Click on the Save and Summary button
    And Click on submit button After Summary
    When User Slect L3 Agent Selection
    And Click on Select Button
    And Print Case No into Console SR
    And Close browser

  @TestCaseTCCNo14
  @SanityTCC
  Scenario: Verify the Case creation for Service Type as Technical & Remedy as NPR-Credit & Return Reason as Failed at End Customer using CPN Search
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select All other details
    And Select Ship To contact
    And Select Sold To Contact
    And Click on the Next button After Sold To
    And click on Product radio button
    And Select CPN Radio button
     And Enter CPN Number through Excel
    #When Enter CPN Numbervalue "4244594"
    And click on search button
    And Select All Line items with RM
    #And Select First Item
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    When Enter Quantity into All fields through excel
    And Click On Credit price Validation
    And Enter Credit price <25K
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Print Case No into Console SR
    And Close browser
    
    
  @TestCaseTCCNo15
  @SanityTCC
  Scenario: Verify the Case creation for Service Type as Technical & Remedy as NPR-Credit & Return Reason as Failed at End Customer using CPN Search without Price
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
     And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select All other details
    And Select Ship To contact
    And Select Sold To Contact
    And Click on the Next button After Sold To
    And click on Product radio button
    And Select CPN Radio button
     And Enter CPN Number through Excel
    #When Enter CPN Numbervalue "4244594"
    And click on search button
    And Select All Line items with RM
    #And Select First Item
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    When Enter Quantity into All fields through excel
    And Click On Credit price Validation
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Print Case No into Console SR
    And Close browser

@TestCaseTCCNo16
@SanityTCC
  Scenario: Verify the Case creation for Service Type as Technical & Remedy as NPR-Credit & Return Reason as Warranty Service/Software using MM Search
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select All other details
    And Select Ship To contact
    And Select Sold To Contact
    And Click on the Next button After Sold To
    And Enter MMIDs By using Excel Sheet
    #When Clickon Product radiobutton and enter MM Number "99APD4"
    And Click on search button after Entering MM Number
    And Select All Line items with RM
    #And Select First Item
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    When Enter Quantity into All fields through excel
    And Click On Credit price Validation
     And Enter Credit price <25K
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Close browser

  @TestCaseTCCNo17
  @SanityTCC
  Scenario: Verify the Case creation for Service Type as Technical & Remedy as NPR-Credit & Return Reason as Sample using OPN Search
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Click on the Next button After Sold To
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
    And Close browser

@TestCaseTCCNo18
  @SanityTCC
  Scenario: Verify the Case creation for Service Type as Technical with ULT is not mandatory
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select Remedy credit
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
    And Enter MMIDs By using Excel Sheet
    And Click on search button after Entering MM Number
    And Select All Line items with RM
    #And Select First Item
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    When Enter Quantity into All fields through excel
    And Click On Credit price Validation
    And Enter Credit price <25K
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Print Case No into Console SR
    And Close browser



  @TestCaseTCCNo19
  @SanityTCC
  Scenario: Verify the Case creation for Service Type as Technical with ULT is not mandatory
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select Remedy credit
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
    And Enter MMIDs By using Excel Sheet
    And Click on search button after Entering MM Number
    #And Select All Line items with RM
    #And Select First Item
    And Click Next button after All Item selection
    When Enter ULT IDs
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    When Enter Quantity into All fields through excel
    And Click On Credit price Validation
    And Enter Credit price <25K
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Print Case No into Console SR
    And Close browser

  @TestCaseTCCNo20
  @SanityTCC
  Scenario: Verify the Warranty Entitlement Check functionality with ULT
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select Remedy credit
    And Select Ship To contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
    And Enter MMIDs By using Excel Sheet
    And Click on search button after Entering MM Number
    And Select All Line items with RM
    And Click Next button after All Item selection
   # When Enter ULT IDs
    #And Enter ULT Number "BQKY12501810"
    When Click On Warranty Entitlement Check
    And Close browser

  @TestCaseTCCNo21
  @SanityTCC
  Scenario: Verify the Warranty Entitlement Check functionality without ULT
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click on Create buttons only
    And Select Remedy credit and reason Fail Customer End
    And Select Ship To contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
    When Clickon Product radiobutton and enter MM Number "99APD4"
    And Click on search button after Entering MM Number
    And Select All Line items with RM
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Close browser

  @TestCaseTCCNo22
  @SanityTCC
  Scenario: Verify the ULT Bulk Upload functionality
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click on Create buttons and Enter Sold To "83685"
    And Select Remedy credit
    And Select Ship To contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
    When User Click on Download ULT Template
    When Upload ULT Bulk File ""
    And Click On Validate Button
    And Close browser
    
  @TestCaseTCCNo23
  @SanityTCC
  Scenario: Create case the ULT Bulk Upload functionality
   Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select Remedy credit
    And Select Ship To contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
   # When User Click on Download ULT Template
    When Upload ULT Bulk File "" Technical
    And Click On Validate Button
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Select All Line items with RM
    When Select ALL
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    And Click On Credit price Validation
   And Enter Credit price All fields
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Print Case No into Console SR
    And Close browser
    
  @TestCaseTCCNo24
  @SanityTCC
  Scenario: Verify the Case creation for Service Type as Technical & Remedy as Credit & Return Reason as Technical Sample using MMCPN Bulk Upload
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click on Create buttons and Enter Sold To "83685"
    And Select Remedy credit
    And Select Ship To contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
   # And Upload Bulk File "C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1).csv""
    And Upload Bulk File Technical "C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1).csv""
    And Click On Validate Button
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    And Click On Credit price Validation
    And Enter Credit price <25K
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Print Case No into Console SR
    And Close browser

  @TestCaseTCCNo25
  @SanityTCC
  Scenario: Verify the ULT Bulk Upload functionality
   Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select Remedy credit
    And Select Ship To contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
   # When User Click on Download ULT Template
    When Upload ULT Bulk File "" Technical
    And Click On Validate Button
    And Close browser

  @ScenarioNo26
  @SanityTCC
  Scenario: Verify the Case creation for Service Type as Technical & Remedy as Credit & Return Reason as Failed at Customer Factory Site using PO Search
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical and Click on Create buttons and Enter Sold To "83685"
    And Select Ship To contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    And Click on next
    And Select Purchase/Sales Order button and Enter PO Number "4511732714"
    Then Click on the search button
    And Select All Line items with RM
    And Select First Item
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    And Click on PO Change popup Ok button
    When Click on Next After PO history check
    When Enter Return Quantity >=100K
    And Select All Line items with RM
    And Select First Item
    And Click On Credit price Validation
    # And Select All Line items check box
    # And Select First Check box
    And Enter Credit price
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Print Case No into Console SR
    And Close browser
