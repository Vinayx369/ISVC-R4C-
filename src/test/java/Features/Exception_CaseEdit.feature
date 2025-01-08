Feature: Exception Case Edit
#Background:
   #Given User Launch Chrome browser
   #When User open URL 
   #Then User Enter Email Address and pass PassWord
   #And Click on login

@TestCaseECENo1
@SanityQCE
Scenario: Verify the Open Unsubmitted status Case Edit for Exception with Freight type as CRF
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Exception and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit
  And Select GRL Exception Reason
  Then Enter Justification
  And Select RCA address first
  # And Select Fright Type IMF
   Then Select Fright Type IMF without cancel
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   When Click on Save for later button
   And Click On Edit Option
   And click accelept
   And Click On Next after edit
   And Click On Next Accept Edit
 #  And Select Purchase/Sales Order button and Enter PO Number Through Excel
  # Then Click on the search button
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   #And Select All Line items
   And Select First Item
   And Clickon PO History
   When Enter Quantity into All fields
   And Select Box Condition
   And Click on the Get credit price button
   And Enter Credit price All fields
  # And Select multiple box condition
 #  And Select All Line items with RM
 #  And Click on next button
  #And Select All Line items
 #And Select First Item
 And Click on the Save and Summary button
 And Click on submit button After Summary
   
   
@TestCaseECENo2
@SanityQCE
Scenario: Verify the Open Unsubmitted status Case Edit for Exception with Freight type as IMF
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Exception and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit
  And Select GRL Exception Reason
  Then Enter Justification
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
 #  And Select Purchase/Sales Order button and Enter PO Number Through Excel
  # Then Click on the search button
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   #And Select All Line items
  #And Select First Item
   And Clickon PO History
   When Enter Quantity into All fields
   And Select Box Condition
   And Click on the Get credit price button
   And Enter Credit price All fields
  # And Select multiple box condition
 #  And Select All Line items with RM
 #  And Click on next button
  #And Select All Line items
 #And Select First Item
 And Click on the Save and Summary button
 And Click on submit button After Summary
   
   
   
@TestCaseECENo3
@SanityQCE
Scenario: Pending Approval Status {Verify the Submitted Pending Approval status Case Edit for Technical}
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
   
   
   
   
   
   
   
   
   