package com.cuckdemo.projects.website.orangehrm.pages;

import com.cuckdemo.keywords.WebUI;
import org.openqa.selenium.By;

public class LoginPageOrangeHRM {
    private By inputUsername = By.name("username");
    private By inputPassword = By.name("password");
    private By buttonLogin = By.cssSelector("button[type='submit']");
    private By loginError = By.cssSelector(".oxd-alert-content-text");

    public void login(String username, String password) {
        WebUI.setText(inputUsername, username);
        WebUI.setText(inputPassword, password);
        WebUI.clickElement(buttonLogin);
    }

    public String getLoginError() {
        return WebUI.getTextElement(loginError);
    }
}
