Feature: R4C Query Product and Warrenty
@Regression1
 Scenario: Verify the Query Search for product using MM at product & Warranty information
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click on Product and Warrenty option
   And Enter Sold To through excel sheet
   And Enter MMIDs Into Fields
   And Click Search button
  # And Validate Valid data should disply
  And Close browser
   
  
@Regression2
 Scenario: Verify the Query Search for product using CPN at product & Warranty information
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click on Product and Warrenty option
   And Enter Sold To through excel sheet
   And Enter CPN Into Fields
   And Click Search button
  # And Validate Valid data should disply
  And Close browser
   
  
    @Regression3
 Scenario: Verify the Query Search for product using OPN at product & Warranty information
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click on Product and Warrenty option
   And Enter Sold To through excel sheet
   And Enter OPN Into Fields
   And Click Search button
  # And Validate Valid data should disply
  And Close browser
   
  
@Regression4
 Scenario: Verify the Query Search for product using Product Code at product & Warranty information
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click on Product and Warrenty option
   And Enter Sold To through excel sheet
   And Enter Product code Into Fields
   And Click Search button
  # And Validate Valid data should disply
  And Close browser
   
  
@Regression5
 Scenario: Verify the Query Search for Unit Level Traceability  at product & Warranty information Using Bulkuplaod with Service type as Technical - Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click on Product and Warrenty option
   And Click on ULT radio button
   And Enter Sold To through excel sheet
  And Select Service Type technical
  And Select Remedy Credit
  And Select Return Reasons
  And Click On Upload File button
  And Click Search button
  # And Validate Valid data should disply
  And Close browser
   
  
  @Regression6
 Scenario: Verify the Query Search for Unit Level Traceability  at product & Warranty information Using Bulkuplaod with Service type as Technical - NPR-Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click on Product and Warrenty option
   And Click on ULT radio button
   And Enter Sold To through excel sheet
  And Select Service Type technical
  And Select Remedy  NPR-Credit
  And Select Return Reasons
  And Click On Upload File button
  And Click Search button
  And Close browser
   
  
  @Regression7
 Scenario: Verify the Query Search for Unit Level Traceability  at product & Warranty information Using Product Unique Identifier with Service type as Quality-  Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click on Product and Warrenty option
   And Click on ULT radio button
   And Enter Sold To through excel sheet
  And Select Service Type Quality
  And Select Remedy Credit
  And Select Return Reasons
    And Click On Upload File button
  And Click Search button
  And Close browser
   
  
   @Regression8
 Scenario: Verify the Query Search for Unit Level Traceability  at product & Warranty information Using Product Unique Identifier with Service type as Quality-  NPRCredit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click on Product and Warrenty option
   And Click on ULT radio button
   And Enter Sold To through excel sheet
  And Select Service Type Quality
   And Select Remedy  NPR-Credit
  And Select Return Reasons
    And Click On Upload File button
  And Click Search button
  And Close browser
   
  
  
  
  @Regression9
 Scenario: Verify the Query Search for Unit Level Traceability  at product & Warranty information Using Product Unique Identifier with Service type as Exception- Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click on Product and Warrenty option
   And Click on ULT radio button
   And Enter Sold To through excel sheet
  And Select Service Type Exception
  And Select Remedy Credit
  And Select Return Reasons
   And Click On Upload File button
  And Click Search button
  And Close browser
   
  
   
  
  @Regression10
 Scenario: Verify the Query Search for Unit Level Traceability  at product & Warranty information Using Product Unique Identifier with Service type as Exception-NPR  Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click on Product and Warrenty option
   And Click on ULT radio button
   And Enter Sold To through excel sheet
  And Select Service Type Exception
And Select Remedy  NPR-Credit
  And Select Return Reasons
   And Click On Upload File button
  And Click Search button
  And Close browser
   
  
  
  @Regression11
 Scenario: Verify the Query Search for Unit Level Traceability  at product & Warranty information Using Product Unique Identifier with Service type as Technical- Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click on Product and Warrenty option
   And Click on ULT radio button
   And Enter Sold To through excel sheet
  And Select Service Type technical
  And Select Remedy Credit
  And Select Return Reasons
  And CLick On Product unique identifier radio button
  And Enter ULts
  And Click Search button
  And Close browser
   
  
  
@Regression12
Scenario: Verify the Query Search for Unit Level Traceability  at product & Warranty information Using Product Unique Identifier with Service type as Technical- NPR Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click on Product and Warrenty option
   And Click on ULT radio button
   And Enter Sold To through excel sheet
   And Select Service Type technical
   And Select Remedy  NPR-Credit
   And Select Return Reasons
   And CLick On Product unique identifier radio button
   And Enter ULts
   And Click Search button
   And Close browser
   
   
@Regression13
 Scenario: Verify the Query Search for Unit Level Traceability  at product & Warranty information Using Product Unique Identifier with Service type as Quality-  Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click on Product and Warrenty option
   And Click on ULT radio button
   And Enter Sold To through excel sheet
  And Select Service Type Quality
  And Select Remedy Credit
  And Select Return Reasons
  And CLick On Product unique identifier radio button
  And Enter ULts
  And Click Search button
  And Close browser
   
  
@Regression14
 Scenario:Verify the Query Search for Unit Level Traceability  at product & Warranty information Using Product Unique Identifier with Service type as Quality-  NPR Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click on Product and Warrenty option
   And Click on ULT radio button
   And Enter Sold To through excel sheet
  And Select Service Type Quality
  And Select Remedy  NPR-Credit
   And Select Return Reasons
   And CLick On Product unique identifier radio button
   And Enter ULts
   And Click Search button
   And Close browser
   
   
@Regression15
 Scenario: Verify the Query Search for Unit Level Traceability  at product & Warranty information Using Product Unique Identifier with Service type as Exception- Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click on Product and Warrenty option
   And Click on ULT radio button
   And Enter Sold To through excel sheet
  And Select Service Type Exception
  And Select Remedy Credit
  And Select Return Reasons
  And CLick On Product unique identifier radio button
  And Enter ULts
  And Click Search button
   And Close browser
   
@Regression16
 Scenario: Verify the Query Search for Unit Level Traceability  at product & Warranty information Using Product Unique Identifier with Service type as Exception-NPR Credit
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click on Product and Warrenty option
   And Click on ULT radio button
   And Enter Sold To through excel sheet
   And Select Service Type Exception
   And Select Remedy  NPR-Credit
   And Select Return Reasons
   And CLick On Product unique identifier radio button
   And Enter ULts
   And Click Search button
   And Close browser
   
   
   
   