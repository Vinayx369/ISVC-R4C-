Feature: R4C Query search


@QuerySearchpart1TC01
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   #And Enter RMA Number Into Text field
   And Enter RMA Number "06414440"
   And Click on Search button
   And Click on RMANumber
   And Validate the RMANumber
   
@QuerySearchpart1TC02
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Enter Sold To "0000024100"
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC03
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Start Date as "Dec 5, 2024"
   And Select End Date as "Dec 15, 2024"
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC04
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Enter Customer PO Number "1055784D"
   And Click on Search button
   And Click on RMANumber

@QuerySearchpart1TC05
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Enter Return PO Number "1055784D"
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC06
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Enter Serial Number "BQWL94603660"
   And Click on Search button
   And Click on RMANumber   
   
@QuerySearchpart1TC07
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Enter VisId "BQWL94603660"
   And Click on Search button
   And Click on RMANumber 
   
@QuerySearchpart1TC08
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Enter MM "934885"
   And Click on Search button
   And Click on RMANumber 
   
@QuerySearchpart1TC09
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Enter CPN "XK3339"
   And Click on Search button
   And Click on RMANumber 
   
@QuerySearchpart1TC10
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Enter Credit Note Number "5623574"
   And Click on Search button
   And Click on RMANumber 
   
@QuerySearchpart1TC11
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Created by as Intel User "Intel User"
   And Click on Search button
   And Click on RMANumber 
   
@QuerySearchpart1TC12
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Created by as Customer "Amy r4c"
   And Click on Search button
   And Click on RMANumber 
   
@QuerySearchpart1TC13
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service Type as Technical
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC14
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service Type as Stock Rotation
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC15
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service Type as Quality
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC16
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service Type as Admin
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC17
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service Type as Exception
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC18
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service Type as Miscellaneous
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC19
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Remedy as Credit
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC20
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Remedy as NPRCredit
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC21
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Remedy as Exchange
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC22
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Remedy as Return Only
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC23
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service Type as Technical
   And Select Remedy as Credit
   And Select Return Reason as Failed at Customer Factory Site for Credit
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC24
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service Type as Technical
   And Select Remedy as Credit
   And Select Return Reason as Failed at End Customer for Credit
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC25
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service Type as Technical
   And Select Remedy as Credit
   And Select Return Reason as Technical Sample for Credit
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC26
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service Type as Technical
   And Select Remedy as Exchange
   And Select Return Reason as SWR Technical Line for Exchange
   And Click on Search button
   And Click on RMANumber   
   
@QuerySearchpart1TC27
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service Type as Technical
   And Select Remedy as Exchange
   And Select Return Reason as AWR Technical Line for Exchange
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC28
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service Type as Technical
   And Select Remedy as Exchange
   And Select Return Reason as SWR Technical Field for Exchange
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC29
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service Type as Technical
   And Select Remedy as Exchange
   And Select Return Reason as AWR Technical Field for Exchange
   And Click on Search button
   And Click on RMANumber
   
@QuerySearchpart1TC30
 Scenario: Query search
   Given User Launch Chrome browser
   When User open URL Web
   Then User Enter Email Address and pass PassWord Encripted
   And Click on login
   And Click Search Query
   And Select Service Type as Technical
   And Select Remedy as NPRCredit
   And Select Return Reason as Sample for NPRCredit
   And Click on Search button
   And Click on RMANumber
   