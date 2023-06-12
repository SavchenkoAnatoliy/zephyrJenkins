package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.BaseClass;

public class JiraCloudSteps extends BaseClass {

    private static final Logger logger = LoggerFactory.getLogger(JiraCloudSteps.class);
    @Given("user start to test")
    public void user_start_to_tes5t() {
        driver = new ChromeDriver();
        driver.get("https://google.com");
        logger.info("Messaggio di log");
        System.out.println("user start to test");
    }
    @When("user on test page")
    public void user_on_test_page5() {
        driver.get("https://siinfo.it");
        logger.info("Messaggio di log");
        System.out.println("user on test page");
    }
    @When("user click to the button")
    public void user_click_to_the_button() {
        logger.info("Messaggio di log");
        System.out.println("user click to the button");
    }
    @Then("in console stamp Anatoliy")
    public void in_console_stamp_anatoliy() {
        logger.info("Messaggio di log");
        System.out.println("in console stamp Anatoliy");
    }
}
