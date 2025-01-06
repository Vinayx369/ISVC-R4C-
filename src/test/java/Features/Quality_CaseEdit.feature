Feature: Case Save For Later
#Background:
   #Given User Launch Chrome browser
   #When User open URL 
   #Then User Enter Email Address and pass PassWord
   #And Click on login
@TestCaseQCENo1
@SanityQCE
Scenario: Verify the Open Unsubmitted status Case Edit for Quality with Freight type as CRF
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
  #And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
  #And Select Service Type Quality and Click create button
   #And Enter SoldTo and select "6006683685" 
   And Select Remedy and reason
   And Select All other details
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
  #When Clickon Product radiobutton and enter MM Number "99AHTF"
  #And Click on search button after Entering MM Number 
   And Select All Line items with RM
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Enter MRB into All fields through Excel
  # And Enter MRB into All fields "MRB_Test"
   And Clickon PO History check button
   When Click on Save for later button
   And Click On Edit Option
   And click accelept
   And Click On Next after edit
   And Click On Next Accept Edit 
   And Click Next After Selection of Check boxes
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    And Click on next
   When Enter Quantity into All fields through excel
   #And Enter Credit price
   And Click On Credit price Validation
   And Enter Credit price
   And Click on the Save and Summary button
   And Click on submit button After Summary
    And Close browser
    
    
    
@TestCaseQCENo2
@SanityQCE
Scenario: Verify the Open Unsubmitted status Case Edit for Quality with Freight type as IMF
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   #And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
  # And Select Service Type Quality and Click create button
   #And Enter SoldTo and select "6006683685" 
   And Select Remedy and reason
   And Select All other details
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
    And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number
  # When Clickon Product radiobutton and enter MM Number "99AHTF"
   #And Click on search button after Entering MM Number 
   And Select All Line items with RM
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click on next
   And Enter MRB into All fields through Excel
  #And Enter MRB into All fields "MRB_Test"
   And Clickon PO History check button
   When Click on Save for later button
   And Click On Edit Option
   And click accelept
   And Click On Next after edit
   And Click On Next Accept Edit 
   And Click Next After Selection of Check boxes
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    And Click on next
   When Enter Return Quantity
   And Click On Credit price Validation
   And Enter Credit price
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Print Case No into Console SR
   
    
   
   @TestCaseQCENo3
   @SanityQCE
Scenario: Verify the Submitted Pending Action status Case Edit for Technical 
 Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global excel
  # And Enter text global and select "Sarah Aggelidis"
   And Click on Related option
   When Click on View All cases option
   And Click On FilterIcon
   When Enter Case No into text field through excel
  # When Enter CAse No into text field "06344960"
   And Click On Apply button
   And Select searched case
   And Click On Edit Option
   #And click accelept
	#And click accelept
	 #And Click On Edit Option
   And Click Next After Selection of Check boxes
    When Click On Warranty Entitlement Check 
    And Click on next
    And Clickon PO History check button
     When Click on Next After PO history check
    And Enter Credit price
   And Click on the Save and Summary button
   And Click on submit button After Summary
   And Print Case No into Console SR
    #And Close browser
    
 @TestCaseQCENo4
 @SanityQCE
 Scenario: Global Search Case For Edit (Pending Action)
 Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Select Contact from list and enter Case no into search field "06344960"
      And click accelept
   And Click On Edit Option
  # And Click on next
   #And Click on next
  #When Click On Warranty Entitlement Check 
  #And Click on next
  #And Clickon PO History check button
  # And Click on next
   #And Click On Credit price Validation
   #And Enter Credit price All fields
   #And Click on the Save and Summary button
   And Click on submit button After Summary
   And Print Case No into Console SR
    
 @TestCaseQCENo5
 @SanityQCE
Scenario: Pending Approval Status {Verify the Submitted Pending Approval status Case Edit for Technical}
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global excel
   #And Enter text global and select "Sarah Aggelidis"
   And Click on Related option
   When Click on View All cases option
   And Click On FilterIcon
   When Enter Case No into text field through excel
  #When Enter CAse No into text field "06305536"
   And Click On Apply button
   And Select searched case
   And Click On Edit Option
   And click accelept
   #And click accelept
   #And Click On Edit Option
  And Click on submit button After Summary
   
   