package com.cuckdemo.projects.website.orangehrm.pages;

import com.cuckdemo.keywords.WebUI;
import org.openqa.selenium.By;

public class PIMPageOrangeHRM {
    private By pimHeader = By.xpath("//h6[text()='PIM']");
    private By addEmployeeButton = By.xpath("//button[.=' Add ']");

    public boolean isPIMPageDisplayed() {
        return WebUI.verifyElementVisible(pimHeader);
    }

    public void clickAddEmployee() {
        WebUI.clickElement(addEmployeeButton);
    }
}
