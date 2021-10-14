package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/CcmbrFrame/src/test/java/Features/AddPlaceValidation.feature",glue= {"stepDefinations"})
public class TestRunner {

}
