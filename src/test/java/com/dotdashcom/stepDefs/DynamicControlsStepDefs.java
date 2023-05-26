package com.dotdashcom.stepDefs;

import com.dotdashcom.pages.DynamicContentPage;
import com.dotdashcom.pages.DynamicControlsPage;
import com.dotdashcom.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicControlsStepDefs {

    DynamicControlsPage dynamicControls = new DynamicControlsPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
    @Given("user clicks on the Remove Button and uses explicit wait")
    public void user_clicks_on_the_remove_button_and_uses_explicit_wait() {

        dynamicControls.btn_remove.click();
        wait.until(ExpectedConditions.invisibilityOf(dynamicControls.dynamicBar));


    }

    @Then("the checkbox is gone")
    public void the_checkbox_is_gone() {

        try {
            Assert.assertFalse(dynamicControls.checkbox.isDisplayed());
        }catch (Exception e){
            Assert.assertTrue(true);
            System.out.println("The check box is deleted from the page Which means this test is passed");
        }
        Assert.assertEquals("It's gone!", dynamicControls.message.getText());
    }


    @Given("clicks on Add Button and uses explicit wait")
    public void clicks_on_add_button_and_uses_explicit_wait() {

        dynamicControls.btn_remove.click();
        wait.until(ExpectedConditions.invisibilityOf(dynamicControls.dynamicBar));
        dynamicControls.btn_add.click();
        wait.until(ExpectedConditions.invisibilityOf(dynamicControls.dynamicBar));
    }
    @Then("the checkbox is present")
    public void the_checkbox_is_present() {
        Assert.assertTrue(dynamicControls.checkbox.isDisplayed());
    }


    @Given("clicks on the Enable Button and uses explicit wait")
    public void clicks_on_the_enable_button_and_uses_explicit_wait() {
        dynamicControls.btn_enable.click();
        wait.until(ExpectedConditions.invisibilityOf(dynamicControls.dynamicBar));

    }
    @Then("the text box is enabled")
    public void the_text_box_is_enabled() {
       Assert.assertTrue(dynamicControls.textBox.isEnabled());
    }


    @Given("clicks on the Disable Button and uses explicit wait")
    public void clicks_on_the_disable_button_and_uses_explicit_wait() {
        dynamicControls.btn_enable.click();
        wait.until(ExpectedConditions.invisibilityOf(dynamicControls.dynamicBar));

        dynamicControls.btn_disable.click();
        wait.until(ExpectedConditions.invisibilityOf(dynamicControls.dynamicBar));

    }
    @Then("the text box is disabled")
    public void the_text_box_is_disabled() {
        Assert.assertFalse(dynamicControls.textBox.isEnabled());
    }
}














