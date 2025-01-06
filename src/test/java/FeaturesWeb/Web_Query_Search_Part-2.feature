Feature: R4C Query search


@Regression1
 Scenario: Verify the Query Search using Service type as Technical & Remedy as NPR-Credit & Return Reason as Warranty Service/Software - NPR-Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Technical
   And Select Remedy as NPR-Credit
   And Select Return Reason as Warranty Service/Software - NPR-Credit 
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Technical & Remedy & Return Reason for the case
   Then Validate NPRCredit Remedy 
   And Close browser
   
@Regression2
 Scenario: Verify the Query Search using Service type as Technical & Remedy as NPR-Credit & Return Reason as Failed at Customer Factory Site - NPR-Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Technical
   And Select Remedy as NPR-Credit
   Then Select Return Reason as Faild At End Customer NPR-Credit
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Technical & Remedy & Return Reason for the case
   Then Validate NPRCredit Remedy 
   And Close browser
   
   
 @Regression3
 Scenario: Verify the Query Search using Service type as Technical & Remedy as NPR-Credit & Return Reason as Failed at End Customer - NPR-Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Technical
   And Select Remedy as NPR-Credit
   Then Select Return Reason as Faild End customer
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Technical & Remedy & Return Reason for the case
   Then Validate NPRCredit Remedy 
   And Close browser
   
@Regression4
 Scenario: Verify the Query Search using Service type as Stock Rotation & Remedy as Credit & Return Reason as Promotional Stock Rotation - Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Stock Rotation
   #And Select Remedy as Credit
   Then Select Return Reason as Promotional Stock Rotation
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Stock Rotation & Remedy & Return Reason for the case
   Then Validate Credit Remedy 
   And Close browser
   
   
   @Regression5
 Scenario: Verify the Query Search using Service type as Stock Rotation & Remedy as Credit & Return Reason as Standard Stock Rotation - Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Stock Rotation
   #And Select Remedy as Credit
   Then Select Return Reason as Standard Stock Rotation
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Stock Rotation & Remedy & Return Reason for the case
   Then Validate Credit Remedy 
   And Close browser
   
   
   
   @Regression6
 Scenario: Verify the Query Search using Service type as Admin & Remedy as Credit & Return Reason as Duplicate Order - Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Admin
   #And Select Remedy as Credit
   Then Select Return Reason as Duplicate Order
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Admin & Remedy & Return Reason for the case
   And Close browser
   
@Regression7
 Scenario: Verify the Query Search using Service type as Admin & Remedy as Credit & Return Reason as Incorrect Labeling - Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Admin
   #And Select Remedy as Credit
   Then Select Return Reason as incorrect labeling
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Admin & Remedy & Return Reason for the case
   And Close browser
   
   @Regression8
 Scenario: Verify the Query Search using Service type as Admin & Remedy as Credit & Return Reason as Mixed Product- Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Admin
   #And Select Remedy as Credit
    Then Select Return Reason as Mixed product
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Admin & Remedy & Return Reason for the case
   And Close browser
   
@Regression9
 Scenario: Verify the Query Search using Service type as Admin & Remedy as Credit & Return Reason as Overship- Credit   Given User Launch Chrome browser
  Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Admin
   #And Select Remedy as Credit
   Then Select Return Reason as Overship
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Admin & Remedy & Return Reason for the case
   Then Validate Credit Remedy 
   And Close browser
   
   
   
@Regression10
 Scenario: Verify the Query Search using Service type as Admin & Remedy as Credit & Return Reason as Sample- Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Admin
   #And Select Remedy as Credit
    Then Select Return Reason as Sample
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Admin & Remedy & Return Reason for the case
   Then Validate Credit Remedy 
   And Close browser
 
