Feature: Admin Case Optin &Out Creation
#Background:
   #Given User Launch Chrome browser
   #When User open URL 
   #Then User Enter Email Address and pass PassWord
   #And Click on login
@TestCaseAOIOONo1
@SanityAOIOO
 Scenario:  Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Cancel" button in popup 
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
    #And Select RCA address first
   And Select Fright Type IMF
   #And Select Fright Type CMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Validate Fright type as a IMF
   And Click on next
   
 @TestCaseAOIOONo2
 @SanityAOIOO
 Scenario:  Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "ok" button in popup 
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
     #And Select RCA address first
   #And Select Fright Type IMF
   And Select Fright Type CMF
   And Select Return customer contact first
   #And Select CA Address first
  # When select Collection Contact first
   #And Validate Fright type as a CMF
  # And Click on next
   
 @TestCaseAOIOONo3
 @SanityAOIOO
   Scenario: Verify the Opt-in & Opt-out functionality for GEO as EMEA
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
   And Select Fright Type CMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first