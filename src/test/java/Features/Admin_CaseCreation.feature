Feature: Admin Case Creation
#Background:
   #Given User Launch Chrome browser
   #When User open URL 
   #Then User Enter Email Address and pass PassWord
   #And Click on login

@TestCaseACCNo1
@SanityACC
 Scenario: Verify the Case creation for Service Type as Admin & Return Reason as Incorrect Labeling with Freight type as CRF using PO Search
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   #Then I log the execution history with my details
   #And Enter text global and select "Zack McCoy"
   #And Enter text global "<ContactName>"
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Admin and Click create button enter Sold through Excel file
   #And Enter SoldTo and select "0000015724" 
   #And Enter SoldTo and select "15724"
   And Select All other details
   And Select Ship To contact
   And Select credit
   #And Select Return Reson duplicate order
   #And Enter CIRS "CI7578-8643"
   And Select Return Reson Incorrect labeling
    And Enter CIRS Through Excel
   #And Select Return Reson mixed product
   #And Select Return overship
  #And Select Return Reson dsample
   #And Select Return shortship
   #And Select Return Reson Wrong Dest
   #And Select Return Reson wrong product
   #When Select RCA address
   When Select RCA CMF Type address for QA
  # And Select RCA address first
   #And Select Fright Type IMF
   And Select Fright Type CMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
 #And Select Purchase/Sales Order button and Enter PO Number "TEST AZ15"
   And Select Purchase/Sales Order button and Enter PO Number Through Excel
   Then Click on the search button
   When Select ALL
   #And Select All Line items
   #And Select First Item
    And Click on the Next button after All Line Items
   When Enter Return Quantity
   And Click on the Get credit price button 
   And Click on the Save and Summary button
    And Click on submit button After Summary
    And Print Case No into Console SR
    And Close browser
    
 @TestCaseACCNo2
 @SanityACC
 Scenario: Verify the Case creation for Admin & Return Reason as Mixed Product with Freight type as IMF using SO Search
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   #Then I log the execution history with my details
   #And Enter text global and select "Zack McCoy"
   #And Enter text global "<ContactName>"
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Admin and Click create button enter Sold through Excel file
   #And Enter SoldTo and select "0000015724" 
   #And Enter SoldTo and select "15724"
   And Select All other details
   And Select Ship To contact
   And Select credit
   #And Select Return Reson duplicate order
   And Select Return Reson mixed product
   #And Enter CIRS "CI7578-8643"
   And Enter CIRS Through Excel
   #And Select Return Reson Incorrect labeling
   #And Select Return overship
  # And Select Return Reson dsample
   #And Select Return shortship
   #And Select Return Reson Wrong Dest
   #And Select Return Reson wrong product
   When Select RCA CMF Type address for QA
 #  And Select RCA address first
   And Select Fright Type IMF
   #And Select Fright Type CMF
   And Select Return customer contact first
  And Select CA Address first
  When select Collection Contact first
   And Click on next
   #And Select Purchase/Sales Order button and Enter SO Number "0019151855"
   And Select Purchase/Sales Order button and Enter SO Number through Excel
   Then Click on the search button
   #When Select ALL
  And Select All Line items
   And Click on the Next button after All Line Items
   When Enter Return Quantity
   And Click on the Get credit price button
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Print Case No into Console SR
    #And Close browser
    
  @TestCaseACCNo3
  @SanityACC
 Scenario: Verify the Case creation for Admin & Return Reason as Duplicate order  with Freight type as CRF using MM Search
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Admin and Click create button enter Sold through Excel file
   And Select Ship To contact
   And Select credit
   And Select Return Reson duplicate order
  # And Enter CIRS "CI7578-8643"
   And Enter CIRS Through Excel
   When Select RCA CMF Type address for QA
  # And Select RCA address first
   And Select Fright Type IMF
   And Select Return customer contact first
  # And Select CA Address first
  # When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   And Select All Line items with RM
  # And Click Next button after All Item selection
   And Clickon PO History
  #When Click on Next After PO history check
 #When Enter Return Quantity
  When Enter Quantity into All fields
 # And Click on the Get credit price
  And Click on the Get credit price button
   And Enter Credit price
   And Enter Credit price Zero
   # And Click on the Next button After credit Price
  # And Click on the Get credit price button
    And Click on the Save and Summary button
    And Click on submit button After Summary
  #And Print Case No into Console SR
    And Close browser
    
    
@TestCaseACCNo4
@SanityACC
 Scenario: Verify the Case creation for Admin & Return Reason as Overship with Freight type as IMF using Bulk Upload
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Admin and Click create button enter Sold through Excel file
   And Select Ship To contact
   And Select credit
   And Select Return overship
   #And Enter CIRS "CI7578-8643"
   And Enter CIRS Through Excel
   When Select RCA CMF Type address for QA
   #And Select RCA address first
   And Select Fright Type IMF
   And Select Return customer contact first
  And Select CA Address first
  When select Collection Contact first
   And Click on next
   And Upload Bulk File With MM IDS "Path"
   And Click On Validate Button
   And Clickon PO History
   And Click on the Get credit price button
 And Click on the Save and Summary button
 And Click on submit button After Summary
 And Close browser
 
   
   
   
 @TestCaseACCNo5
 @SanityACC
 Scenario: Verify the Case creation for Admin & Return Reason as Shortship with Freight type as IMF using CPN Search
 Given User Launch Chrome browser
 When User open URL 
 Then User Enter Email Address and pass PassWord
 And Click on login
 And Enter text global excel
 And Click on the New R4C case creation button
 And Select Service Type Admin and Click create button enter Sold through Excel file
 And Select Ship To contact
 And Select credit
 And Select Return shortship
 And Enter CIRS Through Excel
