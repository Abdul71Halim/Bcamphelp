package runner_files;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        dryRun = false,
        monochrome = true,
        features = {"src/test/resources/feature_files" },
        glue     = {"step_definitions", "com.bdd.learning.Hooks"},
        tags = "@TutorialsNinjaAddToCart or @TutorialsNinjaLogin or @TutorialsNinjaRegister or @TutorialsNinjaSearchProduct or @TutorialsNinjaLogout",
        		
       // tags = "@TutorialsNinjaAddToCart or @TutorialsNinjaLogin or @TutorialsNinjaRegister or @TutorialsNinjaSearchProduct or@TutorialsNinjaLogout",
        plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1.json"}

   )

public class Test_Runner_TestNG extends AbstractTestNGCucumberTests{

}
