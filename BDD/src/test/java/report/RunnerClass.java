package report;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={".\\src\\test\\java\\featureFile"},glue={"stepDefinition"}
,dryRun=false,monochrome=true,plugin={"pretty","html:BDDreports\\Cucumberreports.html"})
public class RunnerClass extends AbstractTestNGCucumberTests
{

}
