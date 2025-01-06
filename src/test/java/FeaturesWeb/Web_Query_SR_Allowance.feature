Feature: R4C Query SR Allowance


@Regression1
 Scenario: Verify the Standard Stock Rotation Allowance using Specific CMF Search 
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click On SR Allowance Option
   And Enter Sold To through excel sheet
   And Select return reason Standard stock rotation
   And Click Search button
   And Validate Reason should Standard stock rotation
   
   @Regression2
 Scenario: Verify the Promotional Stock Rotation Allowance using Specific CMF Search 
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click On SR Allowance Option
   And Enter Sold To through excel sheet
   And Select return reason Promotional stock rotation
   And Click Search button
   And Validate Reason should Promotional stock rotation
   
   
    @Regression3
 Scenario:Verify the Standard & Promotional Stock Rotation Allowance using Specific CMF Search 
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click On SR Allowance Option
   And Enter Sold To through excel sheet
   And Click Search button
  And Validate Reason should Standard stock rotation &Promotional stock rotation
   
   
   
@Regression4
 Scenario: Verify the Standard & Promotional Stock Rotation Allowance using All CMFs Search 
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click On SR Allowance Option
   And Click On ALL CMF Radio Button
   And Click Search button	
   And Validate Reason should Standard stock rotation &Promotional stock rotation
   
   
   @Regression5
 Scenario: Verify the Export to Excel functionality in SR Allowance using Specific CMF Search 
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click On SR Allowance Option
   And Enter Sold To through excel sheet
   And Select return reason Standard stock rotation
   And Click Search button
   And Click On Export To excel file button and validate
   
@Regression6
 Scenario: Verify the Export to Excel functionality in SR Allowance using All CMFs Search 
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click On SR Allowance Option
   And Click On ALL CMF Radio Button
   And Click Search button	
   And Click On Export To excel file button and validate
   
   
@Regression7
 Scenario: Verify the Description showing in the SR Allowance Result table 
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click On SR Allowance Option
   And Click On ALL CMF Radio Button
   And Click Search button
  And Validate the Discription	
   
   
   