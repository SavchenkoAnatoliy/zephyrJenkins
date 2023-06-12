package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.BaseClass;

public class ApplicationHooks extends BaseClass {


    @Before
    public void setUp() {
        System.out.println("I'm in BEFORE");
    }

    @After
    public void shutDown(Scenario scenario){
        System.out.println("I'm in AFTER");
        if (scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "ScreenOfMyLife");
        }else {
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "ScreenOfYourLife");
        }
    }

}
