Feature: Admin Case Edit
 
@TestCaseACENo1
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
   And Select Damage In Transit
   And Enter CIRS Through Excel
   And Select RCA address first
   And Select Fright Type CMF
   And Select Return customer contact first
  And Select CA Address first
   When select Collection Contact first
   When Click on Save for later button
   And Click On Edit Option
   And click accelept
   And Click On Next after edit
   And Click On Next Accept Edit
    And Select Purchase/Sales Order button and Enter PO Number Through Excel
   Then Click on the search button
   And Select All Line items
   And Select First Item
   And Click on the Next button after All Line Items
   When Enter Return Quantity
   And Click on the Get credit price button
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Print Case No into Console SR
   And Close browser
   
@TestCaseACENo2
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
   And Select Damage In Transit
   And Enter CIRS Through Excel
   And Select RCA address first
   And Select Fright Type IMF
   And Select Return customer contact first
  And Select CA Address first
   When select Collection Contact first
   When Click on Save for later button
   And Click On Edit Option
   And click accelept
   And Click On Next after edit
   And Click On Next Accept Edit
    And Select Purchase/Sales Order button and Enter PO Number Through Excel
   Then Click on the search button
   And Select All Line items
   And Select First Item
   And Click on the Next button after All Line Items
   When Enter Return Quantity
   And Click on the Get credit price button
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Print Case No into Console SR
   And Close browser
   
   
   
@TestCaseACENo3
@QualityCESanity
Scenario: Verify the Submitted Pending Approval status Case Edit for Admin
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on Related option
   When Click on View All cases option
   And Click On FilterIcon
   When Enter Case No into text field through excel
  # When Enter CAse No into text field "06356465"
   And Click On Apply button
   And Select searched case
   And Click On Edit Option
   And click accelept
   #And click accelept
   #And Click On Edit Option
  And Click on submit button After Summary 
   
   
  