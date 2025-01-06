Feature: Admin Save For Later
#Background:
   #Given User Launch Chrome browser
   #When User open URL 
   #Then User Enter Email Address and pass PassWord
   #And Click on login
@TestCaseASFLNo1
@SanityASFL
 Scenario:  Verify the Save for Later functionality in Request Header details
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
 Scenario: Verify the Save for Later functionality Search/Upload Line item page
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
   #And Select RCA address first
   And Select Fright Type IMF
   And Select Return customer contact first
  And Select CA Address first
  When select Collection Contact first
   And Click on next
   And Select Purchase/Sales Order button and Enter PO Number Through Excel
   Then Click on the search button
   And Select All Line items
   #And Click on the Next button after All Line Items
   When Click on Save for later button
   And Check Status Open Unsubmitted
  And Print Case No into Console SR
  # And Close browser
   
 