@Regression11
 Scenario: Verify the Query Search using Service type as Admin & Remedy as Credit & Return Reason as Shortship- Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Admin
   #And Select Remedy as Credit
   Then Select Return Reason as Shortship
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Admin & Remedy & Return Reason for the case
   Then Validate Credit Remedy 
   And Close browser
   
    @Regression12
 Scenario: Verify the Query Search using Service type as Admin & Remedy as Credit & Return Reason as Wrong Destination - Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Admin
   #And Select Remedy as Credit
    Then Select Return Reason as Wrong Destination
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Admin & Remedy & Return Reason for the case
   Then Validate Credit Remedy
   And Close browser
   
    @Regression13
 Scenario: Verify the Query Search using Service type as Admin & Remedy as Credit & Return Reason as Wrong Product - Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Admin
   #And Select Remedy as Credit
    Then Select Return Reason as Wrong product
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Admin & Remedy & Return Reason for the case
   Then Validate Credit Remedy
   And Close browser
   
@Regression14
 Scenario: Verify the Query Search using Service type as Admin & Remedy as Credit & Return Reason as Wrong Ship Date - Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Admin
   #And Select Remedy as Credit
    Then Select Return Reason as Wrong Ship date
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Admin & Remedy & Return Reason for the case
  Then Validate Credit Remedy
   And Close browser
   
   
    @Regression15
 Scenario: Verify the Query Search using Service type as Admin & Remedy as Credit & Return Reason as Lost Shipment - Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Admin
   #And Select Remedy as Credit
   Then Select Return Reason as Lost Shipment
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Admin & Remedy & Return Reason for the case
   Then Validate Credit Remedy
   And Close browser
   
    @Regression16
 Scenario: Verify the Query Search using Service type as Admin & Remedy as Credit & Return Reason as Damage In Transit - Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Admin
   #And Select Remedy as Credit
    Then Select Return Reason as Damage in Transit
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Admin & Remedy & Return Reason for the case
   Then Validate Credit Remedy
   And Close browser
   
   
@Regression17
 Scenario: Verify the Query Search using Service type as Exception & Remedy as Credit & Return Reason as Exception Return - Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Exception
   And Select Remedy as Credit
   Then Select Return Reason as Exception return
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Exception & Remedy & Return Reason for the case
   Then Validate Credit Remedy
   And Close browser
   
@Regression18
 Scenario: Query search2
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Exception
   And Select Remedy as Credit
   Then Select Return Reason as GRL Exception
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Exception & Remedy & Return Reason for the case
   Then Validate Credit Remedy
   And Close browser
   
@Regression19
Scenario: Verify the Query Search using Service type as Exception & Remedy as Credit & Return Reason as GRL Exception - Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Exception
   And Select Remedy as Credit
   Then Select Return Reason as Quarterly Exception
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Exception & Remedy & Return Reason for the case
   Then Validate Credit Remedy
   And Close browser
   
@Regression20
 Scenario: Verify the Query Search using Service type as Exception & Remedy as NPR-Credit & Return Reason as GRL Exception - NPR-Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Exception
   And Select Remedy as NPR-Credit
   Then Select Return Reason as GRL Exception NPR Credit
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Exception & Remedy & Return Reason for the case
   Then Validate NPRCredit Remedy
   And Close browser
   
   
@Regression21
 Scenario: Verify the Query Search using Service type as Quality & Remedy as Credit & Return Reason as FAC - Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Quality
   And Select Remedy as Credit
   Then Select Return Reason as FAC Credit
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Quality & Remedy & Return Reason for the case
   Then Validate Credit Remedy
   And Close browser
   
@Regression22
 Scenario: Verify the Query Search using Service type as Quality & Remedy as Credit & Return Reason as QAN/MRB - Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Quality
    And Select Remedy as Credit
     Then Select Return Reason as QAN Credit
   And Click Search button
   And Click on RMA Number hyperlink
    Then Check the Service type Quality & Remedy & Return Reason for the case
   Then Validate Credit Remedy
   And Close browser
   
@Regression23
 Scenario: Verify the Query Search using Service type as Quality & Remedy as NPR-Credit & Return Reason as QAN/MRB - NPR-Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Quality
   And Select Remedy as NPR-Credit
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Quality & Remedy & Return Reason for the case
   Then Validate NPRCredit Remedy
   And Close browser
   
