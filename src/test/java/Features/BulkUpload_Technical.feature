Feature: BulkUpload
Background:
   Given User Launch Chrome browser
   When User open URL 
   Then User Enter Email Address and pass PassWord
   And Click on login

 Scenario: Verify the ULT Bulk Upload functionality(Useing Two excel Sheet) 
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold through Excel
   And Select Remedy credit
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Upload Bulk File "C:\\Users\oyadavx\\OneDrive - Intel Corporation\\Desktop\\ULT Bulk Upload Sheet\\ULT_BulkUploadTemplate (3).csv" ULT
   And Click On Validate Button
   When Click on Next After PO history check
   When Click On Warranty Entitlement Check
   When Click on Next After PO history check
   And Print Active MM Ids into console
   And Clickon PO History check button
    And Click Next button After PO     
    And Click On Credit price Validation
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Check RMA status
    And Print Case No into Console
   
 
Scenario: Verify the MMIDs-ULT Bulk Upload functionality with case creation 
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold through Excel
   And Select Remedy credit and reason Fail Customer End 
      And Select Ship To contact
   And Select RCA address
   And Select Return customer contact
   And Select CA Address
   When select Collection Contact
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number 
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Enter ULT IDs
    When Click On Warranty Entitlement Check
    And Validate the Status
    And Click Ok button 
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    And Click On Credit price Validation
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Check RMA status
    
    
@ScenarioNo-1
Scenario: Verify the MMIDs-ULT(Mandatory)IMF Bulk Upload functionality with case creation 
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold through Excel
   And Select Remedy credit and reason Fail Customer End 
   And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number 
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Enter ULT IDs
    When Click On Warranty Entitlement Check
    And Validate the Status
    And Click Ok button 
    And Click on next
    And Print Active MM Ids into console
    And Clickon PO History check button
    When Click on Next After PO history check
    And Click On Credit price Validation
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Check RMA status
    And Print Case No into Console
    
    
@ScenarioNo-2
Scenario: Verify the MMIDs-ULT(ULT NotMandatory)IMF Bulk Upload functionality with case creation 
   And Enter text global excel
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter Sold through Excel
   And Select Remedy credit and reason Fail Customer End 
  And Select Ship To contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number 
   And Click Next button after All Item selection
  # And Enter ULT IDs
   When Click On Warranty Entitlement Check
   And Click Next button after All Item selection
    And Clickon PO History check button
    And Click Next button After PO     
    And Enter Quantity into All fields
    And Click Next button After PO     
    And Click On Credit price Validation
    And Enter Price Into All Fields
    And Enter Reason into All Fields
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Check RMA status
    And Print Case No into Console
    
@ScenarioNo-3    
@POC_TCNO-1  
Scenario Outline: Verify the MMIDs-(ULT-Not-Mandatory)IMF Bulk Upload functionality with case creation with multiple data sets
   And Enter text global "<ContactName>"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter "<SoldToNumber>"
   And Select Remedy credit and reason Fail Customer End 
   And Select Ship To contact
   And Select Sold To Contact
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
    And Enter MMIDs "<MMID>"
   And Click on search button after Entering MM Number 
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Click Next button after All Item selection
    And Clickon PO History check button
    And Click Next button After PO     
    And Enter Quantity into All fields
   # And Click Next button After PO     
    And Click On Credit price Validation
    And Enter Price Into All Fields
    And Enter Reason into All Fields
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Check RMA status
    And Print Case No into Console

 Examples:
  | ContactName          | SoldToNumber  | MMID                                              | ULT|PO|SO|OPN|CPN|CIRS|
  | Sarah Aggelidis      | 6006683685    | 99C6A3,99C6A7,99C4X0,99C4XD,99C4XK                |    |  |   |  |   |    |      
 #| Neetha Bhavana       |6100083674     |99AH6A,925133,99A038,948141,99AG49                 |
 #| Amy Adamo            | 000024100     | 99CFXV,999C38                                     |                                                                    
 #| Peter Lin            | 6100080611    | 999C38,999C39,99C5KG,99C5KG,999C38                |



@ScenarioNo-4
@highpriority
Scenario Outline: Verify the MMIDs-ULT(Mandatory)IMF Bulk Upload functionality with case creation with multiple data sets
   And Enter text global "<ContactName>"
   And Click on the New R4C case creation button
   And Select Service Type Technical and Click on Create buttons and Enter "<SoldToNumber>"
   And Select Remedy credit and reason Fail Customer End 
   And Select Ship To contact
   And Select RCA address first
   And Select Fright Type IMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs "<MMID>"
   #And Enter MMIDs By using Excel Sheet
   And Click on search button after Entering MM Number 
   And Click Next button after All Item selection
   When Click On Warranty Entitlement Check
   And Enter ULT IDs
   And Click Next button after All Item selection
   And Clickon PO History check button
   And Click Next button After PO     
   And Enter Quantity into All fields
   And Click On Credit price Validation
   And Click Next button After PO     
    And Click On Credit price Validation
    And Enter Price Into All Fields
    And Enter Reason into All Fields
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Check RMA status
    And Print Case No into Console

 Examples:
 | ContactName        | SoldToNumber  | MMID                                                |    ULts                       |
#| Sarah Aggelidis    | 6006683685    | 99A3P3,961251,99A3P9,911295,956542,99AJR4           |     excel                     |     
 | Amy Adamo          | 000024100     | 99CFXV                                              |                               |                                                      
 #| Peter Lin         | 6100080611    | 99C6W4,999C38,957279                                |                               |                                                      
 #| Lior Einav        |6100070362     | 972678,973757,968229,968229,972477,972477           |                               |                                                                            