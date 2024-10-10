Feature: Quality Optin & Out
#Background:
   #Given User Launch Chrome browser
   #When User open URL 
   #Then User Enter Email Address and pass PassWord
   #And Click on login
@TestCaseNo1-pass
@Sanity
Scenario:  Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Ok" button in popup
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
 #And Select Service Type Quality and Click create button
 #And Enter SoldTo and select "6006683685" 
   And Select All other detils
   And Select Ship To contact
   And Select credit
   And Select RCA address first
  # And Select Fright Type IMF
   And Select Fright Type CMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Validate Fright type as a CMF
   
   
@TestCaseNo2-pass
@Sanity
Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Cancel" button in popup  
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Quality and Click create button enter Sold through Excel file
   And Select All other detils
   And Select Ship To contact
   And Select credit
   And Select RCA address first
   And Select Fright Type IMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Validate Fright type as a IMF
   
   
@TestCaseNo3-pass
@Sanity
Scenario: Verify the Opt-in & Opt-out functionality for GEO as EMEA
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
   And Select All other detils
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next