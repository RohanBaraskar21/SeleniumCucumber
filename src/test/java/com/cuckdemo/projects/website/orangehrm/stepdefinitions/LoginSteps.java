package com.cuckdemo.projects.website.orangehrm.stepdefinitions;

import com.cuckdemo.hooks.TestContext;
import com.cuckdemo.keywords.WebUI;
import com.cuckdemo.projects.website.orangehrm.pages.LoginPage;
import com.cuckdemo.projects.website.orangehrm.pages.DashboardPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Then("user should see the Dashboard page - OrangeHRM")
    public void userShouldSeeDashboardPageOrangeHRM() {
        boolean isDisplayed = dashboardPage.isDashboardDisplayed();
        Assert.assertTrue(isDisplayed, "Dashboard page is not displayed");
    }

    @When("user clicks on PIM menu - OrangeHRM")
    public void userClicksOnPIMMenuOrangeHRM() {
        dashboardPage.goToPIM();
    }

    @Then("user should see the PIM page - OrangeHRM")
    public void userShouldSeePIMPageOrangeHRM() {
        // Add a robust check for PIM page, e.g., check for a header or unique element
        boolean isPIMVisible = WebUI.verifyElementVisible(By.xpath("//h6[text()='PIM']"));
        Assert.assertTrue(isPIMVisible, "PIM page is not displayed");
    }

    LoginPage loginPage;
    DashboardPage dashboardPage;

    public LoginSteps(TestContext testContext) {
        loginPage = testContext.getLoginPageOrangeHRM();
        dashboardPage = testContext.getDashboardPage();
    }

    @Given("User navigate to Login Page for OrangeHRM {string}")
    public void userNavigateToLoginPage(String url) {
        WebUI.openWebsite(url);
    }

    @When("user enter username {string} password {string}")
    public void userEnterUsernamePassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("click Login button - OrangeHRM")
    public void clickLoginButtonOrangeHRM() {
        loginPage.clickLogin();
    }

    @Then("user is redirected to the Dashboard page - OrangeHRM")
    public void userIsRedirectedToDashboardPageOrangeHRM() {
        dashboardPage.isDashboardDisplayed();
    }

    @Then("error message {string} is displayed")
    public void errorMessageIsDisplayed(String errorMsg) {
        loginPage.getLoginError();
    }

    @When("click Login button")
    public void click_login_button() {
        loginPage.clickLogin();
    }
}
