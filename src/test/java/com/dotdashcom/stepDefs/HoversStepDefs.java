package com.dotdashcom.stepDefs;

import com.dotdashcom.pages.HoversPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class HoversStepDefs {

    HoversPage hoversPage = new HoversPage();
    List<String> imagesInfo = new ArrayList<>();

    @When("user does a mouse hover on each image")
    public void user_does_a_mouse_hover_on_each_image() {

        for (int i = 1; i <= 3; i++) {
            hoversPage.hoverOverImage(i);
            String imageInfoAsString = hoversPage.getImageInfo(i);
            imagesInfo.add(imageInfoAsString);

        }
    }

    @Then("the additional information is displayed for each image")
    public void the_additional_information_is_displayed_for_each_image() {

        int k = 1;
        for (String actualImageInfo : imagesInfo) {

            System.out.println("actualImageInfo = " + actualImageInfo);
            System.out.println("expectedImageInfo = " + "name: user" + k);

            Assert.assertEquals("name: user" + k, actualImageInfo);

            k++;

        }
    }
}














