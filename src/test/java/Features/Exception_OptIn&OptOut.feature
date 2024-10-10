Feature: Exception Optin & Out
#Background:
   #Given User Launch Chrome browser
   #When User open URL 
   #Then User Enter Email Address and pass PassWord
   #And Click on login
@TestCaseNo1
@Sanity
<<<<<<< HEAD
Scenario:  Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Ok" button in popup
=======
Scenario:  Verify the Opt-in & Opt-out functionality
>>>>>>> acb8ea77c883fa0805c227ae14fa4b673373a82e
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
   And Select Exception Return Reason and click ok
   Then Enter Justification
   And Enter CIRS Through Excel
   Then Select RCA address first and click ok
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Validate Fright type as a CMF
   And Click on next
   
   @TestCaseNo2
@Sanity2
<<<<<<< HEAD
Scenario:  Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Cancel" button in popup  
=======
Scenario:  Verify the Opt-in & Opt-out functionality 
>>>>>>> acb8ea77c883fa0805c227ae14fa4b673373a82e
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
   And Select Exception Return Reason and click cancel
   Then Enter Justification
   And Enter CIRS Through Excel
   Then Select RCA address first and click cancel
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Validate Fright type as a IMF
   And Click on next
   
   
@TestCaseNo3
@Sanity3
<<<<<<< HEAD
Scenario: Verify the Opt-in & Opt-out functionality for GEO as EMEA
=======
Scenario: TestCase No3
>>>>>>> acb8ea77c883fa0805c227ae14fa4b673373a82e
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
    And Select Exception Return Reason
   Then Enter Justification
   And Enter CIRS Through Excel
   And Select RCA address first
   And Select Fright Type IMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next