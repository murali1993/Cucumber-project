package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "resources\\featurefiles" },glue = {
		"Stepdefinition"},
tags={"@Login"},
plugin = {"html:target/cucumber-html-report"})
public class runnerfile {

}