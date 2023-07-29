package StepDefnition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= "StepDefnition",
plugin={"pretty", "html:target/Htmlreports"})
	
public class TestRunner {

}
