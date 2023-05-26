package com.dotdashcom.stepDefs;

import com.dotdashcom.pages.ContextMenuPage;
import com.dotdashcom.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuStepDefs {

    ContextMenuPage contextMenuPage = new ContextMenuPage();

    @When("user right click the box")
    public void user_right_click_the_box(){
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(contextMenuPage.box).perform();

    }

    @Then("JavaScript will be triggered")
    public void java_script_will_be_triggered() {
        Alert alert = Driver.getDriver().switchTo().alert();
        String alertText = alert.getText();
        Assert.assertEquals("You selected a context menu", alertText);

        alert.accept();
    }
}













