package com.cuckdemo.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/LoginOrangeHRM.feature",
        glue = {"com.cuckdemo.projects.website.orangehrm.stepdefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports/LoginOrangeHRM.html", "json:target/cucumber-reports/LoginOrangeHRM.json"},
        monochrome = true
)
public class TestRunnerLoginOrangeHRM extends AbstractTestNGCucumberTests {
}
