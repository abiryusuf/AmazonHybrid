package testing.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //tags = {"smoke"}, // what tags in the features files should be execute.
        //if I have 100 test case but I don't want to test last 10 test,
        // dryRun = true,// relationship between features file and step definition
                      //It helps to check that step definition  are missing from features file
        features = {"src/test/resources/features/AmazonCartPage.feature",// path of the features file where I write test case in gherkin (project documentation).
                    //"src/test/resources/features/AmazonLogin.feature",
                     "src/test/resources/features/AmazonSearch.feature",     },

        glue = {"com.amazon.framework.steps"},// path of the step definitions
        format = {"html: test-out put"},//HTML and Jason report

       // monochrome = true or false, // display the console out put and readable
        //strict =  true, it will check if any step is not defined in step definition
        plugin={
                "pretty:target/cucumber-test-report/cucumber-pretty.txt",
                "html:target/cucumber-test-report",
                "json:target/cucumber-test-report/cucumber-report.json",
                "junit:target/cucumber-test-report/test-report.xml",
                "json:target/test-report.json"
        }
)

public class TestRunner {

}
