package com.dotdashcom.stepDefs;

import com.dotdashcom.pages.DynamicContentPage;
import com.dotdashcom.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DynamicContentStepDefs {

    DynamicContentPage dynamicContent = new DynamicContentPage();
    int testsLengthAfterRefresh;
    int textsLengthBeforeRefresh;
    @When("user refresh the webpage {string} of times")
    public void user_refresh_the_webpage_of_times(String string) {

        String str = string;
        int text1_beforeRefresh = dynamicContent.getParagraphAsString(1).length();
        int text2_beforeRefresh = dynamicContent.getParagraphAsString(2).length();
        int text3_beforeRefresh = dynamicContent.getParagraphAsString(3).length();

        textsLengthBeforeRefresh = text1_beforeRefresh + text2_beforeRefresh + text3_beforeRefresh;

        Driver.getDriver().navigate().refresh();
       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


        int text1_afterRefresh = dynamicContent.getParagraphAsString(1).length();
        int text2_afterRefresh = dynamicContent.getParagraphAsString(2).length();
        int text3_afterRefresh = dynamicContent.getParagraphAsString(3).length();

        testsLengthAfterRefresh = text1_afterRefresh+text2_afterRefresh+text3_afterRefresh;


    }
    @Then("page content should change on each refresh")
    public void page_content_should_change_on_each_refresh() {
        Assert.assertNotEquals(textsLengthBeforeRefresh, testsLengthAfterRefresh);
    }
}
