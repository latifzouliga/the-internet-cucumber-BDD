package com.dotdashcom.stepDefs;

import com.dotdashcom.pages.DropdownPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class DropdownStepDefs {

    DropdownPage dropdown = new DropdownPage();

    @When("user select {string} form the dropdown menu")
    public void user_select_form_the_dropdown_menu(String option) {

        dropdown.selectAnOption(option);

    }

    @Then("option1 and {string} is selected")
    public void option1_and_is_selected(String ExpectedOption) {
        String actualOptionText = dropdown.getFirstSelectedOption_AsString();
        Assert.assertEquals(ExpectedOption, actualOptionText);
    }

}
