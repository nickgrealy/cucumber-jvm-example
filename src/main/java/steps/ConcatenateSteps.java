package steps;

import org.openqa.selenium.WebDriver;
import pageObjects.ConcatPage;

/**
 * Created by IntelliJ IDEA.
 * User: developer
 * Date: 6/15/12
 * Time: 11:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConcatenateSteps {

    private ConcatPage page;

    public ConcatenateSteps(ConcatPage page, WebDriver driver) {
        this.page = page;
        this.page.navigateTo(driver);
    }

    public void concatenate(String value1, String value2){
        page.inputForm(value1, value2);
        page.submitForm();
    }

    public String getConcatResult(){
        return page.getResultValue();
    }
}
