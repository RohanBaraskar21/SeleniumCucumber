@Regression
Feature: PIM Test OrangeHRM

   Background: Navigate to OrangeHRM Login page
      Given User navigate to Login Page for OrangeHRM "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
      When user enter username "Admin" password "admin123"
      And click Login button - OrangeHRM
      Then user is redirected to the Dashboard page - OrangeHRM

   @regression @device_Window_11 @author_rohan
   Scenario: Navigate to PIM page from Dashboard
      When user clicks on PIM menu - OrangeHRM
      Then user should see the PIM page - OrangeHRM