# And Select RCA address first
 When Select RCA CMF Type address for QA
 And Select Fright Type IMF
 And Select Return customer contact first
 And Click on next
 And click on Product radio button
 And Select CPN Radio button
 And Enter CPN Number through Excel
 And click on search button
 And Select All Line items
 And Clickon PO History  
 When Enter Quantity into All fields
 And Click on the Get credit price button
 And Click on the Save and Summary button
 And Click on submit button After Summary
 And Print Case No into Console SR
 
 @TestCaseACCNo6
 @SanityACC
 Scenario: Verify the Case creation for Admin & Return Reason as Wrong Product with Freight type as IMF using MM Search (credit price 0)
 Given User Launch Chrome browser
 When User open URL 
 Then User Enter Email Address and pass PassWord
 And Click on login
 And Enter text global excel
 And Click on the New R4C case creation button
 And Select Service Type Admin and Click create button enter Sold through Excel file
 And Select Ship To contact
 And Select credit
 And Select Return Reson wrong product
 And Enter CIRS Through Excel
  When Select RCA CMF Type address for QA
 #And Select RCA address first
 And Select Fright Type IMF
 And Select Return customer contact first
 And Select CA Address first
 When select Collection Contact first
 And Click on next
 And Enter MMIDs By using Excel Sheet
And Click on search button after Entering MM Number
And Select All Line items with RM
And Clickon PO History
When Enter Quantity into All fields
And Click on the Get credit price button
#And Enter Credit price
And Enter Credit price Zero
And Click on the Save and Summary button
And Click on submit button After Summary
And Print Case No into Console SR


 @TestCaseACCNo7
 @SanityACC
Scenario: Verify the Case creation for Admin & Return Reason as Wrong Ship date with Freight type as CRF using Bulk Upload
Given User Launch Chrome browser
When User open URL 
Then User Enter Email Address and pass PassWord
And Click on login
And Enter text global excel
And Click on the New R4C case creation button
And Select Service Type Admin and Click create button enter Sold through Excel file
And Select Ship To contact
And Select credit
And Select Wrong Ship Date
And Enter CIRS Through Excel
When Select RCA CMF Type address for QA
#And Select RCA address first
And Select Fright Type CMF
And Select Return customer contact first
And Click on next
And Upload Bulk File With MM IDS "Path"
And Click On Validate Button
And Clickon PO History
#When Enter Return Quantity
And Click on the Get credit price button
And Click on the Save and Summary button
And Click on submit button After Summary
#And Print Case No into Console SR


@TestCaseACCNo8
@SanityACC
 Scenario: Verify the Case creation for Admin & Return Reason as Lost Shipment with Freight type as IMF using PO Search (credit price 0)
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Admin and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Lost Shipment
   And Enter CIRS Through Excel
    When Select RCA CMF Type address for QA
  # And Select RCA address first
   And Select Fright Type IMF
  And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Select Purchase/Sales Order button and Enter PO Number Through Excel
   Then Click on the search button
   And Select All Line items
   And Click on the Next button after All Line Items
   When Enter Return Quantity
   And Click on the Get credit price button 
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Print Case No into Console SR
   And Close browser
    
    
@TestCaseACCNo9
@SanityACC
Scenario: Verify the Case creation for Admin & Return Reason as Damage in transit with Freight type as CRF using SO Search
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Admin and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Damage In Transit
   And Enter CIRS Through Excel
   When Select RCA CMF Type address for QA
   #And Select RCA address first
   And Select Fright Type CMF
   And Select Return customer contact first
   And Click on next
   And Select Purchase/Sales Order button and Enter SO Number through Excel
   Then Click on the search button
   And Select All Line items
   And Click on the Next button after All Line Items
   When Enter Return Quantity
   And Click on the Get credit price button
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Print Case No into Console SR
   And Close browser
   
   @TestCaseACCNo10
  @ACCTest
 Scenario: Verify the Open Unsubmitted status Case Edit for Admin with Freight type as CRF
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Admin and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Return Reson Incorrect labeling
    And Enter CIRS Through Excel
    When Select RCA CMF Type address for QA
   #And Select RCA address first
   And Select Fright Type CMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   When Click on Save for later button
   And Click On Edit Option
   And Select Purchase/Sales Order button and Enter PO Number Through Excel
   Then Click on the search button
   And Select All Line items
   And Select First Item
    And Click on the Next button after All Line Items
   When Enter Return Quantity
   And Click on the Get credit price button 
   And Click on the Save and Summary button
    And Click on submit button After Summary
    #And Print Case No into Console SR
    And Close browser
   
   @TestCaseACCNo11
   @ACCTest
 Scenario: Verify the Open Unsubmitted status Case Edit for Admin with Freight type as IMF
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Admin and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Return Reson Incorrect labeling
    And Enter CIRS Through Excel
    When Select RCA CMF Type address for QA
   #And Select RCA address first
   And Select Fright Type IMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   When Click on Save for later button
    And Click On Edit Option
  And Select Purchase/Sales Order button and Enter PO Number Through Excel
   Then Click on the search button
   And Click on next button
   And Select All Line items
   And Select First Item
   When Select ALL
    And Click on the Next button after All Line Items
   When Enter Return Quantity
   And Click on the Get credit price button 
   And Click on the Save and Summary button
    And Click on submit button After Summary
    #And Print Case No into Console SR
    And Close browser
   
