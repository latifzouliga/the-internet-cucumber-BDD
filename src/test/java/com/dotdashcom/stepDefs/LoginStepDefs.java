package com.dotdashcom.stepDefs;

import com.dotdashcom.pages.LandingPage;
import com.dotdashcom.pages.LoginPage;
import com.dotdashcom.utility.ConfigurationReader;
import com.dotdashcom.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    LandingPage landingPage = new LandingPage();

    @Given("user navigate to {string} page")
    public void user_in_login_page(String login) {
       loginPage.navigateTo(login);
    }

    @When("user enters credentials")
    public void user_enters_credentials() {
        loginPage.txt_username.sendKeys(ConfigurationReader.getProperty("Success.user.name"));
        loginPage.txt_password.sendKeys(ConfigurationReader.getProperty("Success.password"));
        loginPage.btn_login.click();

    }

    @Then("user is able to login successfully")
    public void user_is_able_to_login_successfully() {
       String actualLoginMessage = landingPage.loginMessage.getText().trim();
        String expectedLoginMessage = "You logged into a secure area!";

        Assert.assertTrue(actualLoginMessage.contains(expectedLoginMessage));

    }


    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) throws InterruptedException {


        loginPage.txt_username.sendKeys((username.equals("empty") ? "" : username));
        loginPage.txt_password.sendKeys((password.equals("empty") ? "" : password));
        loginPage.btn_login.click();

        Thread.sleep(2);

    }

    @Then("user is unable to login successfully")
    public void user_is_unable_to_login_successfully() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(landingPage.loginMessage));
        String actualInvalidLoginMessage = landingPage.loginMessage.getText();
        Assert.assertTrue(actualInvalidLoginMessage.contains("invalid!"));
    }
}















