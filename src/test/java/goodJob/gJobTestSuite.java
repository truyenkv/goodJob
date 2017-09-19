package goodJob;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(features="src/test/resources/features/")
//@CucumberOptions(plugin = {"pretty"}, strict = true)
@CucumberOptions(features = "classpath:features", plugin ={"pretty" ,"json:json/cucumber.json"})

public class gJobTestSuite {}
