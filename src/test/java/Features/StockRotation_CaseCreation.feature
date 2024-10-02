Feature: R4C Case Creation

@TestCaseNo1.0
@Sanity
 Scenario: Verify the Case creation for Service Type as 
     Stock Rotation & Return Reason as Standard Stock Rotation with Freight type as CRF using PO Search
  
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup
   And Select service type as "Stock Rotation & Return"
   And Click on the create button
   And Enter SoldTo and select "6006683685"
   #And Enter Sold To details
   And Select All other detils
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
   And Select RCA address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
    And Select Purchase/Sales Order button and Enter PO Number "4511948508"
    Then Click on the search button
    And Select All Line items
    And Select First Item
    And Click on the Next button after All Line Items
    And Click on Product Validation and Next button
    #When Enter Return Quantity
    When Enter Quantity into All fields
    And Click on the Get credit price
    And Click on the Next button After credit Price
    #And Enter Credit price
    And Enter Credit price All fields
    And Click on the Next button After Credit
    And Click on the Validate Allowance
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Check RMA status
    And Print Case No into Console SR
    Then User can view Case creation Popup message
    And Click on the Submit button
    Then User can view Successful message
    And Close browser
    
@TestCaseNo2
@Sanity
Scenario: Verify the Case creation for Stock Rotation & Return Reason as
      Standard Stock Rotation with Freight type as IMF using SO Search  
 
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup
   And Select service type as "Stock Rotation & Return"
   And Click on the create button
   And Enter SoldTo and select "6006683685"
   And Select All other detils
   And Select Ship To contact
   And Select credit
  #And Enter Sold To details
   And Select Promotional Stock option
   And Select RCA address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
   And Select Purchase/Sales Order button and Enter SO Number "0019141969"
   Then Click on the search button
   And Select All Line items
   And Click on the Next button after All Line Items
   And Click on Product Validation and Next button
   When Enter Return Quantity
   And Click on the Get credit price
   And Click on the Next button After credit Price
   And Enter Credit price
   And Click on the Next button After Credit
   And Click on the Validate Allowance
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Check RMA status
   And Print Case No into Console SR
   Then User can view Case creation Popup message
   And Click on the Submit button
   Then User can view Successful message
   And Close browser
    
   
@TestCaseNo3
@Sanity
 Scenario: Verify the Case creation for Stock Rotation & Return Reason as Promotional Stock Rotation with Freight type as CRF using MM Search
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup
   And Select service type as Stock roatation
   #And Enter Sold To details
   And Enter SoldTo and select "6006683685"
   And Select All other detils
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
   And Select RCA address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99APD4"
   And Click on search button after Entering MM Number      
   And Clickon PO History 
   And Click on Product Validation and Next button
   When Enter Return Quantity
   And Click on the Get credit price
   And Click on the Next button After credit Price        
   And Click on the Next button After Credit
   And Click on the Validate Allowance
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Check RMA status
   And Print Case No into Console SR
   Then User can view Case creation Popup message
   And Click on the Submit button
   Then User can view Successful message
   And Close browser
    
@TestCaseNo4.0
@Sanity
Scenario: Verify the Case creation for Stock Rotation & Return Reason as 
      Promotional Stock Rotation with Freight type as IMF using Bulk Upload
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as Stock roatation
   #And Enter Sold To details
   And Enter SoldTo and select "6006683685"
   And Select All other detils
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
   And Select RCA address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
   And Click On Bulk upload "C:\Users\oyadavx\OneDrive - Intel Corporation\Desktop\MMCPN_BulkUploadTemplate.csv"
    And Click On Validate Button
    And Clickon PO History 
    And Click on Product Validation and Next button
    When Enter Return Quantity
    And Click on the Get credit price
    And Click on the Next button After credit Price        
    And Click on the Next button After Credit
    And Click on the Validate Allowance
    And Click on the Save and Summary button
    And Click on submit button After Summary
   And Check RMA status
   And Print Case No into Console SR
    Then User can view Case creation Popup message
    And Click on the Submit button
    Then User can view Successful message
    And Close browser
    
    
 @TestCaseNo5
 
 Scenario: Verify the PO Search functionality
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a Promotional Stock Rotation
   And Select Purchase/Sales Order button and Enter PO Number "4511274812"
   Then Click on the search button
   And Close browser
   
   @TestCaseNo5.1
   @Retest
 Scenario: Verify the PO Search functionality
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup
   And Select service type as "Stock Rotation & Return"
   And Click on the create button
   And Enter SoldTo and select "6006683685"
   #And Enter Sold To details
   And Select All other detils
   And Select Ship To contact
   And Select credit
    And Select Promotional Stock option
    And Select RCA address
    And Select Return customer contact
    And Select CA Address
    When select Collection Contact
    And Click on next
    And Select Purchase/Sales Order button and Enter PO Number "4511948508"
    Then Click on the search button
    
    
