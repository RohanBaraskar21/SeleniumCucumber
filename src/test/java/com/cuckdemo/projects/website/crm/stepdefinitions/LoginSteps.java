package com.cuckdemo.projects.website.crm.stepdefinitions;

import com.cuckdemo.common.CommonPageCRM;
import com.cuckdemo.keywords.WebUI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.cuckdemo.keywords.WebUI.getCurrentUrl;
import static com.cuckdemo.keywords.WebUI.verifyContains;

public class LoginSteps extends CommonPageCRM {

    @Given("User navigate to url {string}")
    public void userNavigateToUrl(String url) {
        //WebUI.getURL(url);
    }

    @When("User login with username {string} and password {string} valid")
    public void userLoginWithUsernameAndPasswordValid(String email, String password) {
        getSignInPage().signIn(email, password);
        getSignInPage().verifySignInSuccess();
    }

    @When("User login with username {string} and password {string} invalid")
    public void userLoginWithUsernameAndPasswordInvalid(String email, String password) {
        getSignInPage().signIn(email, password);
        getSignInPage().verifySignInFail();
    }

    @Then("The user redirect to Dashboard page")
    public void theUserRedirectToDashboardPage() {
        WebUI.waitForPageLoaded();
        verifyContains(getCurrentUrl(), getDashboardPage().pageUrl, "Can not redirect to the dashboard page.");

    }

    @Then("The user can not redirect to Dashboard page")
    public void theUserCanNotRedirectToDashboardPage() {
        WebUI.verifyElementNotPresent(getSignInPage().labelEmailError, "FAIL. User sign in successfully");
    }

    @And("The error message is displays")
    public void theErrorMessageIsDisplays() {
        WebUI.verifyElementPresent(getSignInPage().alertErrorMessage, "The error message does not display");
    }
}
