package automation;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(monochrome = false, plugin = { "pretty", "html:target/cucumber-reports",
		"json:target/cucumber.json" }, glue = "automation", features = "D:\\git\\Maven\\Maven\\src\\test\\resources\\feature\\Demo.feature")
public class Runner extends AbstractTestNGCucumberTests {

}
