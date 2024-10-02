Feature: R4C Case Save For Later
@TestCaseNo1
@Sanity
 Scenario: Verify the Save for Later functionality in Request Header details
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type SR and Click on Create buttons and Enter Sold To "6006683685"
   And Select Remedy credit and reason SSR  
   And Select RCA CMF Type address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
   And Close browser
   
   
 @TestCaseNo2
 @Sanity
 Scenario: Verify the Save for Later functionality Search/Upload Line item page
   Given User Launch Chrome browser
   When User open URL 
   And User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type SR and Click on Create buttons and Enter Sold To "6006683685"
   And Select Remedy credit and reason SSR 
   And Select RCA CMF Type address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99APD4"
   And Click on search button after Entering MM Number 
   And Clickon PO History button
   When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
   And Close browser

 @TestCaseNo3
 @Sanity
 @highPriority
 Scenario: Verify the Save for Later functionality Product Validation page
   Given User Launch Chrome browser
   When User open URL 
   And User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type SR and Click on Create buttons and Enter Sold To "6006683685"
   And Select Remedy credit and reason SSR 
   And Select RCA CMF Type address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
   When Clickon Product radiobutton and enter MM Number "99APD4"
   And Click on search button after Entering MM Number 
   And Clickon PO History 
   And Click on Product Validation 
  When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
   And Close browser
   
  
   
@TestCaseNo4
@Sanity
@highPriority
 Scenario: Verify the Case creation for Service Type as Technical with ULT is not mandatory
  Given User Launch Chrome browser
   When User open URL 
   And User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type SR and Click on Create buttons and Enter Sold To "6006683685"
   And Select Remedy credit and reason SSR 
   And Select RCA CMF Type address
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
   When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
   And Close browser
  
   
   
   
   
   
   