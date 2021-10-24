 package acceptance;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/** Acceptance Test */
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:acceptance", format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class AcceptanceTest { }
