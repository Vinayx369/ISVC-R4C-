Feature: R4C OptInAndOut_ Technical
@TestcaseNo-1
@highpriority
 Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Cancel" button in popup 
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login  
   And Enter text global and select "Amy Adamo"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold To "0000024100"
     And Select credit
   And Select Return Reason as a Failed at Customer Factory Site
   And Select RCA for OptIn/Out
    And Click on Cancel buttton
    And User Should Get IMF Freight type "Intel Managed Freight"
   	And Close browser
   	 
 
 @TestcaseNo-2 
 
 Scenario: Verify the Opt-in & Opt-out functionality for ASMO/APAC/PROC/IJKK GEO's by clicking on "Ok" button in popup 
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login  
   And Enter text global and select "Amy Adamo"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold To "0000024100"
   And Select credit
   And Select Return Reason as a Failed at Customer Factory Site
   And Select RCA for OptIn/Out
   And Click on Ok buttton
   And User Should Get CRF Freight
   And Close browser
  
 
@TestcaseNo-3-Pass
 Scenario:  Verify the Opt-in & Opt-out functionality for GEO as EMEA
    Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login  
   And Enter text global and select "Sarah Aggelidis"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold To "6006683685"
   And Select Remedy credit and reason Fail Customer End 
   And Select RCA address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
   And Close browser
   
   
    
   
   
   
    
    
    