@Regression24
 Scenario: Verify the Query Search using Service type as Miscellaneous & Remedy as Credit & Return Reason as Discontinued - Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Miscllaneous
   And Select Remedy as Credit
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Miscellaneous & Remedy & Return Reason for the case
   Then Validate Credit Remedy
   And Close browser
   
@Regression25
 Scenario: Verify the Query Search using Service type as Miscellaneous & Remedy as Return Only & Return Reason as Free of Charge Sample - Return Only
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service type as Miscllaneous
   And Select Remedy as Return Only
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check the Service type Miscellaneous & Remedy & Return Reason for the case
   And Close browser
   
@Regression26
 Scenario: Verify the Query Search using Case status as Open Unsubmitted
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Click on Case status
   Then Select Case status Open Unsubnitted
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check case Status as Open Unsubnitted
   And Close browser
   
   
@Regression27
 Scenario: Verify the Query Search using Case status as Pending Approval
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Click on Case status
   Then Select Case status Pending Approval
   And Click Search button
   And Click on RMA Number hyperlink
   
@Regression28p
 Scenario: Verify the Query Search using Case status as Customer Action Required
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Click on Case status
   Then Select Case status Customer action require
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check case Status as Customer action require
   And Close browser
   
@Regression29
 Scenario: Verify the Query Search using Case status as Open Authorized 
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Click on Case status
   And Select Case status Open Authorized
   And Click Search button
   And Click on RMA Number hyperlink
   
    @Regression30
 Scenario: Verify the Query Search using Case status as Cancelled
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Click on Case status
   And Select Case status cancelled 
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check case Status as cancelled
   And Close browser
   
@Regression31
 Scenario: Verify the Query Search using Case status as Declined
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Click on Case status
   And Select Case status Declined
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check case Status as Declined
   And Close browser
   
@Regression32
 Scenario: Verify the Query Search using Case status as Closed
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Click on Case status
   And Select Case status closed
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check case Status as closed
   And Close browser
   
   
@Regression33
 Scenario: Verify the Query Search using Case line status as Open Unsubmitted
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   Then Click on Case Line
   And Select Case Line Open Unsubmitted
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check case Status as Open Unsubnitted
   And Close browser
   
  @Regression34
 Scenario:Verify the Query Search using Case line status as Pending Approval
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   Then Click on Case Line
   And Select Case Line Pending Approval
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check case Status as Pending Approval
    And Close browser
   
   
     @Regression35
 Scenario: Verify the Query Search using Case line status as Cancelled
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   Then Click on Case Line
   And Select Case Line Cancelled
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check case Status as Cancelled
    And Close browser
 
   
   
@Regression36
 Scenario: Verify the Query Search using Case line status as Customer Action Required
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   Then Click on Case Line
   And Select Case Line Customer Action require
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check case Status as Customer Action require
    And Close browser
   
@Regression37
 Scenario: Verify the Query Search using Case line status as Credited
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   Then Click on Case Line
   And Select Case Line Open Credited
   And Click Search button
   And Click on RMA Number hyperlink
  
   
@Regression38
 Scenario: Verify the Query Search using Case line status as Auto-Closed
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   Then Click on Case Line
   And Select Case Line Auto Closed
   And Click Search button
   And Click on RMA Number hyperlink
    Then Check case Status as Auto Closed
   And Close browser
   
@Regression39
 Scenario: Verify the Query Search using Case line status as Reject Scrap
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   Then Click on Case Line
   And Select Case Line Reject Scrap
   And Click Search button
   And Click on RMA Number hyperlink
   And Click On Show More button
   
   @Regression40
 Scenario: Verify the Query Search using Case line status as Reject Ship to Customer
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   Then Click on Case Line
   And Select Case Line Reject Ship to Customer
   And Click Search button
   And Click on RMA Number hyperlink
   
   
   @Regression41
 Scenario: Verify the Query Search using Case line status as Complete
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   Then Click on Case Line
   And Select Case line complete
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check case Status as closed
   And Close browser
   
@Regression42
 Scenario: Verify the Query Search using Case line status as In Transit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   Then Click on Case Line
   And Select Case Line In Transit
   And Click Search button
   And Click on RMA Number hyperlink
   
