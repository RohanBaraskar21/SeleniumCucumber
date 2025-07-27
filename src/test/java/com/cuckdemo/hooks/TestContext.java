package com.cuckdemo.hooks;

import com.cuckdemo.driver.DriverManager;
import com.cuckdemo.driver.TargetFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;

public class TestContext {

    private WebDriver driver;

    public TestContext() {
        driver = ThreadGuard.protect(new TargetFactory().createInstance());
        driver.manage().window().maximize();
        DriverManager.setDriver(driver);
    }

    // CMS page objects
    private com.cuckdemo.projects.website.cms.pages.LoginPage loginPage;
    private com.cuckdemo.projects.website.cms.pages.CommonPageCMS commonPageCMS;

    // OrangeHRM page objects
    private com.cuckdemo.projects.website.orangehrm.pages.LoginPage loginPageOrangeHRM;
    private com.cuckdemo.projects.website.orangehrm.pages.DashboardPage dashboardPageOrangeHRM;

    // CMS getters
    public com.cuckdemo.projects.website.cms.pages.LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new com.cuckdemo.projects.website.cms.pages.LoginPage();
        }
        return loginPage;
    }

    public com.cuckdemo.projects.website.cms.pages.CommonPageCMS getCommonPage() {
        if (commonPageCMS == null) {
            commonPageCMS = new com.cuckdemo.projects.website.cms.pages.CommonPageCMS();
        }
        return commonPageCMS;
    }

    // OrangeHRM getters
    public com.cuckdemo.projects.website.orangehrm.pages.LoginPage getLoginPageOrangeHRM() {
        if (loginPageOrangeHRM == null) {
            loginPageOrangeHRM = new com.cuckdemo.projects.website.orangehrm.pages.LoginPage();
        }
        return loginPageOrangeHRM;
    }

    public com.cuckdemo.projects.website.orangehrm.pages.DashboardPage getDashboardPage() {
        if (dashboardPageOrangeHRM == null) {
            dashboardPageOrangeHRM = new com.cuckdemo.projects.website.orangehrm.pages.DashboardPage();
        }
        return dashboardPageOrangeHRM;
    }

    public WebDriver getDriver() {
        return DriverManager.getDriver();
    }

}
