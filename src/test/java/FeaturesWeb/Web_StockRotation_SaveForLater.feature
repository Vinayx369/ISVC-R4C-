Feature: R4C Case Save For later
@TestCaseWSRSFLNo1
@SanitySRCC
 Scenario: Verify the Save for Later functionality in Request Header details
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
  When Click on Save for later button
  When Print Case No into Console Web
   And Close browser
   
@TestCaseWSRSFLNo2
@SanitySRCC
 Scenario:Verify the Save for Later functionality Search/Upload Line item page
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
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   #When Select ALL 
   And Select First Item     
   When Clickon PO History only 
   When Click on Save for later button
   When Print Case No into Console Web
   And Close browser
   
@TestCaseWSRSFLNo3
@SanitySRCC
 Scenario: Verify the Save for Later functionality Product Validation page
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
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
  When Select ALL Web 
   #And Select First Item     
   And Clickon PO History 
   When Click on Product Validation
   When Click on Save for later button
   When Print Case No into Console Web
   #When Check Status open unsubmited
   And Close browser
   
   
@TestCaseWSRSFLNo4
@SanitySRCC
 Scenario: Verify the Save for Later functionality Credit Price Validation page
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
  And Enter MMIDs By using Excel Sheet
  And Click on search button after Entering MM Number
  When Select ALL Web 
  #And Select First Item     
  And Clickon PO History 
  And Click on Product Validation and Next button
  When Enter Quantity into All fields through excel
  #When Enter Return Quantity
  And Click on the Get credit price
  When Click on Save for later button
  When Print Case No into Console Web
  And Close browser
   
   