Feature: Exception Case Edit
#Background:
   #Given User Launch Chrome browser
   #When User open URL 
   #Then User Enter Email Address and pass PassWord
   #And Click on login

@TestCaseNo1
@Sanity
Scenario: Verify the Open Unsubmitted status Case Edit for Exception with Freight type as CRF
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Exception and Click create button enter Sold through Excel file
   And Select All other detils
   And Select Ship To contact
   And Select credit
<<<<<<< HEAD
  And Select GRL Exception Reason
  Then Enter Justification
  #When Select ReTurnTo Customer address
=======
    And Select GRL Exception Reason
   Then Enter Justification
   #When Select ReTurnTo Customer address
>>>>>>> acb8ea77c883fa0805c227ae14fa4b673373a82e
  And Select RCA address first
   And Select Fright Type IMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   When Click on Save for later button
   And Click On Edit Option
   # And click accelept
   And Click On Next after edit
   And Click On Next Accept Edit
 #  And Select Purchase/Sales Order button and Enter PO Number Through Excel
  # Then Click on the search button
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
   And Select All Line items
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
   
   
@TestCaseNo2
@Sanity
Scenario: Verify the Open Unsubmitted status Case Edit for Exception with Freight type as IMF
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Exception and Click create button enter Sold through Excel file
   And Select All other detils
   And Select Ship To contact
   And Select credit
    And Select GRL Exception Reason
   Then Enter Justification
   #When Select ReTurnTo Customer address
  And Select RCA address first
   And Select Fright Type IMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   When Click on Save for later button
   And Click On Edit Option
   # And click accelept
   And Click On Next after edit
   And Click On Next Accept Edit
 #  And Select Purchase/Sales Order button and Enter PO Number Through Excel
  # Then Click on the search button
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
<<<<<<< HEAD
  And Select All Line items
=======
   And Select All Line items
>>>>>>> acb8ea77c883fa0805c227ae14fa4b673373a82e
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
<<<<<<< HEAD
 And Print Case No into Console SR 
=======
   
>>>>>>> acb8ea77c883fa0805c227ae14fa4b673373a82e
   
   
   
   
   
   
   
   
   
   
   
   
   
   