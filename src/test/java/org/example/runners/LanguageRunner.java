package org.example.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@CucumberOptions(
        plugin = {"html:target/cucumber", "json:target/json-reports/cart.json"},
        glue = {"org.example"},
        features = {"src/test/resources/language.feature"}
)
@RunWith(Cucumber.class)
public class LanguageRunner {

}
