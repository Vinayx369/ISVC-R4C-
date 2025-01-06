Feature: Case Creation Workflow for Technical Exchange Service Type with Credit Remedy and Specific Return Reason

@TestCaseTECCNo1 
@SanityTECC
Scenario: Verify the Case creation for Service Type as Technical & Remedy as Exchange & Return Reason as Standard Warranty Replacement (SWR)-Technical Line using ULT Search
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type Technical Exchange and Click on Create buttons and enter sold to 
    When Select Remedy credit Exchange
    When Select SWRTL
    And Select CA Address first
     And Click on next
     And select checkbox
     And Enter ULTs from excel
     When Select ALL
     And Click Next button after All Item selection
     When Click On Warranty Entitlement Check
     And Click on the Save and Summary button
     And Click on submit button After Summary
     And Print Case No into Console SR
     And Close browser
     
     
@TestCaseTECCNo2 
@SanityTECC
Scenario: Verify the Case creation for Service Type as Technical & Remedy as Exchange & Return Reason as Standard Warranty Replacement (SWR)-Technical Field using ULT Search
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
   #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical Exchange and Click on Create buttons and enter sold to 
    When Select Remedy credit Exchange
   # When Select SWRTL
    When Select AWRTL
    And Select CA Address first
     And Click on next
     And select checkbox
     And Enter ULTs from excel
     When Select ALL
     And Click Next button after All Item selection
     When Click On Warranty Entitlement Check
     And Click on the Save and Summary button
     And Click on submit button After Summary
     And Print Case No into Console SR
     And Close browser
     
     
@TestCaseTECCNo3
@SanityTECC
Scenario: Verify the Case creation for Service Type as Technical & Remedy as Exchange & Return Reason as Advance Warranty Replacement (AWR)-Technical Line using ULT Search
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
   #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical Exchange and Click on Create buttons and enter sold to 
    When Select Remedy credit Exchange
    When Select SWRTLF
    And Select CA Address first
     And Click on next
     And select checkbox
     And Enter ULTs from excel
     When Select ALL
     And Click Next button after All Item selection
     When Click On Warranty Entitlement Check
     And Click on the Save and Summary button
     And Click on submit button After Summary
     And Print Case No into Console SR
     And Close browser
     
@TestCaseTECCNo4
@SanityTECC
Scenario: Verify the Case creation for Service Type as Technical & Remedy as Exchange & Return Reason as Advance Warranty Replacement (AWR)-Technical Field using ULT Search
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type Technical Exchange and Click on Create buttons and enter sold to 
    When Select Remedy credit Exchange
   When Select AWETF
    And Select CA Address first
     And Click on next
     And select checkbox
     And Enter ULTs from excel
     When Select ALL
     And Click Next button after All Item selection
     When Click On Warranty Entitlement Check
     And Click on the Save and Summary button
     And Click on submit button After Summary
     And Print Case No into Console SR
     And Close browser
@TestCaseTECCNo5
@SanityTECC
Scenario: Verify the Case creation for Service Type as Technical & Remedy as Exchange & Return Reason as Standard Warranty Replacement (SWR)-Technical Line using ULT Bulk Upload
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type Technical Exchange and Click on Create buttons and enter sold to 
    When Select Remedy credit Exchange
   When Select SWRTL
    And Select CA Address first
     And Click on next
     And Upload ULT Bulk File ""
     And Click On Validate Button
     #When Select ALL
     And Click Next button after All Item selection
     When Click On Warranty Entitlement Check
     And Click on the Save and Summary button
     And Click on submit button After Summary
     And Print Case No into Console SR
     And Close browser
     
     
     
     @TestCaseTECCNo6
