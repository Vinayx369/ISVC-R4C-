Feature: Excel sheet

Scenario: Verify the Opt-in & Opt-out functionality for GEO as EMEA
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login

Scenario: Verify the Opt-in & Opt-out functionality for GEO as EMEA
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
  And Enter text global and select "Amy Adamo"
  
Scenario: Verify the Opt-in & Opt-out functionality for GEO as EMEA
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
  And Enter text global 
  And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold
   
   
@highpriority
Scenario: Verify the Opt-in & Opt-out functionality for GEO as EMEA with read Excel sheet
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login
  And Enter text global excel
  And Click on the New R4C case creation button
 And Select Service Type Technical and Click on Create buttons and Enter Sold through Excel
  