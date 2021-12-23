package runners;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "@target/failed_scenarios.txt",
		glue = {"stepDef"},
		monochrome = true,
		dryRun=false,
		plugin = {"pretty"}
		)
public class RerunRunner {

	}

