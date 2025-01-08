Feature: R4C Profile Masking

@ProfileMaskingTC01
 Scenario: Verify the User Profile Masking Search with First Name
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter "Price & Profile Masking" in AppLauncher & open it
   And Click on Profile Masking & go to Next
   And Click on User Profile Masking & go to Next
   And Enter First Name as "Amy"
   And Click on Search
   And Close browser
   
@ProfileMaskingTC02
 Scenario: Verify the User Profile Masking Search with Last Name 
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter "Price & Profile Masking" in AppLauncher & open it
   And Click on Profile Masking & go to Next
   And Click on User Profile Masking & go to Next
   And Enter Last Name as "r4c"
   And Click on Search   
   And Close browser
   
@ProfileMaskingTC03
 Scenario: Verify the User Profile Masking Search with Email 
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter "Price & Profile Masking" in AppLauncher & open it
   And Click on Profile Masking & go to Next
   And Click on User Profile Masking & go to Next
   And Enter Email as "anagha.r.atri@intel.com"
   And Click on Search  
   And Close browser
   
@ProfileMaskingTC04
 Scenario: Verify the User Profile Masking Search with Login Name 
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter "Price & Profile Masking" in AppLauncher & open it
   And Click on Profile Masking & go to Next
   And Click on User Profile Masking & go to Next
   And Enter Login Name as "testuserportalqa24@mailinator.com"
   And Click on Search    
   And Close browser


@ProfileMaskingTC05
 Scenario: Verify the Error message at portal Homepage for User Profile Masking 
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter "Price & Profile Masking" in AppLauncher & open it
   And Click on Profile Masking & go to Next
   And Click on User Profile Masking & go to Next
   And Enter First Name as "Amy"
   And Click on Search
   And Select Check box for any contact & click on Save button
   And Global Search the Contact "Amy Adamo" and open it
   And Click on Log in to Experience as User button in contact
   And Validate the Error message at Homepage
   And Close browser
   
@ProfileMaskingTC06
 Scenario: Verify the User Profile Masking at Sold To level Create Mask
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter "Price & Profile Masking" in AppLauncher & open it
   And Click on Profile Masking & go to Next
   And Click on User Profile Masking & go to Next
   And Enter First Name as "Amy"
   And Click on Search
   And Click on Gear icon for any of the Contact
   And Select Create Mask Check box for any Sold To & click on Save button
   And Global Search the Contact "Amy Adamo" and open it
   And Click on Log in to Experience as User button in contact
   And Click on Create Case button & create Technical Case
   And Enter Sold To in Case creation "0000024100" & Validate the Sold To
   
   
@ProfileMaskingTC07
 Scenario: Verify the User Profile Masking at Sold To level View Mask
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter "Price & Profile Masking" in AppLauncher & open it
   And Click on Profile Masking & go to Next
   And Click on User Profile Masking & go to Next
   And Enter First Name as "Amy"
   And Click on Search
   And Click on Gear icon for any of the Contact
   And Select View Mask Check box for any Sold To & click on Save button
   And Global Search the Contact "Amy Adamo" and open it
   And Click on Log in to Experience as User button in contact
   And Click Search Query
   And Enter Sold To in Query Search "0000024100" & Validate the Sold To 
   
   
@ProfileMaskingTC08
 Scenario: Verify the User Profile Masking at Ship To level Create Mask
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter "Price & Profile Masking" in AppLauncher & open it
   And Click on Profile Masking & go to Next
   And Click on User Profile Masking & go to Next
   And Enter First Name as "Amy"
   And Click on Search
   And Click on Gear icon for any of the Contact
   And Click on Gear icon for any of the Sold To
   And Select Create Mask Check box for any Ship To & click on Save button
   And Global Search the Contact "Amy Adamo" and open it
   And Click on Log in to Experience as User button in contact
   And Click on Create Case button & create Technical Case
   And Enter Sold To in Case creation "0000024100" & Validate the Sold To
   
   
@ProfileMaskingTC09
 Scenario: Verify the User Profile Masking at Ship To level View Mask
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter "Price & Profile Masking" in AppLauncher & open it
   And Click on Profile Masking & go to Next
   And Click on User Profile Masking & go to Next
   And Enter First Name as "Amy"
   And Click on Search
   And Click on Gear icon for any of the Contact
   And Click on Gear icon for any of the Sold To
   And Select View Mask Check box for any Ship To & click on Save button
   And Global Search the Contact "Amy Adamo" and open it
   And Click on Log in to Experience as User button in contact
   And Click Search Query
   And Enter Sold To in Query Search "0000024100" & Validate the Sold To 
   
      
