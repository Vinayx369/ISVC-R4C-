Feature: Quality Optin & Out
#Background:
   #Given User Launch Chrome browser
   #When User open URL 
   #Then User Enter Email Address and pass PassWord
   #And Click on login
@TestCaseQOIOONo1
@SanityQOIOO
Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Ok" button in popup
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit
   Then Select Ok
   And Select RCA address first
  # And Select Fright Type IMF
   And Select Fright Type CMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Validate Fright type as a CMF
   And Close browser
   
   
@TestCaseQOIOONo2
@SanityQOIOO
Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Cancel" button in popup  
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select Cancel
   And Select RCA address first
   And Select Fright Type IMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Validate Fright type as a IMF
   And Close browser
   
   
@TestCaseQOIOONo3
@SanityQOIOO
Scenario: Verify the Opt-in & Opt-out functionality for GEO as EMEA
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select Remedy and reason
   And Select All other details
   And Select Ship To contact
   When Click Ok
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Close browser