Feature: Validate OptInOut Misc feature
@TestCaseMOIOONo1
@SanityMOIOO
Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Cancel" button in popup 
Given User Launch Chrome browser
When User open URL
Then User Enter Email Address and pass PassWord
And Click on login
And Enter text global excel
And Click on the New R4C case creation button
And Select Service Type Miscellaneous and Click on Create buttons and enter sold to 
#And Select Internal Case Creation Option
And Click Ok
And Select Return Only
And Select Reason FOCS
# And Select Ship To contact
#And Select Sold To Contact
And Select RCA address first
And Select Fright Type IMF
And Select Return customer contact first
And Select CA Address first
When select Collection Contact first
And Validate Fright type as a IMF
And Close browser

@TestCaseMOIOONo2
@SanityMOIOO
Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Ok" button in popup
Given User Launch Chrome browser
When User open URL
Then User Enter Email Address and pass PassWord
And Click on login
And Enter text global excel
And Click on the New R4C case creation button
And Select Service Type Miscellaneous and Click on Create buttons and enter sold to 
#And Select Internal Case Creation Option
And Click Ok
And Select Return Only
And Select Reason FOCS
#And Select Ship To contact
#And Select Sold To Contact
And Select RCA address first
And Select Fright Type CMF
And Select Return customer contact first
And Select CA Address first
When select Collection Contact first
And Validate Fright type as a CMF
And Click on next
And Close browser

@TestCaseMOIOONo3
@SanityMOIOO
Scenario: Verify the Opt-in & Opt-out functionality for GEO as EMEA
Given User Launch Chrome browser
When User open URL
Then User Enter Email Address and pass PassWord
And Click on login
And Enter text global excel
And Click on the New R4C case creation button
And Select Service Type Miscellaneous and Click on Create buttons and enter sold to 
And Click Ok
#And Select Internal Case Creation Option
And Select Return Only
And Select Reason FOCS
# And Select Ship To contact
#And Select Sold To Contact
And Select RCA address first
And Click Ok
And Close browser
