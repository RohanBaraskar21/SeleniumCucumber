
package com.cuckdemo.projects.website.orangehrm.pages;

import com.cuckdemo.keywords.WebUI;
import org.openqa.selenium.By;

public class DashboardPage {
    private By dashboardHeader = By.xpath("//div[contains(@class,'oxd-topbar-header-title') and contains(.,'Dashboard')]");
    private By pimMenu = By.xpath("//span[text()='PIM']");

    public DashboardPage() {
    }

    public boolean isDashboardDisplayed() {
        try {
            WebUI.waitForPageLoaded();
            WebUI.waitForElementVisible(dashboardHeader, 20);
            return WebUI.verifyElementVisible(dashboardHeader);
        } catch (Exception e) {
            return false;
        }
    }

    public void goToPIM() {
        WebUI.clickElement(pimMenu);
    }
}
