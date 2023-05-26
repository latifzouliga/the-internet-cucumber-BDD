package com.dotdashcom.stepDefs;

import com.dotdashcom.pages.IframePage;
import com.dotdashcom.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class IframeStepDefs {

    IframePage iframePage = new IframePage();

    @When("user switches to Iframe and types {string}")
    public void user_switches_to_iframe_and_types(String text) {
        iframePage.closeIconButton.click();


        Driver.getDriver().switchTo().frame(iframePage.iframeBox);
        iframePage.txt_frame.clear();

        iframePage.txt_frame.sendKeys(text);
    }
    @Then("the typed text should be {string}")
    public void the_typed_text_should_be(String expectedText) {

        String actualText = iframePage.txt_frame.getText();
        System.out.println("actualText = " + actualText);
        Assert.assertEquals(expectedText, actualText);
    }


}
