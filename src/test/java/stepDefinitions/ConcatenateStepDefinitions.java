package stepDefinitions;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.ConcatPage;
import steps.ConcatenateSteps;

import static junit.framework.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * User: developer
 * Date: 6/15/12
 * Time: 11:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConcatenateStepDefinitions {

    private WebDriver driver;
    private ConcatenateSteps concatSteps;

    @Before
    public void setup(){
        driver = new FirefoxDriver();
    }

    @After
    public void teardown(){
        driver.close();
    }

    @Given("^a concatenate facility$")
    public void a_concatenate_facility() throws Throwable {
        concatSteps = new ConcatenateSteps(PageFactory.initElements(driver, ConcatPage.class), driver);
    }

    @When("^I concatenate \"([^\"]*)\" and \"([^\"]*)\"$")
    public void I_concatenate_and(String value1, String value2) throws Throwable {
        concatSteps.concatenate(value1, value2);
    }

    @Then("^the result should be \"([^\"]*)\"$")
    public void the_result_should_be(String expectedResult) throws Throwable {
        assertEquals(expectedResult, concatSteps.getConcatResult());
    }

}
