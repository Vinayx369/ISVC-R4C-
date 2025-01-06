Feature: R4C Technical Case Creation

@TestCaseWTECCNo1
@SanitySRCC
 Scenario: Verify the Case creation for Service Type as Technical & Remedy as Exchange & Return Reason as Standard Warranty Replacement (SWR)-Technical Line using ULT Search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   When Select Remedy credit and Technical Exchange
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
   And Close browser
     
@TestCaseWTECCNo2
@SanitySRCC
 Scenario: Verify the Case creation for Service Type as Technical & Remedy as Exchange & Return Reason as Standard Warranty Replacement (SWR)-Technical Field using ULT Search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   When Select Remedy credit and Technical Exchange
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
     And Close browser
     
@TestCaseWTECCNo3
@SanitySRCC
 Scenario: Verify the Case creation for Service Type as Technical & Remedy as Exchange & Return Reason as Advance Warranty Replacement (AWR)-Technical Line using ULT Search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   When Select Remedy credit and Technical Exchange
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
     And Close browser
     
@TestCaseWTECCNo4
@SanitySRCC
 Scenario: Verify the Case creation for Service Type as Technical & Remedy as Exchange & Return Reason as Advance Warranty Replacement (AWR)-Technical Field using ULT Search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   When Select Remedy credit and Technical Exchange
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
     And Close browser
     
     
@TestCaseWTECCNo5
@SanitySRCC
 Scenario: Verify the Case creation for Service Type as Technical & Remedy as Exchange & Return Reason as Standard Warranty Replacement (SWR)-Technical Line using ULT Bulk Upload
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   When Select Remedy credit and Technical Exchange
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
     And Close browser
     
     
@TestCaseWTECCNo6
@SanitySRCC
 Scenario: Verify the Case creation for Service Type as Technical & Remedy as Exchange & Return Reason as Standard Warranty Replacement (SWR)-Technical Field using ULT Bulk Upload
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   When Select Remedy credit and Technical Exchange
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
     And Close browser
     
     
@TestCaseWTECCNo7
@SanitySRCC
 Scenario: Verify the Case creation for Service Type as Technical & Remedy as Exchange & Return Reason as Advance Warranty Replacement (AWR)-Technical Line using ULT Bulk Upload
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   When Select Remedy credit and Technical Exchange
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
     And Close browser
     
     
     
@TestCaseWTECCNo8
@SanitySRCC
 Scenario: Verify the Case creation for Service Type as Technical & Remedy as Exchange & Return Reason as Advance Warranty Replacement (AWR)-Technical Line using ULT Bulk Upload
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   When Select Remedy credit and Technical Exchange
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
     And Close browser
     
     
@TestCaseWTECCNo9
@SanitySRCC
 Scenario: Verify the ULT Search functionality
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   When Select Remedy credit and Technical Exchange
  When Select SWRTL
   And Select CA Address first
   And Click on next
   And select checkbox
   And Enter ULTs from excel
   When Select ALL
    And Close browser
    
@TestCaseWTECCNo10
@SanitySRCC
 Scenario: Verify the ULT Bulk Upload functionality
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   When Select Remedy credit and Technical Exchange
   When Select SWRTL
   And Select CA Address first
   And Click on next
   And Upload ULT Bulk File ""
   And Click On Validate Button
    And Close browser
     
@TestCaseWTECCNo11
@SanitySRCC
 Scenario: Verify the Warranty Entitlement Check functionalityC:\Users\oyadavx\git\Intel_ISVC_R4C\Intel_ISVC_R4C\src\test\java\TestData\Technical Exchange Upload File\ULT_BuilkTechnicalExchange.csv
 
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   When Select Remedy credit and Technical Exchange
  When Select SWRTL
   And Select CA Address first
   And Click on next
   And select checkbox
   And Enter ULTs from excel
   When Select ALL
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
    And Close browser
     