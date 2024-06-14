package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "definitions",
        monochrome = true,
        plugin = { "html:target/cucumber.html" }
)

public class CustomRunner extends AbstractTestNGCucumberTests {

}
