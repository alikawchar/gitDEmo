import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"/Volumes/Untitled 2/eclipse/BDDFrameWork/logIn.feature"}
,tags= {"@Smoke, @Reg"})
public class runner {

}
