Feature: R4C Case Opt In/Out SR case
@TestcaseSROIOONo1
@SanitySROIOO
 Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Cancel" button in popup 
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type SR and Click create button enter Sold through Excel file
   And Enter Sold To details
   And Select All other details
   And Select Ship To contact
   And Select credit 
   And Select return Reason Standard stock rotation
   And Click on Cancel buttton
   And Validate Fright type as a IMF
   And Close browser
      
   	
 @TestcaseSROIOONo2 
 @SanitySROIOO
 Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Ok" button in popup 
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type SR and Click create button enter Sold through Excel file
   And Enter Sold To details
   And Select All other details
   And Select Ship To contact
   And Select credit
   And Select return Reason Standard stock rotation
   And Click on Ok buttton
   And Validate Fright type as a CMF
   And Close browser
   
 
@TestcaseSROIOONo3
@SanitySROIOO
 Scenario:  Verify the Opt-in & Opt-out functionality for GEO as EMEA
Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup
   And Select service type as "Stock Rotation & Return"
   And Click on the create button
   And Enter SoldTo and select "83685" 
   And Select  Reason as Standard Stock Rotation
   And Select All other details
   And Select Ship To contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
   And Close browser