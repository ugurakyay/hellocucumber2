package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber",
                    "html:target/cucumber-report/",
                    "json:target/cucumber.json",
                    "junit:target/cucumber-results.xml"
                },
        features = {"src/test/resources/FeatureFile"},
        glue={"stepdefinition"},
        monochrome = true
)
public class RunCucumberTest {

    @BeforeClass
    public static void SetReportConfig(){
        //ExtentProperties property = ExtentProperties.INSTANCE;
        //property.setReportPath("./Report/Report.html");
    }

    @AfterClass
    public static void setConfigration(){
        //Reporter.loadXMLConfig("./ConfigFile/extent-config.xml"); "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    }
}