@TestCaseACCNo12
@ACCTest
 Scenario: Verify the PO Search functionality
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Admin and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Return Reson Incorrect labeling
   And Enter CIRS Through Excel
   When Select RCA CMF Type address for QA
  # And Select RCA address first
   And Select Fright Type CMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Select Purchase/Sales Order button and Enter PO Number Through Excel
   Then Click on the search button
   
   @TestCaseACCNo13
   @ACCTest
 Scenario: Verify the SO Search functionality
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Admin and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Return Reson mixed product
   And Enter CIRS Through Excel
   When Select RCA CMF Type address for QA
   #And Select RCA address first
   And Select Fright Type IMF
   And Select Return customer contact first
   And Click on next
   And Select Purchase/Sales Order button and Enter SO Number through Excel
   Then Click on the search button
   
   @TestCaseACCNo14
   @ACCTest
 Scenario: Verify the MM Search functionality
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Admin and Click create button enter Sold through Excel file
   And Select Ship To contact
   And Select credit
   And Select Return Reson duplicate order
   And Enter CIRS Through Excel
   When Select RCA CMF Type address for QA
   #And Select RCA address first
   And Select Fright Type IMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   
 @TestCaseACCNo15
 @ACCTest
 Scenario: Verify the CPN Search functionality
 Given User Launch Chrome browser
 When User open URL 
 Then User Enter Email Address and pass PassWord
 And Click on login
 And Enter text global excel
 And Click on the New R4C case creation button
 And Select Service Type Admin and Click create button enter Sold through Excel file
 And Select Ship To contact
 And Select credit
 And Select Return shortship
 And Enter CIRS Through Excel
 When Select RCA CMF Type address for QA
# And Select RCA address first
 And Select Fright Type IMF
 And Select Return customer contact first
 And Click on next
 And click on Product radio button
 And Select CPN Radio button
 And Enter CPN Number through Excel
 And click on search button
 
 @TestCaseACCNo16
 @ACCTest
 Scenario: Verify the OPN Search functionality
 Given User Launch Chrome browser
 When User open URL 
 Then User Enter Email Address and pass PassWord
 And Click on login
 And Enter text global excel
 And Click on the New R4C case creation button
 And Select Service Type Admin and Click create button enter Sold through Excel file
 And Select Ship To contact
 And Select credit
 And Select Return shortship
 And Enter CIRS Through Excel
 When Select RCA CMF Type address for QA
# And Select RCA address first
 And Select Fright Type IMF
 And Select Return customer contact first
 And Click on next
 
  @TestCaseACCNo17
  @ACCTest
 Scenario: Verify the Bulk Upload functionality
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Admin and Click create button enter Sold through Excel file
   And Select Ship To contact
   And Select credit
   And Select Return overship
   And Enter CIRS Through Excel
   When Select RCA CMF Type address for QA
  # And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Select Fright Type IMF
   And Select Return customer contact first
   And Click on next
   And Upload Bulk File With MM IDS "Path"
   And Click On Validate Button
   
@TestCaseACCNo18
@ACCTest
 Scenario: Verify the PO History functionality
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Admin and Click create button enter Sold through Excel file
   And Select Ship To contact
   And Select credit
   And Select Return Reson duplicate order
   And Enter CIRS Through Excel
   When Select RCA CMF Type address for QA
   #And Select RCA address first
   And Select Fright Type IMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   And Select All Line items with RM
   And Clickon PO History
   
@TestCaseACCNo19
@ACCTest
 Scenario: Verify the Price Override functionality 
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Admin and Click create button enter Sold through Excel file
   And Select Ship To contact
   And Select credit
   And Select Return Reson wrong product
   And Enter CIRS Through Excel
   When Select RCA CMF Type address for QA
 #  And Select RCA address first
   And Select Fright Type IMF
   And Select Return customer contact first
  # And Select CA Address first
  # When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   And Select All Line items with RM
   And Clickon PO History
  #When Click on Next After PO history check
  #When Enter Return Quantity
  When Enter Quantity into All fields
  #And Click on the Get credit price
  And Click on the Get credit price button
   And Enter Credit price
   #And Enter Credit price Zero
   