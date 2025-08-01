package com.cuckdemo.common;

import com.cuckdemo.keywords.WebUI;
import com.cuckdemo.projects.website.crm.pages.Clients.ClientPageCRM;
import com.cuckdemo.projects.website.crm.pages.Dashboard.DashboardPageCRM;
import com.cuckdemo.projects.website.crm.pages.Projects.ProjectPageCRM;
import com.cuckdemo.projects.website.crm.pages.SignIn.SignInPageCRM;
import org.openqa.selenium.By;

public class CommonPageCRM {

    public SignInPageCRM signInPage;
    public DashboardPageCRM dashboardPage;
    public ClientPageCRM clientPage;
    public ProjectPageCRM projectPage;

    public By dropdownAccount = By.xpath("//a[@id='user-dropdown']//span[2]");
    public By buttonSignOut = By.xpath("//a[normalize-space()='Sign Out']");

    public SignInPageCRM signOut() {
        WebUI.clickElement(dropdownAccount);
        WebUI.clickElement(buttonSignOut);
        return new SignInPageCRM();
    }

    public SignInPageCRM getSignInPage() {
        if (signInPage == null) {
            signInPage = new SignInPageCRM();
        }
        return signInPage;
    }

    public DashboardPageCRM getDashboardPage() {
        if (dashboardPage == null) {
            dashboardPage = new DashboardPageCRM();
        }
        return dashboardPage;
    }

    public ClientPageCRM getClientPage() {
        if (clientPage == null) {
            clientPage = new ClientPageCRM();
        }
        return clientPage;
    }

    public ProjectPageCRM getProjectPage() {
        if (projectPage == null) {
            projectPage = new ProjectPageCRM();
        }
        return projectPage;
    }

}
