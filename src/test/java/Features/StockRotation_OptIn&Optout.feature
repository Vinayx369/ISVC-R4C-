Feature: R4C Case Opt In/Out SR case
@TestcaseNo1
@Sanity1
 Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Cancel" button in popup 
 Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Amy Adamo"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup
   And Select service type as "Stock Rotation & Return"
   And Click on the create button
   And Enter SoldTo and select "500908"
   And Select credit 
   And Select return Reason Standard stock rotation
   And Click on Cancel buttton
   And Close browser
      
   	
 @TestcaseNo2 
 @Sanity2
 Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Ok" button in popup 
 Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Amy Adamo"
   And Click on the New R4C case creation button
   Then User can view New R4C Case popup
   And Select service type as "Stock Rotation & Return"
   And Click on the create button
   And Enter SoldTo and select "500908" 
   And Select credit
   And Select return Reason Standard stock rotation
   And Click on Ok buttton
   And Close browser
   
 
@TestcaseNo3
@Sanity
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
   And Select All other detils
   And Select Ship To contact
   And Select RCA address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Close browser