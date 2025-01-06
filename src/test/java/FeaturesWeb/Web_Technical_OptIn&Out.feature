Feature: R4C Case Creation

@TestCaseSROIOONo1
@SanitySRCC
 Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Cancel" button in popup 
  Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   Then Click Ok
   And Select All other details
   And Select Ship To contact
  And Select credit 
  #When Select Standard stock rotation
   And Click on Cancel buttton
   And Validate Fright type as a IMF
   And Close browser
   
@TestCaseSROIOONo2
@SanitySRCC
 Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Ok" button in popup
 Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
    And Select credit
    When Click on Cancel buttton
  When Select Standard stock rotation
   And Click on Ok buttton
   And Validate Fright type as a CMF
   And Close browser
   
   
@TestCaseSROIOO3
@SanitySRCC
 Scenario: Verify the Opt-in & Opt-out functionality for GEO as EMEA
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
    And Select credit 
    And Click on Ok buttton
    When Select Standard stock rotation
    When Click on Cancel buttton
  # And Select return Reason Standard stock rotation
    And Select RCA address first web
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   