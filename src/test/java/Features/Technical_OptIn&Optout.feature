Feature: R4C OptInAndOut_ Technical
@TestcaseTOIOONo1
@SanityTOIOO
 Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Cancel" button in popup 
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login  
   And Enter text global and select "Amy Adamo"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold To "0000024100"
  #And Select credit
   And Select Remedy credit and reason
   #And Select Return Reason as a Failed at Customer Factory Site
   And Select RCA for OptIn/Out
    And Click on Cancel buttton
    And User Should Get IMF Freight type "Intel Managed Freight"
   	And Close browser
   	 
 
@TestcaseTOIOONo2
 @SanityTOIOO
 Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Ok" button in popup 
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login  
   And Enter text global and select "Amy Adamo"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold To "0000024100"
   #And Select credit
    And Select Remedy credit and reason
   #And Select Return Reason as a Failed at Customer Factory Site
   And Select RCA for OptIn/Out
   And Click on Ok buttton
   And User Should Get CRF Freight
   And Close browser
  
 
@TestcaseTOIOONo3
@SanityTOIOO
 Scenario:  Verify the Opt-in & Opt-out functionality for GEO as EMEA
    Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login  
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold To "6006683685"
   And Select Remedy credit and reason Fail Customer End 
   And Select Ship To contact
    And Select RCA address first
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
   And Click on next
   And Close browser
   
   
    
   
   
   
    
    
    
