package com.TestRunner.org;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.Base_Class.org.Base_Class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\orange.feature", glue = "com.StepDefinition.org", plugin = {
		"html:Report/cucumber.html", "json:Report/Cucumber.json", "pretty" }, dryRun = true)

public class Test_Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = Base_Class.launchBrowser("chrome");
	}

	@AfterClass
	public static void tearDown() {
		Base_Class.closeBrowser();
	}
}
