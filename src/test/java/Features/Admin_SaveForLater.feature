Feature: Admin Save For Later
#Background:
   #Given User Launch Chrome browser
   #When User open URL 
   #Then User Enter Email Address and pass PassWord
   #And Click on login
@TestCaseASFLNo1
@SanityASFL
 Scenario:  test1
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Admin and Click create button enter Sold through Excel file
   And Select All other detils
   And Select Ship To contact
   And Select credit
   And Select Return Reson Incorrect labeling
  And Enter CIRS Through Excel
  And Select RCA address first
  And Select Fright Type IMF
   #And Select Fright Type CMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   When Click on Save for later button
   And Check Status Open Unsubmitted
   And Print Case No into Console SR
   And Close browser
   
   @TestCaseASFLNo2
   @SanityASFL
 Scenario: test2
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
   And Select RCA address first
   And Select Fright Type IMF
   And Select Return customer contact first
  # And Select CA Address first
  # When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   And Clickon PO History
   When Click on Save for later button
   And Check Status Open Unsubmitted
  And Print Case No into Console SR
  # And Close browser
   
 @TestCaseASFLNo3
 @SanityASFL
 Scenario: test3
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
   And Select RCA address first
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
   When Click on Save for later button
   And Check Status Open Unsubmitted
  And Print Case No into Console SR
   And Close browser
   
  @SanityASFL 
  @TestCaseASFLNo4
 Scenario: test4
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
   And Select RCA address first
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
  When Enter Quantity into All fields
 # And Click on the Get credit price
  And Click on the Get credit price button
   When Click on Save for later button
   And Check Status Open Unsubmitted
  And Print Case No into Console SR
   And Close browser
   
   
   