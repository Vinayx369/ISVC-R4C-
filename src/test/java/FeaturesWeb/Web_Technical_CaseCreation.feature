Feature: R4C Technical Case Creation

@TestCaseWTRCCNo1
@SanitySRCC
 Scenario: Verify the Case creation for Service Type as Stock Rotation & Return Reason as Standard Stock Rotation with Freight type as CRF using PO Search(Without ULT)
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select Remedy credit and reason
   #And Select Remedy credit and reason Fail Customer End
   #And Select credit
   #When Select Return Reason FCF web
   #And Select return Reason Standard stock rotation
   And Select RCA address first web
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Select Purchase/Sales Order button and Enter PO Number Through Excel
   Then Click on the search button
   And Select All Line items
   And Click on the Next button after All Line Items
   #When Enter ULT IDs
   When Click On Warranty Entitlement Check
   # And Click on PO Change popup Ok button
   And Click on next
   And Clickon PO History check button
   And Click on PO Change popup Ok button
   When Click on Next After PO history check
   When Enter Quantity into All fields through excel
   And Click On Credit price Validation
   #When Select ALL Web
   #And Select All Line items check box
   #And Select First Check box
   #And Enter Credit price All fields
   And Click on the Save and Summary button
   And Click on submit button After Summary
   #And Check RMA status
   #And Print Case No into Console SR
   And Close browser
    
@TestCaseWTRCCNo1.1
@SanitySRCC
 Scenario: Verify the Case creation for Service Type as Stock Rotation & Return Reason as Standard Stock Rotation with Freight type as CRF using PO Search(With ULT)
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select Remedy credit and reason
   #And Select Remedy credit and reason Fail Customer End
   #And Select credit
   #When Select Return Reason FCF web
   #And Select return Reason Standard stock rotation
   And Select RCA address first web
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Select Purchase/Sales Order button and Enter PO Number Through Excel
   Then Click on the search button
   And Select All Line items
   And Click on the Next button after All Line Items
   When Enter ULT IDs
   When Click On Warranty Entitlement Check
   # And Click on PO Change popup Ok button
   And Click on next
   And Clickon PO History check button
   And Click on PO Change popup Ok button
   When Click on Next After PO history check
   When Enter Quantity into All fields through excel
   And Click On Credit price Validation
   #When Select ALL Web
   #And Select All Line items check box
   #And Select First Check box
   #And Enter Credit price All fields
   And Click on the Save and Summary button
   And Click on submit button After Summary
   #And Check RMA status
   #And Print Case No into Console SR
   And Close browser
    
    
@TestCaseWTRCCNo2
@SanitySRCC
 Scenario: Verify the Case creation for Service Type as Technical & Remedy as Credit & Return Reason as Failed at End Customer using SO Search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   #And Select Remedy credit and reason
   And Select Remedy credit and reason Fail Customer End
   #And Select Remedy credit and reason Fail Customer End
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Select Purchase/Sales Order button and Enter SO Number through Excel
   Then Click on the search button
   When Select ALL Web
   And Click on the Next button after All Line Items
   When Click On Warranty Entitlement Check
   And Click on next
   And Clickon PO History check button
   When Click on Next After PO history check
   When Enter Quantity into All fields through excel
   And Click On Credit price Validation
   And Click on the Save and Summary button
   And Click on submit button After Summary
   When Print Case No into Console Web
   And Close browser
    
@TestCaseWTRCCNo3
@SanitySRCC
 Scenario: Verify the Case creation for Service Type as Technical & Remedy as Credit & Return Reason as Technical Sample using MMCPN Bulk Upload
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select Remedy credit and reason Tech Simple
   And Select RCA address first web
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
    And Upload Bulk File Technical MMCPN Bulk Upload ""
   # And Upload Bulk File Technical "C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1).csv""
    And Click On Validate Button
     And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    And Click On Credit price Validation
    And Click on the Save and Summary button
    And Click on submit button After Summary
    #When Print Case No into Console SR Web
   And Close browser
    
@TestCaseWTRCCNo4
@SanitySRCC
 Scenario: Verify the Case creation for Service Type as Technical & Remedy as NPR-Credit & Return Reason as Failed at Customer Factory Site using ULT Bulk Upload
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   When Select NPR reason
   When Select Return Reason FEC web
    And Click on the Next button After Sold To
    And Upload Bulk File "" NPR-Credit
    And Click On Validate Button
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    And Click On Credit price Validation
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Close browser
    
