package com.cuckdemo.projects.website.orangehrm.pages;

import com.cuckdemo.keywords.WebUI;
import org.openqa.selenium.By;

public class LoginPage {

    private By dashboardHeader = By.xpath("//div[contains(@class,'oxd-topbar-header-title') and contains(.,'Dashboard')]");
    public boolean isDashboardDisplayed() {
        try {
            WebUI.waitForElementVisible(dashboardHeader, 30);
            return WebUI.verifyElementVisible(dashboardHeader);
        } catch (Exception e) {
            return false;
        }
    }

    private By usernameInput = By.xpath("//input[@name='username']");
    private By passwordInput = By.xpath("//input[@name='password']");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By loginError = By.xpath("(//span[contains(@class,'oxd-input-field-error-message') and text()='Required'])[1]");

    public LoginPage() {
    }

    public void enterUsername(String username) {
        WebUI.waitForElementVisible(usernameInput, 20);
        WebUI.clearText(usernameInput);
        WebUI.setText(usernameInput, username);
    }

    public void enterPassword(String password) {
        WebUI.waitForElementVisible(passwordInput, 20);
        WebUI.clearText(passwordInput);
        WebUI.setText(passwordInput, password);
    }

    public void clickLogin() {
        WebUI.clickElement(loginButton);
    }

    public String getLoginError() {
        try {
            WebUI.waitForElementVisible(loginError, 30);
            return WebUI.getTextElement(loginError);
        } catch (Exception e) {
            return "";
        }
    }

    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
}
