package com.cuckdemo.projects.website.cms.pages;

import com.cuckdemo.keywords.WebUI;
import org.openqa.selenium.By;

public class LoginPage {

    private By inputEmail = By.xpath("//input[@id='email']");
    private By inputPassword = By.xpath("//input[@id='password']");
    private By buttonLogin = By.xpath("//button[normalize-space()='Login']");
    private By buttonCopy = By.xpath("//button[normalize-space()='Copy']");

    public CommonPageCMS loginCMS(String email, String password) {
        WebUI.setText(inputEmail, email);
        WebUI.setText(inputPassword, password);
        WebUI.clickElement(buttonLogin);

        return new CommonPageCMS();
    }
}