@TestCaseWTRCCNo5
@SanitySRCC
 Scenario: Verify the Case creation for Service Type as Technical & Remedy as NPR-Credit & Return Reason as Failed at End Customer using CPN Search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   When Select NPR reason
   When Select Return Reason FEC web
   And Click on the Next button After Sold To
   And click on Product radio button
   And Select CPN Radio button
   And Enter CPN Number through Excel
   #When Enter CPN Numbervalue "4244594"
    And click on search button
    And Select ALL Web
    #And Select First Item
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    When Enter Quantity into All fields through excel
    And Click On Credit price Validation
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Close browser
   
@TestCaseWTRCCNo6
@SanitySRCC
 Scenario: Verify the Case creation for Service Type as Technical & Remedy as NPR-Credit & Return Reason as Warranty Service/Software using MM Search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   When Select NPR reason
  #When Select Return Reason Warrenty service web
   Then Select Return Reson sample
   And Click on the Next button After Sold To
    And Enter MMIDs By using Excel Sheet
    #When Clickon Product radiobutton and enter MM Number "99APD4"
    And Click on search button after Entering MM Number
    And Select ALL Web
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    When Enter Quantity into All fields through excel
    And Click On Credit price Validation
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Close browser
    
 @TestCaseWTRCCNo8
@SanitySRCC
 Scenario: Verify the Case creation for Service Type as Technical with ULT is mandatory
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   When Select NPR reason
   When Select Return Reason FEC web
   And Click on next
   And Enter MMIDs By using Excel Sheet
    #When Clickon Product radiobutton and enter MM Number "99APD4"
    And Click on search button after Entering MM Number
    And Select ALL Web
    And Click Next button after All Item selection
    When Enter ULT IDs
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
  #When Enter Quantity into All fields through excel
    And Click On Credit price Validation
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Click I Agree Buttion
   And Close browser 
       
 @TestCaseWTRCCNo9
@SanitySRCC
Scenario: Verify the Case creation for Service Type as Technical with ULT is not mandatory
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
  # And Select Remedy credit and reason
   And Select Remedy credit and reason Fail Customer End
   #And Select credit
   #When Select Return Reason FCF web
   #And Select return Reason Standard stock rotation
   And Select RCA address first
   Then Select Fright Type IMF
   When Click Ok button
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Enter MMIDs By using Excel Sheet
    #When Clickon Product radiobutton and enter MM Number "99APD4"
    And Click on search button after Entering MM Number
    And Select ALL Web
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    When Click on Next After PO history check
    When Enter Quantity into All fields through excel
    And Click On Credit price Validation
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Close browser
    
@TestCaseWTRCCNo10
@SanitySRCC
 Scenario: Verify the PO Search functionality
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select Remedy credit and reason
   #And Select Remedy credit and reason Fail Customer End
   #And Select credit
   #When Select Return Reason FCF web
   #And Select return Reason Standard stock rotation
   And Select RCA address first web
   Then Select Fright Type IMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Select Purchase/Sales Order button and Enter PO Number Through Excel
   Then Click on the search button
    
@TestCaseWTRCCNo11
@SanitySRCC
 Scenario: Verify the SO Search functionality
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   #And Select Remedy credit and reason
   And Select Remedy credit and reason Fail Customer End
   #And Select Remedy credit and reason Fail Customer End
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Select Purchase/Sales Order button and Enter SO Number through Excel
   Then Click on the search button
   
@TestCaseWTRCCNo12
@SanitySRCC
 Scenario: Verify the MM Search functionality
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select Remedy credit and reason Fail Customer End
  #When Select Return Reason Warrenty service web
And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on the Next button After Sold To
    And Enter MMIDs By using Excel Sheet
    #When Clickon Product radiobutton and enter MM Number "99APD4"
    And Click on search button after Entering MM Number
    
@TestCaseWTRCCNo13
@SanitySRCC
 Scenario: Verify the CPN Search functionality
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select Remedy credit and reason Fail Customer End
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
    And Click on the Next button After Sold To
    And click on Product radio button
    And Select CPN Radio button
     And Enter CPN Number through Excel
    #When Enter CPN Numbervalue "4244594"
    And click on search button
    
    
    @TestCaseWTRCCNo14
@SanitySRCC
 Scenario: Verify the OPN Search functionality
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select Remedy credit and reason Fail Customer End
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
    And Click on the Next button After Sold To
    And click on Product radio button
    And Click on Order Part Number radio button
   When Enter OPN into search box through excel
   And click on search button 
   And Close browser
   
   
   
