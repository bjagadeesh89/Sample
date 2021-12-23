package runners;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "src//test//resources//taggedFeatures//",
		glue = {"stepDef"},
		monochrome = true,
		dryRun=false,
//		tags="@RegressionTest"
//		tags="@RegressionTest or @SmokeTest"
//		tags="@RegressionTest and @SmokeTest"
//		tags="not @RegressionTest and not @SmokeTest"
		tags="@PhaseOne and @RegressionTest or @SmokeTest"
//		tags="@RegressionTest and not @PhaseOne"
//		tags="@PhaseOne and @SmokeTest or @PhaseTwo and @RegressionTest"
		)

public class TaggedRunner {

	


}
