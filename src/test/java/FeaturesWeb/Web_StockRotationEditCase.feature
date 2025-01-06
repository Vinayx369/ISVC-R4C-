Feature: R4C Case Edit

@TestCaseSRCCENo1
@SanitySRCC
Scenario: Verify the Save for Later functionality in Request Header details
    Given User Launch Chrome browser
    When User open URL Web
    Then User Enter Email Address and pass PassWord Encripted
    And Click on login
    And Click Create Case button
    #And Select Service Type Technical and Click create button enter Sold through Excel file
    And Select Service Type SR and Click create button enter Sold through Excel file for portal
    And Select All other details
    And Select Ship To contact
    And Select credit
    And Select return Reason Standard stock rotation
    And Select RCA address first web
    And Select Return customer contact first
    And Select CA Address first
    When select Collection Contact first
    When Click on Save for later button
    When Print Case No into Console Web
    When Click on Edit Button
    And Select Purchase/Sales Order button and Enter PO Number Through Excel
    #And Select Purchase/Sales Order button and Enter PO Number "4511948508"
    Then Click on the search button
    When Select ALL Web
    #And Select All Line items
    #And Select First Item
    And Click on the Next button after All Line Items
    And Click on Product Validation and Next button
    #When Enter Return Quantity
    When Enter Quantity into All fields through excel
    And Click on the Get credit price
    And Click on the Next button After credit Price
    And Enter Credit price All fields
    And Click on the Next button After Credit
    And Click on the Validate Allowance
    And Click on the Save and Summary button
    And Click on submit button After Summary
    #When Print Case No into Console SR Web
    Then User can view Case creation Popup message
    And Click on the Submit button
    Then User can view Successful message
    And Close browser
   
   