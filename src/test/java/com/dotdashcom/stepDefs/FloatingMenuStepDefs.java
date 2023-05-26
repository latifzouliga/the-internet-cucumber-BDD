package com.dotdashcom.stepDefs;

import com.dotdashcom.pages.FloatingMenuPage;
import com.dotdashcom.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class FloatingMenuStepDefs {

    FloatingMenuPage floatingMenu = new FloatingMenuPage();
    @When("user scroll the page")
    public void user_scroll_the_page() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(floatingMenu.elementalSelenium);

    }
    @Then("the floating menu is still displayed")
    public void the_floating_menu_is_still_displayed() {
        Assert.assertTrue(floatingMenu.floatingMenu.isDisplayed());
    }
}