@Regression43
 Scenario:Verify the Query Search using Case line status as Receiving In Progress
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   Then Click on Case Line
   And Select Case Line Receiving in Progress
   And Click Search button
   And Click on RMA Number hyperlink
   
@Regression44
 Scenario: Verify the Query Search using Case line status as Discrepant
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   Then Click on Case Line
   And Select Case Line Discrepant
   And Click Search button
   And Click on RMA Number hyperlink
   
   
@Regression45
 Scenario: Verify the Query Search using Case line status as Received
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   Then Click on Case Line
   And Select Case Line Received
   And Click Search button
   And Click on RMA Number hyperlink
   
@Regression46
 Scenario: Verify the Query Search using Case line status as Declined
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   Then Click on Case Line
   And Select Case Line Declined
   And Click Search button
   And Click on RMA Number hyperlink
   Then Check case Status as Declined
   And Close browser
   
   @Regression77
Scenario: Verify the Query Search using Contact type as Sold To 
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And click on contact type
   And Select contact type sold to
   And Enter Email Address into fields
   And Click Search button
   And Click on RMA Number hyperlink
   
     @Regression78
Scenario: Verify the Query Search using Contact type as Ship To 
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And click on contact type
   And Select contact type Ship to
   And Enter Email Address into fields
   And Click Search button
   And Click on RMA Number hyperlink
   
   @Regression79
Scenario: Verify the Query Search using Contact type as Collection
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And click on contact type
   And Select contact type Collection
   And Enter Email Address into fields
   And Click Search button
   And Click on RMA Number hyperlink
   
@Regression80
Scenario: Verify the Query Search using Contact type as customer
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And click on contact type
   And Select contact type customer
   And Enter Email Address into fields
   And Click Search button
   And Click on RMA Number hyperlink
   
@Regression47
Scenario: Verify the Query Search using Bulk Upload with RMA Numbers
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Click On Bulk  Upload button and Upload RMA File
   And Click Search button
   And Click on RMA Number hyperlink
   
@Regression48
Scenario: Verify the Query Search using Bulk Upload with Unit Level Traceability (ULT's)
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Click On Bulk  Upload button and Upload ULTs File
   And Click Search button
   And Click on RMA Number hyperlink
   
   @Regression49
Scenario: Verify the Query Search using Bulk Upload with Products as MMID's
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Click On Bulk  Upload button and Upload MMIDs File
   And Click Search button
   And Click on RMA Number hyperlink
   
   @Regression50
Scenario: Verify the Query Search using Bulk Upload with Products as CPN's
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Click On Bulk  Upload button and Upload CPNs File
   And Click Search button
   And Click on RMA Number hyperlink
   
   
   @Regression51
Scenario: Verify the Query Search using Bulk Upload with Contact Emails
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Click On Bulk  Upload button and Upload Contacts Email File
   And Click Search button
   And Click on RMA Number hyperlink
   
    
@Regression52
Scenario: Verify the Query Search using Bulk Upload with RMA Numbers & Contact Emails
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Click On Bulk  Upload button and Upload Contacts Email&RMA File
   And Click Search button
   And Click on RMA Number hyperlink
   
   
@Regression53
Scenario: Verify the Query Search using Bulk Upload with Unit Level Traceability (ULT) & Product as MMID
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Click On Bulk  Upload button and Upload ULTs&MMIDs File
   And Click Search button
   And Click on RMA Number hyperlink
   
   
@Regression54
Scenario: Verify the Query Search using Bulk Upload with Unit Level Traceability (ULT) & Product as CPN
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Click On Bulk  Upload button and Upload ULTS&CPN File
   And Click Search button
   And Click on RMA Number hyperlink
   
@RegressionQW
Scenario: Verify the Query Search using Bulk Upload with Unit Level Traceability (ULT) & Product as CPN
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And click on contact type
   And Select contact type sold to
   And Enter Email Address into fields
   And Click Search button
   And Click on RMA Number hyperlink
   
   