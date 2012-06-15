package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;


public class ConcatPage {

    @FindBy(id = "v1")
    private WebElement inputV1;

    @FindBy(id = "v2")
    private WebElement inputV2;

    @FindBy(id = "concat")
    private WebElement btnConcat;

    @FindBy(id = "result")
    private WebElement inputResult;

    public void navigateTo(WebDriver driver) {
        File file = new File(ConcatPage.class.getResource("/concatenator.htm").getFile());
        driver.get("file://" + file.getAbsolutePath());
    }

    public void inputForm(String value1, String value2) {
        inputV1.sendKeys(value1);
        inputV2.sendKeys(value2);
    }

    public void submitForm() {
        btnConcat.click();
    }

    public String getResultValue() {
        return inputResult.getAttribute("value");
    }

}