package com.dotdashcom.stepDefs;

import com.dotdashcom.pages.DragAndDropPage;
import com.dotdashcom.utility.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropStepDefs {

    DragAndDropPage dragAndDrop = new DragAndDropPage();

    @When("user drags box A to box B")
    public void user_drags_box_a_to_box_b() {
        //TODO: need to figure out a way to make it pass the test
        Actions actions = new Actions(Driver.getDriver());
        actions.clickAndHold(dragAndDrop.boxA).moveToElement(dragAndDrop.boxB).release().perform();
    }

    @Then("the boxes should switch its places")
    public void the_boxes_should_switch_its_places() throws InterruptedException {
        Assert.assertEquals(dragAndDrop.boxA.getText(), "B");
        Assert.assertEquals(dragAndDrop.boxB.getText(), "A");
        Thread.sleep(3000);
    }



}
