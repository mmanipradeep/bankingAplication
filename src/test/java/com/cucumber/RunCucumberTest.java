package com.cucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:/Users/mmani/Desktop/bankingAplication/src/test/resources/com/cucumber/cucumber.feature",plugin = {"pretty", "html:target/cucumber-report.html"})
public class RunCucumberTest {
}
