package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "AllFeatureFile/DataDrivenCucumberDemo.feature" }, 
        glue = { "com.StepDefination" },
        monochrome=true,
        dryRun=true

)

public class TestRunner {

}
