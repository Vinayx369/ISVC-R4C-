Feature: R4C Case Save For Later
@TestCaseSRSFLNo1
@SanitySRSFL
 Scenario: Verify the Save for Later functionality in Request Header details
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type SR and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
   And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
   When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
   And Close browser
   
   
 @TestCaseSRSFLNo2
 @SanitySRSFL
 Scenario: Verify the Save for Later functionality Search/Upload Line item page
 Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type SR and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number 
   When Select ALL     
   And Clickon PO History
   And Click on Product Validation
   When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
   And Close browser

 @TestCaseSRSFLNo3
 @SanitySRSFL
 @highPriority
 Scenario: Verify the Save for Later functionality Product Validation page
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type SR and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
   And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
   And Click on next
    And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   When Select ALL      
   And Clickon PO History
   And Click on Product Validation 
  When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
   And Close browser
   
  
   
@TestCaseSRSFLNo4
@SanitySRSFL
@highPriority
 Scenario: Verify the Save for Later functionality Credit Price Validation page
 Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type SR and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Promotional Stock option
   And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
   And Click on next
    And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number  
   When Select ALL    
   And Clickon PO History 
   And Click on Product Validation and Next button
   When Enter Quantity into All fields through excel
   And Click on the Get credit price
   When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
   And Close browser
  
   
   
   
   
   
   