@TestCaseWTRCCNo15
@SanitySRCC
 Scenario:Verify the MMCPN Bulk Upload functionality
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select Remedy credit and reason Tech Simple
   And Select RCA address first web
   Then Select Fright Type IMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Upload Bulk File Technical MMCPN Bulk Upload ""
   #And Upload Bulk File Technical "C:\\Users\\oyadavx\\Downloads\\MMCPN_BulkUploadTemplate (1).csv""
   And Click On Validate Button
    
@TestCaseWTRCCNo16
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
   When Select NPR reason
   When Select Return Reason FEC web
    And Click on the Next button After Sold To
    And Upload Bulk File "" NPR-Credit
    And Click On Validate Button
    
 
 @TestCaseWTRCCNo17
@SanitySRCC
 Scenario: Verify the PO History functionality
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   When Select NPR reason
   When Select Return Reason Warrenty service web
    And Click on the Next button After Sold To
     And Enter MMIDs By using Excel Sheet
    #When Clickon Product radiobutton and enter MM Number "99APD4"
    And Click on search button after Entering MM Number
    And Select ALL Web
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
    And Click on next
    And Clickon PO History check button
    
@TestCaseWTRCCNo18
@SanitySRCC
Scenario: Verify the Warranty Entitlement Check functionality without ULT
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select Remedy credit and reason Fail Customer End
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on the Next button After Sold To
   And Enter MMIDs By using Excel Sheet
    #When Clickon Product radiobutton and enter MM Number "99APD4"
    And Click on search button after Entering MM Number
    And Select ALL Web
    And Click Next button after All Item selection
    When Click On Warranty Entitlement Check
  
  
  @TestCaseWTRCCNo19
@SanitySRCC
Scenario: Verify the Warranty Entitlement Check functionality with ULT
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select Remedy credit and reason Fail Customer End
   And Select RCA address first
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on the Next button After Sold To
   And Enter MMIDs By using Excel Sheet
    #When Clickon Product radiobutton and enter MM Number "99APD4"
    And Click on search button after Entering MM Number
    And Select ALL Web
    And Click Next button after All Item selection
    When Enter ULT IDs
    When Click On Warranty Entitlement Check
    
@TestCaseWTRCCNo21
@SanitySRCC
Scenario: Verify the Pending Approval Case creation with >=100K 
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select Remedy credit and reason
   #And Select Remedy credit and reason Fail Customer End
   #And Select credit
   #When Select Return Reason FCF web
   #And Select return Reason Standard stock rotation
   And Select RCA address first web
   Then Select Fright Type IMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
   And Click on next
   And Select Purchase/Sales Order button and Enter PO Number Through Excel
   Then Click on the search button
   And Select All Line items
   And Click on the Next button after All Line Items
   #When Enter ULT IDs
   When Click On Warranty Entitlement Check
   # And Click on PO Change popup Ok button
   And Click on next
   And Clickon PO History check button
   And Click on PO Change popup Ok button
   When Click on Next After PO history check
   When Enter Quantity into All fields through excel
   And Click On Credit price Validation
   #When Select ALL Web
   #And Select All Line items check box
   #And Select First Check box
   #And Enter Credit price All fields
   And Click on the Save and Summary button
   And Click on submit button After Summary
   #And Check RMA status
   #And Print Case No into Console SR
   And Close browser
   
@TestCaseSRCCENo22
@SanitySRCC
Scenario: Verify the Open Unsubmitted status Case Edit for Technical
     Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Create Case button
   And Select Service Type Technical and Click create button enter Sold through Excel file
   And Select All other details
   And Select Ship To contact
   And Select Remedy credit and reason
   #And Select Remedy credit and reason Fail Customer End
   #And Select credit
   #When Select Return Reason FCF web
   #And Select return Reason Standard stock rotation
   And Select RCA address first web
   Then Select Fright Type IMF
   And Select Return customer contact first
   And Select CA Address first
   When select Collection Contact first
    When Click on Save for later button
   # When Print Case No into Console SR Web
    When Click on Edit Button
    And Select Purchase/Sales Order button and Enter PO Number Through Excel
    #And Select Purchase/Sales Order button and Enter PO Number "4511948508"
    Then Click on the search button
    When Select ALL Web
    And Select All Line items
    And Select First Item
    And Click on the Next button after All Line Items
    When Click On Warranty Entitlement Check
    And Click on next
    #When Enter Return Quantity
    When Enter Quantity into All fields through excel
    And Clickon PO History check button
    When Click on Next After PO history check
    When Enter Quantity into All fields through excel
    And Click On Credit price Validation
    And Click on the Save and Summary button
    And Click on submit button After Summary
    And Close browser
    