@SanityTECC
Scenario: Verify the Case creation for Service Type as Technical & Remedy as Exchange & Return Reason as Standard Warranty Replacement (SWR)-Technical Field using ULT Bulk Upload
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
   #And Enter text global and select "Sarah Aggelidis"
    And Click on the New R4C case creation button
    And Select Service Type Technical Exchange and Click on Create buttons and enter sold to 
    When Select Remedy credit Exchange
    When Select SWRTLF
    And Select CA Address first
     And Click on next
     And Upload ULT Bulk File ""
     And Click On Validate Button
     #When Select ALL
     And Click Next button after All Item selection
     When Click On Warranty Entitlement Check
     And Click on the Save and Summary button
     And Click on submit button After Summary
     And Print Case No into Console SR
     And Close browser
     
     
       
@TestCaseTECCNo7
@SanityTECC
Scenario: Verify the Case creation for Service Type as Technical & Remedy as Exchange & Return Reason as Advance Warranty Replacement (AWR)-Technical Line using ULT Bulk Upload
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type Technical Exchange and Click on Create buttons and enter sold to 
    When Select Remedy credit Exchange
    When Select AWRTL
    And Select CA Address first
     And Click on next
     And Upload ULT Bulk File ""
     And Click On Validate Button
    # When Select ALL
     And Click Next button after All Item selection
     When Click On Warranty Entitlement Check
     And Click on the Save and Summary button
     And Click on submit button After Summary
     And Print Case No into Console SR
     And Close browser
     
     
@TestCaseTECCNo8
@SanityTECC
Scenario: Verify the Case creation for Service Type as Technical & Remedy as Exchange & Return Reason as Advance Warranty Replacement (AWR)-Technical Field using ULT Bulk Upload
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type Technical Exchange and Click on Create buttons and enter sold to 
    When Select Remedy credit Exchange
   When Select AWETF
    And Select CA Address first
     And Click on next
     And Upload ULT Bulk File ""
     And Click On Validate Button
    # When Select ALL
     And Click Next button after All Item selection
     When Click On Warranty Entitlement Check
     And Click on the Save and Summary button
     And Click on submit button After Summary
     And Print Case No into Console SR
     
@TestCaseTECCNo9
@SanityTECC
Scenario: Verify the ULT Search functionality
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type Technical Exchange and Click on Create buttons and enter sold to 
    When Select Remedy credit Exchange
    When Select SWRTL
    And Select CA Address first
    And Click on next
    And select checkbox
    And Enter ULTs from excel
    When Select ALL
     
@TestCaseTECCNo10
@SanityTECC
Scenario: Verify the ULT Bulk Upload functionality
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type Technical Exchange and Click on Create buttons and enter sold to 
    When Select Remedy credit Exchange
    When Select SWRTL
    And Select CA Address first
     And Click on next
     And Upload ULT Bulk File ""
     And Click On Validate Button
     
     
@TestCaseTECCNo11
@SanityTECC
Scenario: Verify the Warranty Entitlement Check functionality
    Given User Launch Chrome browser
    When User open URL
    Then User Enter Email Address and pass PassWord
    And Click on login
    And Enter text global excel
    And Click on the New R4C case creation button
    And Select Service Type Technical Exchange and Click on Create buttons and enter sold to 
    When Select Remedy credit Exchange
    When Select SWRTL
    And Select CA Address first
     And Click on next
     And select checkbox
     And Enter ULTs from excel
     When Select ALL
     And Click Next button after All Item selection
     When Click On Warranty Entitlement Check
     
     
@TestCaseTECCNo12
@SanityQCE
Scenario: Verify the Case Edit functionality
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter text global and select "Sarah Aggelidis"
   And Click on Related option
   When Click on View All cases option
   And Click On FilterIcon
   When Enter Case No into text field through excel
   And Click On Apply button
   And Select searched case
   And Click On Edit Option
   And click accelept
   #And click accelept
   #And Click On Edit Option
   And Click on submit button After Summary 
  
@TestCaseTECCNo13
@SanityQCE
Scenario: Verify the Case Edit functionality
  Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login 
   And Enter Case text global and select
   And Click On Edit Option
   And click accelept
  And Enter R4E Number
 And Click on submit button After Summary
   
     