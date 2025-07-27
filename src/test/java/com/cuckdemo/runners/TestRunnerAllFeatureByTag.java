package com.cuckdemo.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {
//                "com.cuckdemo.projects.website.crm.stepdefinitions",
//                "com.cuckdemo.projects.website.cms.stepdefinitions",
                "com.cuckdemo.projects.website.orangehrm.stepdefinitions",
//                "com.cuckdemo.projects.website.hrm.stepdefinitions",
                "com.cuckdemo.hooks"
        },
        plugin = {
                "com.cuckdemo.hooks.CucumberListener",
                "pretty",
                "html:target/cucumber-reports/cucumber-reports.html",
                "json:target/cucumber-reports/cucumber-reports.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = true,
        tags = "@Regression"
)

public class TestRunnerAllFeatureByTag extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