@TestCaseNo6

 Scenario: Verify the SO Search functionality
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a Promotional Stock Rotation
   And Select Purchase/Sales Order button and Enter SO Number "0019141969"
   Then Click on the search button
   And Close browser
   
  @TestCaseNo6.1
  @Retest
   Scenario: Verify the SO Search functionality
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup
   And Select service type as "Stock Rotation & Return"
   And Click on the create button
   And Enter SoldTo and select "6006683685"
   And Select All other detils
   And Select Ship To contact
   And Select credit
  # And Enter Sold To details
   And Select Promotional Stock option
   And Select RCA address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
   And Select Purchase/Sales Order button and Enter SO Number "0019141969"
   Then Click on the search button
   
 @TestCaseNo7
  
 Scenario: Verify the MM Search functionality
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a Promotional Stock Rotation
   When Clickon Product radiobutton and enter MM Number "99APD4"
   And Click on search button after Entering MM Number 
   And Close browser
   
 @TestCaseNo7.1
 @Retest
 Scenario: Verify the MM Search functionality
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup
   And Select service type as Stock roatation
   #And Enter Sold To details
   And Enter SoldTo and select "6006683685"
   And Select All other detils
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
   And Select RCA address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99APD4"
   And Click on search button after Entering MM Number
    
 @TestCaseNo8
        
 Scenario: Verify the CPN Search functionality
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a Promotional Stock Rotation
   And click on Product radio button
   And Select CPN Radio button
   When Enter CPN number
   And click on search button 
   And Close browser
  
 @TestCaseNo9
 @Retest   
 Scenario: Verify the OPN Search functionality
 Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a Promotional Stock Rotation
   And click on Product radio button
   And Click on Order Part Number radio button
   When Enter OPN into search box "6576567"
   And click on search button 
   And Close browser
    
 @TestCaseNo10
    
 Scenario: Verify the Bulk Upload functionality
 Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a Promotional Stock Rotation and Upload Bulk File "C:\Users\oyadavx\OneDrive - Intel Corporation\Desktop\MMCPN_BulkUploadTemplate.csv"
   And Click On Validate Button
   And Close browser
   
 @TestCaseNo10.1
 Scenario: Verify the Case creation for Stock Rotation & Return Reason as 
      Promotional Stock Rotation with Freight type as IMF using Bulk Upload
 Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as Stock roatation
   #And Enter Sold To details
   And Enter SoldTo and select "6006683685"
   And Select All other detils
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
   And Select RCA address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
   And Click On Bulk upload "C:\Users\oyadavx\OneDrive - Intel Corporation\Desktop\MMCPN_BulkUploadTemplate.csv"
    And Click On Validate Button 
     
@TestCaseNo11
      
 Scenario: Verify the PO History functionality
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a Promotional Stock Rotation
   When Clickon Product radiobutton and enter MM Number "99APD4"
   And Click on search button after Entering MM Number 
   And Clickon PO History 
   And Close browser
   
 @TestCaseNo11.1 
 @Retest 
  Scenario: Verify the PO History functionality
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup
   And Select service type as Stock roatation
   #And Enter Sold To details
   And Enter SoldTo and select "6006683685"
   And Select All other detils
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
   And Select RCA address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99APD4"
   And Click on search button after Entering MM Number      
   And Clickon PO History 
    
 @TestCaseNo12
   
 Scenario: Verify the Save for Later functionality Search/Upload Line item page
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a Promotional Stock Rotation
   When Clickon Product radiobutton and enter MM Number "99APD4"
   And Click on search button after Entering MM Number 
   And Clickon PO History button
   When Click on Save for later button
   And Close browser
   
  @TestCaseNo12.1
  
   Scenario: Verify the Save for Later functionality Search/Upload Line item page
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup
   And Select service type as Stock roatation
   #And Enter Sold To details
   And Enter SoldTo and select "6006683685"
   And Select All other detils
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
   And Select RCA address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99APD4"
   And Click on search button after Entering MM Number      
   And Clickon PO History 
   When Click on Save for later button
   And Print Case No into Console SR
    
@TestCaseNo13
@Sanity
 Scenario: Verify the Price Override functionality with L<=25K   
 
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup
   And Select service type as "Stock Rotation & Return"
   And Click on the create button
   And Enter SoldTo and select "6006683685" 
   And Select Remedy and reason
   And Select All other detils
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Select Purchase/Sales Order button and Enter SO Number "0019141969"
    Then Click on the search button
    And Select All Line items
    And Click on the Next button after All Line Items
    And Click on Product Validation and Next button
    When Enter Return Quantity
    And Click on the Get credit price
    And Click on the Next button After credit Price
    And Enter Credit price <25K
    And Click on the Next button After Credit
    And Click on the Validate Allowance
    And Click on the Save and Summary button
    And Click on submit button After Summary
   And Check RMA status
   And Print Case No into Console SR
    Then User can view Case creation Popup message
    And Click on the Submit button
    Then User can view Successful message
    And Close browser
    
 @TestCaseNo14
 @Sanity
 Scenario: Verify the Price Override functionality with G>=25K   
 Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup
   And Select service type as "Stock Rotation & Return"
   And Click on the create button
   And Enter SoldTo and select "6006683685" 
   And Select Remedy and reason
   And Select All other detils
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Select Purchase/Sales Order button and Enter SO Number "0019141969"
   Then Click on the search button
   And Select All Line items
    And Click on the Next button after All Line Items
    And Click on Product Validation and Next button
    When Enter Return Quantity
    And Click on the Get credit price
    And Click on the Next button After credit Price
    And Enter Credit price >25K
    And Click on the Next button After Credit
    And Click on the Validate Allowance
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Check RMA status
    And Print Case No into Console SR
    When User Slect L3 Agent Selection
    And Click on Select Button
    And Close browser
    
    
   
       

  
    
    
    