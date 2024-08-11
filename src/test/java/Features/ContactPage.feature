Feature: R4C Case Creation

  As a user
  I want to be able to create a new R4C case
  So that I can track and manage the case effectively
  
 Scenario: Verify the Case creation for Service Type as 
     Stock Rotation & Return Reason as Standard Stock Rotation with Freight type as CRF using PO Search
  
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login
    When User Click on Contact menu
    And Select Contact from list and enter Text into search field "Sarah"
    And Click on the New R4C case creation button
    Then User can view New R4C Case popup
    And Select service type as "Stock Rotation & Return"
    And Click on the create button
    When User enter Sold to and other details
    And Click on the Next button After Sold To
    And Select Purchase/Sales Order button and Enter PO Number "4511274812"
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
    Then User can view Case creation Popup message
    And Click on the Submit button
    Then User can view Successful message
    And Close browser
    
Scenario: Verify the Case creation for Stock Rotation & Return Reason as
      Standard Stock Rotation with Freight type as IMF using SO Search  
 
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login  
   When User Click on Contact menu
    And Select Contact from list and enter Text into search field "Sarah"
    And Click on the New R4C case creation button
    Then User can view New R4C Case popup
    And Select service type as "Stock Rotation & Return"
    And Click on the create button
   When User enter Sold to and other details
   And Click on the Next button After Sold To
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
    Then User can view Case creation Popup message
    And Click on the Submit button
    Then User can view Successful message
    And Close browser
    
      
 Scenario: Verify the Case creation for Stock Rotation & Return Reason as Promotional Stock Rotation with Freight type as CRF using MM Search
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login  
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a "Promotional Stock Rotation"
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
    Then User can view Case creation Popup message
    And Click on the Submit button
    Then User can view Successful message
    And Close browser
    
  @HighPriority  
 Scenario: Verify the Case creation for Stock Rotation & Return Reason as 
 Promotional Stock Rotation with Freight type as IMF using Bulk Upload
   Given User Launch Chrome browser
   When User open url "https://isvc--isvcqa24.sandbox.my.salesforce.com"
   And User Enter Email "r4cl1agent02@intel.com.isvcqa24" as and pass "Intel@369"
   And Click on login 
   When User Click on Contact menu
   And Select Contact from list and enter Text into search field "Sarah"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup 
   And Select service type as a "Promotional Stock Rotation" and Upload Bulk File
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
    Then User can view Case creation Popup message
    And Click on the Submit button
    Then User can view Successful message
    And Close browser
    
    
    
  
    
    
    