@Regression
Feature: Login Test OrangeHRM

   Background: Navigate to OrangeHRM Login page
      Given User navigate to Login Page for OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

   @regression @device_Window_11 @author_rohan
   Scenario: Login success
      When user enter username "Admin" password "admin123"
      And click Login button - OrangeHRM
      Then user is redirected to the Dashboard page - OrangeHRM

   @regression @device_Window_11 @author_rohan
   Scenario: Login failure with invalid credentials
      When user enter username "invalid" password "invalid"
      And click Login button
      Then error message "Invalid credentials" is displayed

   @regression @device_Window_11 @author_rohan
   Scenario: Login failure with empty credentials
      When user enter username "" password ""
      And click Login button
      Then error message "Required" is displayed
