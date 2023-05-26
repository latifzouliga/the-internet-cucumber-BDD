package com.dotdashcom.stepDefs;

import com.dotdashcom.pages.DynamicLoadingPage;
import com.dotdashcom.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingStepDefs {

    DynamicLoadingPage dynamicLoading = new DynamicLoadingPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @Given("clicks the start button and uses explicit wait")
    public void clicks_the_start_button_and_uses_explicit_wait() {
        dynamicLoading.btn_start.click();

    }
    @Then("{string} text is displayed.")
    public void text_is_displayed(String header) {
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoading.loadingBar));
        Assert.assertEquals(header, dynamicLoading.helloWordHeader.getText());
    }
}














