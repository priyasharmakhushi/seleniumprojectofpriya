package stepdefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\features\\AutomationLoginapp.feature"},
                  glue={"stepdefinition"})
public class Runnerfile {

}