@ProfileMaskingTC10
 Scenario: Verify the Exports Masking Data download for Contact in User Profile Masking
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter "Price & Profile Masking" in AppLauncher & open it
   And Click on Profile Masking & go to Next
   And Click on User Profile Masking & go to Next
   And Enter First Name as "Amy"
   And Click on Search   
   And Click on Download icon for any of the Contact in Export Masking Data column
   
   
@ProfileMaskingTC11
 Scenario: Verify the Exports Masking Data download for Sold To in User Profile Masking
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter "Price & Profile Masking" in AppLauncher & open it
   And Click on Profile Masking & go to Next
   And Click on User Profile Masking & go to Next
   And Enter First Name as "Amy"
   And Click on Search   
   And Click on Download icon for any of the Sold To in Export Masking Data column   
   
@ProfileMaskingTC12
 Scenario: Verify the Customer Profile Masking Search with Sold To
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter "Price & Profile Masking" in AppLauncher & open it
   And Click on Profile Masking & go to Next
   And Click on Customer Profile Masking & go to Next
   And Enter Sold To as "0000024100"
   And Click on Search   
   And Close browser
   
@ProfileMaskingTC13
 Scenario: Verify the Customer Profile Masking Search with Sold To name
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter "Price & Profile Masking" in AppLauncher & open it
   And Click on Profile Masking & go to Next
   And Click on Customer Profile Masking & go to Next
   And Enter Sold To name as "Ingram Micro, Inc."
   And Click on Search     
   And Close browser
   
@ProfileMaskingTC14
 Scenario: Verify the Customer Profile Masking at Sold To level Create Mask 
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter "Price & Profile Masking" in AppLauncher & open it
   And Click on Profile Masking & go to Next
   And Click on Customer Profile Masking & go to Next
   And Enter Sold To as "0000024100"
   And Click on Search    
   And Select Create Mask Check box for Sold To & click on Save button
   And Global Search the Contact "Amy Adamo" and open it
   And Click on Log in to Experience as User button in contact
   And Click on Create Case button & create Technical Case
   And Enter Sold To in Case creation "0000024100" & Validate the Sold To
   
   
@ProfileMaskingTC15
 Scenario: Verify the Customer Profile Masking at Sold To level View Mask 
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter "Price & Profile Masking" in AppLauncher & open it
   And Click on Profile Masking & go to Next
   And Click on Customer Profile Masking & go to Next
   And Enter Sold To as "0000024100"
   And Click on Search    
   And Select View Mask Check box for Sold To & click on Save button
   And Global Search the Contact "Amy Adamo" and open it
   And Click on Log in to Experience as User button in contact
   And Click Search Query
   And Enter Sold To in Query Search "0000024100" & Validate the Sold To
   
   
   @ProfileMaskingTC16
 Scenario: Verify the Customer Profile Masking at Ship To level Create Mask 
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter "Price & Profile Masking" in AppLauncher & open it
   And Click on Profile Masking & go to Next
   And Click on Customer Profile Masking & go to Next
   And Enter Sold To as "0000024100"
   And Click on Search    
   And Select Create Mask Check box for Ship To & click on Save button
   And Global Search the Contact "Amy Adamo" and open it
   And Click on Log in to Experience as User button in contact
   And Click on Create Case button & create Technical Case
   And Enter Sold To in Case creation "0000024100" & Validate the Sold To
   
   
@ProfileMaskingTC17
 Scenario: Verify the Customer Profile Masking at Ship To level View Mask 
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter "Price & Profile Masking" in AppLauncher & open it
   And Click on Profile Masking & go to Next
   And Click on Customer Profile Masking & go to Next
   And Enter Sold To as "0000024100"
   And Click on Search    
   And Select View Mask Check box for Ship To & click on Save button
   And Global Search the Contact "Amy Adamo" and open it
   And Click on Log in to Experience as User button in contact
   And Click Search Query
   And Enter Sold To in Query Search "0000024100" & Validate the Sold To
   
@ProfileMaskingTC18
 Scenario: Verify the the Exports Masking Data download for Sold To in User Profile Masking
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter "Price & Profile Masking" in AppLauncher & open it
   And Click on Profile Masking & go to Next
   And Click on Customer Profile Masking & go to Next
   And Enter Sold To as "0000024100"
   And Click on Search
   And Click on Download icon for any of the Sold To in Export Masking Data column
   
      