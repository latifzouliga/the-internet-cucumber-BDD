package com.dotdashcom.stepDefs;

import com.dotdashcom.pages.CheckBoxPage;
import com.dotdashcom.utility.ConfigurationReader;
import com.dotdashcom.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CheckboxStepDefs {

    CheckBoxPage checkBoxPage = new CheckBoxPage();

//    @Given("user navigate to {string} page")
//    public void user_navigate_to_page(String checkboxPage) {
//        checkBoxPage.navigateTo(checkboxPage);
//    }

    @When("user checked checkbox1 and checkbox2")
    public void user_checked_checkbox1_and_checkbox2() {
       if (!checkBoxPage.checkbox1.isSelected()){
           checkBoxPage.checkbox1.click();
       }


       if (!checkBoxPage.checkbox2.isEnabled()){
           checkBoxPage.checkbox2.click();
       }


    }
    @Then("checkboxes should be checked")
    public void checkboxes_should_be_checked() {

        Assert.assertTrue(checkBoxPage.checkbox1.isSelected());
        Assert.assertTrue(checkBoxPage.checkbox2.isSelected());

    }


    @When("user unchecked checkbox1 and checkbox2")
    public void user_unchecked_checkbox1_and_checkbox2() {
        if (checkBoxPage.checkbox1.isSelected()){
            checkBoxPage.checkbox1.click();
        }


        if (checkBoxPage.checkbox2.isEnabled()){
            checkBoxPage.checkbox2.click();
        }
    }

    @Then("checkboxes should be unchecked")
    public void checkboxes_should_be_unchecked() {
        Assert.assertFalse(checkBoxPage.checkbox1.isSelected());
        Assert.assertFalse(checkBoxPage.checkbox2.isSelected());

    }
}














