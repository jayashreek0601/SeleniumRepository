package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepdefinition.BaseClass;

@CucumberOptions(features="src/main/java/feature/createLead.feature",glue="stepdefinition",publish=true)

public class RunnerClass extends AbstractTestNGCucumberTests{
	
}
