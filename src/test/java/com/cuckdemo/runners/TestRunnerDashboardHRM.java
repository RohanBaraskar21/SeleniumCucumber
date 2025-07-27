package com.cuckdemo.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/resources/features/Dashboard.feature",
        glue = {
                "com.cuckdemo.projects.website.crm.stepdefinitions",
                "com.cuckdemo.hooks"
        },
        plugin = {
                "com.cuckdemo.hooks.CucumberListener",
                "pretty",
                "html:target/cucumber-reports/TestRunnerDashboardHRM.html",
                "json:target/cucumber-reports/TestRunnerDashboardHRM.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true,
        tags = "@Regression or @Smoke"
)

public class TestRunnerDashboardHRM extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
