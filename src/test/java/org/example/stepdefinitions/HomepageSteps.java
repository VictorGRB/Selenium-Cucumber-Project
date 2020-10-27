package org.example.stepdefinitions;

import cucumber.api.java.en.Given;
import org.example.TestBase;

public class HomepageSteps extends TestBase {
    @Given("^I open the homepage$")
    public void iOpenTheHomepage() {
        openHomepage();
    }
}
